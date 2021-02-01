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

public interface MovieInterface {
    
    void create(Movie m) throws CrudFormException;
    void edit(Movie m) throws CrudFormException;
    void delete(Movie m) throws CrudFormException;
    List <Movie> findAll() throws CrudFormException;
    Movie findByID(Integer ID) throws CrudFormException;
    
}
