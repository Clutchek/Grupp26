/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Alexander
 */
public class Category {
    private String name;
    private List<SubCategory> subCategories;
    private boolean chosen;
    
    
    
    public Category(String s, List<SubCategory> subCategories){
        name = s;
        this.subCategories = subCategories;
        chosen = false;
    }
    
    //Might get changed later for getSubcategories
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<Product>();
        for(SubCategory subCategorie : subCategories){
            for(Product p: subCategorie.getProducts()){
                products.add(p);
            }
        }
        return products;
    }
    
    public void choose(){
        chosen = true;
    }
    public void unChoose(){
        chosen = false;
    }
    public boolean isChosen(){
        return chosen;
    }
    public List<SubCategory> getSubCategories(){
        return subCategories;
    }
    public String getName(){
        return name;
    }
    
}
