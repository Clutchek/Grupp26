package iMatPackage;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

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
    
    public static void main(String[] args) {
        StoreModel model = null;
        MainController controller = new MainController(model);
        StoreView storeview = new StoreView();
        controller.add(storeview);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            /*for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } 
        catch (UnsupportedLookAndFeelException e) {
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.NimbusLookAndFeel");
        }
        catch (ClassNotFoundException e) {
           //UIManager.setLookAndFeel("javax.swing.plaf.metal.NimbusLookAndFeel");
        }
        catch (InstantiationException e) {
           //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch (IllegalAccessException e) {
           //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        controller.pack();
        controller.setVisible(true);
    }
}
