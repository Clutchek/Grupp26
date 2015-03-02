/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.*;

/**
 * Class that represents a model of the Store itself.
 * @author aleklo
 */
public class StoreModel {
    private static IMatDataHandler backend;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    public StoreModel(){
        backend = IMatDataHandler.getInstance();
        pcs = new PropertyChangeSupport(this);
    }
    
    public List<Product> getProducts(ProductCategory pc){
        return backend.getProducts(pc);
    }
    
    public List<Product> findProducts(String s){
        return backend.findProducts(s);
    }
    
    public ShoppingCart getShoppingCart(){
        return backend.getShoppingCart();
    }
    
    public static List<Order> getOrders(){
        return backend.getOrders();
    }
    
    public ImageIcon getImageIcon(Product p){
        return backend.getImageIcon(p);
    }
    
    public ImageIcon getImageIcon(Product p, int widht, int height){
      return backend.getImageIcon(p, widht, height);
    }
    
    public ImageIcon getImageIcon(Product p, Dimension d){
        return backend.getImageIcon(p, d);
    }
    
    public User getUser(){
        return backend.getUser();
    }
    
    public CreditCard getCreditCard(){
        return backend.getCreditCard();
    }
    
    public Customer getCustomer(){
        return backend.getCustomer();
    }
    
    public void addObserver(PropertyChangeListener p){
        pcs.addPropertyChangeListener(p);
    }
    
    public void removeObserver(PropertyChangeListener p){
        pcs.removePropertyChangeListener(p);
    }
    
}
