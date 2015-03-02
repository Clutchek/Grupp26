package iMatPackage;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class Main {
    
    public static void main(String[] args){
        StoreModel model = null;
        MainController controller = new MainController(model);
        StoreView storeview = new StoreView();
        controller.add(storeview);
        controller.pack();
        controller.setVisible(true);
    }
}
