
package Dao;

import Modelo.Producto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Martin Kanayet
 */


public class ProductoDAO {

    public ProductoDAO() {
        
    }

   
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public void crear(Producto object) {
        System.out.println("sii");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public boolean eliminar(Producto object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try {
            em.remove(object);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }

    public boolean actualizar(Producto object, Producto newObject) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try {
            object = leer(object);
            object.setNombre(newObject.getNombre());
            object.setMarca(newObject.getMarca());
            em.merge(object);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }

    public Producto leer(Producto par) {
        EntityManager em =emf.createEntityManager();
        Producto usuario = null;
        Query q = em.createQuery("SELECT u FROM Usuario u "
                +"where u.nombre LIKE :nombre"+
                " AND u.password LIKE :password")
                                 .setParameter("nombre", par.getNombre())
                                 .setParameter("marca", par.getMarca());
        boolean ret = false;
        try{
            usuario = (Producto) q.getSingleResult();
        }catch(NonUniqueResultException e){
            usuario = (Producto) q.getResultList().get(0);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            em.close();
            return usuario;
        }
    }





}
