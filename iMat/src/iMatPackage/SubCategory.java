/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Alexander
 */
public abstract class SubCategory {
    private String name;
    
    protected SubCategory(String s){
        name = s;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract List<Product> getProducts();
    
}
