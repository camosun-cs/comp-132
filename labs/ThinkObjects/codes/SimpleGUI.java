
package Lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;



/**
 * @author shohreh
 */
public class SimpleGUI extends JFrame{
    
        private int redValue, greenValue, blueValue;
        private Color chosenColor = null;
 
        private JSlider jslRed = new JSlider(0,255);
        private JSlider jslGreen = new JSlider(0,255);
        private JSlider jslBlue = new JSlider(0,255);
        
        private JButton ok = new JButton("OK");
        private JButton cancel = new JButton("Cancel");
        
        JButton  button;
        
        JPanel displayArea;
        Container box2;
        
    public  void createGUI(){
        
        Container box1 = getContentPane();
         // SetFlowLayout, aliged left with horizontal gap of 10
           // and Vertical gap of 20 between components
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,20);  
//        GridLayout grid = new GridLayout (1,2,50,50);
        box1.setLayout(flow);
        
        // Group sliders for selecting red, green and blue colors
         JPanel jpSlider = new JPanel();
         
         jpSlider.setLayout(new GridLayout(3,0));    
         jpSlider.add(jslRed);
         jpSlider.add(jslGreen);
         jpSlider.add(jslBlue);
         
         // Group labels 
        JPanel jpLabels = new JPanel();
        
        jpLabels.setLayout(new GridLayout(3,0));
        JLabel l1 = new JLabel("red");
        JLabel l2 = new JLabel("Green");
        JLabel l3 = new JLabel("Blue");
        jpLabels.add(l1);
        jpLabels.add(l2);
        jpLabels.add(l3);
        
        // Group two buttons ok and cancel
        JPanel jpButtons = new JPanel();
        
        jpButtons.add(ok);
        jpButtons.add(cancel);
        
        // Group jpLabels and jpSliders
        JPanel colorSelector = new JPanel();
        
        colorSelector.setLayout(new BorderLayout());
        colorSelector.setBorder(BorderFactory.createTitledBorder("Secect Color"));
        colorSelector.add(jpLabels, BorderLayout.WEST);
        colorSelector.add(jpSlider, BorderLayout.CENTER);
        colorSelector.add(jpButtons, BorderLayout.SOUTH);
        colorSelector.setBackground(Color.red);
        box1.setBounds(50, 50, 200, 200);
        box1.add( colorSelector);
        
        // get the dimension of the first box1 and 
      //  Dimension first =box1.getSize();
       Dimension first =colorSelector.getSize();
        
         box2 = getContentPane();

         displayArea = new JPanel();
        
        
        displayArea.setBackground(Color.orange);
       // displayArea.setPreferredSize(first);
        displayArea.setPreferredSize(new Dimension (200,200));
    
        button = new JButton("Display Area");
        // where are we adding the button 
        displayArea.add(button);
      //  button.addActionListener(this);
         box2.setSize(first);
         box2.add(displayArea);
   }
}
