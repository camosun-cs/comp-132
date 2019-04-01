package Lab8;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayInfo extends JFrame implements ActionListener {



   private JPanel panel;
   private JButton  b2,b3;
   private JLabel equalLabel;
   
   private JTextArea textArea;
   private int[][] array;
   private Matrix m = new Matrix();
    
    
    
    public void createGUI(){
       // tells the program to terminate when the frame is closed.     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout(FlowLayout.CENTER,10,20) );
   
        panel = new JPanel();
        panel.setBackground(Color.yellow);
        //panel.setBackground(new Color(255, 255, 51));
        panel.setPreferredSize(new Dimension (400,300));
        window.add(panel);
 
        // we are creating a text arear with scoll and listening to the button  b2 
        // which will "Draw Matrix"
        textArea = new JTextArea(10,30);
        //panel.add(textArea);
   
        JScrollPane scroll = new JScrollPane(textArea);
        panel.add(scroll);
    
        b2 = new JButton("Draw Matrix");
        // where are we adding the button 
        panel.add(b2);
        b2.addActionListener(this);
    
        b3 = new JButton("Draw Number Matrix");
         // where are we adding the button 
        panel.add(b3);
        b3.addActionListener(this);
    

    
    }// end of create GUI
    
    public void actionPerformed (ActionEvent event){

   if ( event.getSource()== b2){
         textArea.append(m.drawMatrix());
    }

    if ( event.getSource()== b3){
         array = m.fillMatrix();
        textArea.append(m.drawMatrixNum(array));
      
    }
 
  }  // end of action Performed

 
   
}// end of Class
    

   

  
    
    
    
    
