/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author Alexander
 */
public class CategoryController {


    private JPanel sideCategoriePanel;
    private JPanel topCategoriePanel;
    private static List<CategoryPanel> categoriePanels;
    
    public CategoryController(JPanel sideCategoriePanel, JPanel topCategoriePanel){
        this.sideCategoriePanel = sideCategoriePanel;
        this.topCategoriePanel = topCategoriePanel;
    }

    public static void resetCategoriePanels() {
        for(CategoryPanel panel : categoriePanels){
            panel.reset();
        }
    }
    
    //public static 
    
    public void initializeViews(){
        SubCategory meat = new SubCategory("Kött"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.MEAT);
            }
            
        };
        SubCategory fish = new SubCategory("Fisk"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.FISH);
            }
            
        };
        List<SubCategory> meatFishList = new ArrayList<SubCategory>();
        meatFishList.add(meat);
        meatFishList.add(fish);
        Category MeatFish = new Category("Kött/Fisk", meatFishList);
        CategoryPanel meatFishPanel = new CategoryPanel(MeatFish);
        sideCategoriePanel.add(meatFishPanel);
        
        SubCategory bread = new SubCategory("Bröd"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.BREAD);
            }
            
        };
        List<SubCategory> breadList = new ArrayList<SubCategory>();
        breadList.add(bread);
        Category bakeBread = new Category("Bakning och Bröd", breadList);
        CategoryPanel breadPanel = new CategoryPanel(bakeBread);
        sideCategoriePanel.add(breadPanel);
        
    }
    
    
}
