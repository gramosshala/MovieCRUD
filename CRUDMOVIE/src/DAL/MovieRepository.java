/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;



/**
 *
 * @author Lenovo
 */

import BLL.Movie;
import java.util.List;

public class MovieRepository extends EntMngClass implements MovieInterface {

    @Override
    public void create(Movie m) throws CrudFormException {
    try{
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
    }catch(Exception e){
        throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Movie m) throws CrudFormException {
      try{
          em.getTransaction().begin();
          em.merge(m);
          em.getTransaction().commit();
      }catch(Exception e){
          throw new CrudFormException("Msg \n" + e.getMessage());
      }
    }

    @Override
    public void delete(Movie m) throws CrudFormException {
      try{
          em.getTransaction().begin();
          em.remove(m);
          em.getTransaction().commit();
      }catch(Exception e){
          throw new CrudFormException("Msg \n" + e.getMessage());
      }
    }

    @Override
    public List<Movie> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Movie.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException(e.getMessage());
        }
    }

    @Override
    public Movie findByID(Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
