package Lab8;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author shohreh
 */
public class Calculator extends JFrame implements ActionListener {
 

   private JPanel panel;
   private JButton button, b2,b3;
   private JTextField num1, num2,result;
   private JLabel equalLabel;
   private JButton plus;
   private JButton minus;
   
    public void createGUI(){
       // tells the program to terminate when the frame is closed.     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container box = this.getContentPane();
        box.setLayout(new FlowLayout(FlowLayout.CENTER,10,20) );
   
        
   
        panel = new JPanel();
        panel.setBackground(new Color(255, 102, 0));
        panel.setPreferredSize(new Dimension (200,100));
        box.add(panel);
        
        // organizing the panel 3 
        num1 = new JTextField(7);
        panel.add(num1);
    
        plus = new JButton( " Plus ");
        panel.add(plus);
        plus.addActionListener(this);
    
        minus = new JButton( " - ");
        panel.add(minus);
        minus.addActionListener(this);
    
        num2 = new JTextField(7);
        panel.add(num2);
     
        equalLabel = new JLabel( " = ");
        panel.add(equalLabel);
    
        result = new JTextField(7);
        panel.add(result);
    
    
    }// end of create GUI
    
   @Override
    public void actionPerformed (ActionEvent event){
        if ( event.getSource()== plus){
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            result.setText(Integer.toString(n1+n2));
        } 
   if ( event.getSource()== minus){
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            result.setText(Integer.toString(n1-n2));
        }  
    
    }// end of action performed
    
}// end of class
