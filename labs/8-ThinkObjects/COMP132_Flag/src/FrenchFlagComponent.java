/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C0420817
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class FrenchFlagComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      FrenchFlag flag = new FrenchFlag(100, 100, 90);
      flag.draw(g2);
   }
}

