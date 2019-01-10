/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C0420817
 */
import javax.swing.JFrame;

public class FrenchFlagViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FrenchFlagComponent component = new FrenchFlagComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}

