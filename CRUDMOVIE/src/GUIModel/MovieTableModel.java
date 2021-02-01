/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Movie;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class MovieTableModel extends AbstractTableModel {
    
    List <Movie> list;
    String [] cols = {"MovieID" , "Movie Description"};
    
    public MovieTableModel(){}
    
    public MovieTableModel(List<Movie> list){
        this.list=list;
    }
    
    public void addList(List<Movie> list){
        this.list=list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
     return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Movie getMovie(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Movie m = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return m.getMovieID();
            case 1:
                return m.getMovieDescription();
            default:
                return null;
        }
    }
}
