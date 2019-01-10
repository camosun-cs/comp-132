/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C0420817
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class FrenchFlag
{
   private int xLeft;
   private int yTop;
   private int width;
   
   public FrenchFlag(int x, int y, int aWidth)
   {
      xLeft = x;
      yTop = y;
      width = aWidth;
   }

   public void draw(Graphics2D g2)
   {
      Rectangle leftRectangle = new Rectangle(100,100,30,60);
      Rectangle rightRectangle = new Rectangle(160,100,30,60);
      Rectangle middleRectangle = new Rectangle(130,100,30,60);
      
      g2.setColor(Color.BLUE);
      g2.fill(leftRectangle);
      g2.setColor(Color.RED);
      g2.fill(rightRectangle);
      g2.setColor(Color.WHITE);
      g2.fill(middleRectangle);
   }
}
