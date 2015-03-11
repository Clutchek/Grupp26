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
    private static List<CategoryPanel> categoriePanels;
    
    public CategoryController(JPanel sideCategoriePanel){
        categoriePanels = new ArrayList<CategoryPanel>();
        this.sideCategoriePanel = sideCategoriePanel;
        initializeViews();
    }

    public static void resetCategoriePanels() {
        for(CategoryPanel panel : categoriePanels){
            panel.reset();
        }
    }
    
    //public static 
    
    public void initializeViews(){
        CategoryPanel meatFishPanel = new CategoryPanel(getMeatFish());
        categoriePanels.add(meatFishPanel);
        sideCategoriePanel.add(meatFishPanel);
        
        CategoryPanel fridgePanel = new CategoryPanel(getFridge());
        categoriePanels.add(fridgePanel);
        sideCategoriePanel.add(fridgePanel);
        
        CategoryPanel greenPanel = new CategoryPanel(getGreen());
        categoriePanels.add(greenPanel);
        sideCategoriePanel.add(greenPanel);
        
        CategoryPanel ricePastaPanel = new CategoryPanel(getRicePasta());
        categoriePanels.add(ricePastaPanel);
        sideCategoriePanel.add(ricePastaPanel);
        
        CategoryPanel breadPanel = new CategoryPanel(getBakeBread());
        categoriePanels.add(breadPanel);
        sideCategoriePanel.add(breadPanel);
        
        CategoryPanel drinkPanel = new CategoryPanel(getDrinks());
        categoriePanels.add(drinkPanel);
        sideCategoriePanel.add(drinkPanel);
    }
    public Category getMeatFish(){
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
        Category meatFish = new Category("Kött/Fisk", meatFishList);
        return meatFish;
    }
    public Category getBakeBread(){
        SubCategory bread = new SubCategory("Bröd"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.BREAD);
            }
            
        };
        SubCategory flour = new SubCategory("Mjöl/Socker/Salt"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.FLOUR_SUGAR_SALT);
            }
            
        };
        List<SubCategory> breadList = new ArrayList<SubCategory>();
        breadList.add(bread);
        breadList.add(flour);
        Category bakeBread = new Category("Bakning och Bröd", breadList);
        return bakeBread;
    }
    public Category getGreen(){
        SubCategory fruit = new SubCategory("Frukt"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.FRUIT);
            }
        };
        SubCategory vegetables = new SubCategory("Grönsaker"){
            @Override
            public List<Product> getProducts(){
                List<Product> temp = new ArrayList<Product>();
                temp.addAll(IMatDataHandler.getInstance().getProducts(ProductCategory.CABBAGE));
                temp.addAll(IMatDataHandler.getInstance().getProducts(ProductCategory.HERB));
                return temp;
                        
            }
        };
        SubCategory nutsAndSeeds = new SubCategory("Nötter och frön"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.NUTS_AND_SEEDS);
            }
        };
        SubCategory potatoRice = new SubCategory("Potatis och ris"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.POTATO_RICE);
            }
        };
        SubCategory root = new SubCategory("Rotfrukter"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.ROOT_VEGETABLE);
            }
        };
        List<SubCategory> greenList = new ArrayList<SubCategory>();
        greenList.add(fruit);
        greenList.add(vegetables);
        greenList.add(nutsAndSeeds);
        greenList.add(potatoRice);
        greenList.add(root);
        Category green = new Category("Frukt och Grönt", greenList);
        return green;
    }
    public Category getRicePasta(){
        SubCategory pasta = new SubCategory("Pasta"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.PASTA);
            }
        };
        SubCategory potatoRice = new SubCategory("Potatis och Ris"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.POTATO_RICE);
            }
        };
        List<SubCategory> pastaList = new ArrayList<SubCategory>();
        pastaList.add(pasta);
        pastaList.add(potatoRice);
        Category pastaRice = new Category("Pasta/Ris", pastaList);
        return pastaRice;
    }
    public Category getFridge(){
        SubCategory diaries = new SubCategory("Mjölkproducter"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.DAIRIES);
            }
        };
        SubCategory coldDrinks = new SubCategory("Kalla drycker"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.COLD_DRINKS);
            }
        };
        List<SubCategory> fridgeList = new ArrayList<SubCategory>();
        fridgeList.add(diaries);
        fridgeList.add(coldDrinks);
        Category fridgeItems = new Category("Kylvaror", fridgeList);
        return fridgeItems;
    }
    public Category getDrinks(){
        SubCategory coldDrinks = new SubCategory("Kalla drycker"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.COLD_DRINKS);
            }
        };
        SubCategory hotDrinks = new SubCategory("Varma drycker"){
            @Override
            public List<Product> getProducts(){
                return IMatDataHandler.getInstance().getProducts(ProductCategory.HOT_DRINKS);
            }
        };
        List<SubCategory> drinkList = new ArrayList<SubCategory>();
        drinkList.add(coldDrinks);
        drinkList.add(hotDrinks);
        Category drinkItems = new Category("Drycker", drinkList);
        return drinkItems;
    }
}
