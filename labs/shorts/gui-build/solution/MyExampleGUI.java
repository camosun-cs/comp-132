package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author shohreh
 * @author mterpstra
 */

public class MyExampleGUI {    
    public static void main(String[] args) {
        JFrame window;

        //  left column will have UI for editing a Person
        JPanel personPanel;
        JPanel personEditor, personButtons;
        JTextField firstNameField, lastNameField, idField;
        JButton createPerson, deletePerson;
        JList personList;
        DefaultListModel people;

        //  right column will have a large textbox for diplaying output
        JPanel outputPanel;
        JPanel outputButtons;
        JTextArea outputArea;
        JButton drawMatrix;

        //  bottom will have a calculator
        JPanel calculatorPanel;
        JSpinner leftOperand, rightOperand;
        JButton add, subtract;
        JTextField calculatorResult;


        // =====================================================================
        // Build the personPanel UI
        // =====================================================================
        personPanel = new JPanel();
        //personPanel.setBackground(Color.GREEN);
        personPanel.setLayout(new BorderLayout());
        
        // top: labels next to text boxes
        personEditor = new JPanel();
        //personEditor.setBackground(Color.LIGHT_GRAY);
        personEditor.setLayout(new GridBagLayout());

        // align labels on left
        GridBagConstraints labelConstraint = new GridBagConstraints();
        labelConstraint.gridx = 0;
        labelConstraint.anchor = GridBagConstraints.WEST;
        
        // align input fields on right + allow to stretch
        GridBagConstraints fieldConstraint = new GridBagConstraints();
        fieldConstraint.gridx = 1;
        fieldConstraint.weightx = 1;

        personEditor.add(new JLabel("First Name: "), labelConstraint);
        firstNameField = new JTextField(10);
        personEditor.add(firstNameField, fieldConstraint);

        personEditor.add(new JLabel("Last Name: "), labelConstraint);
        lastNameField = new JTextField(10);
        personEditor.add(lastNameField, fieldConstraint);

        personEditor.add(new JLabel("ID #: "), labelConstraint);
        idField = new JTextField(10);
        personEditor.add(idField, fieldConstraint);
        
        personPanel.add(personEditor, BorderLayout.NORTH);

        // center: scrolling output
        people = new DefaultListModel();
        personList = new JList(people);
        //personList.setBackground(Color.MAGENTA);
        personPanel.add(
            new JScrollPane(personList),
            BorderLayout.CENTER
        );
        
        //lab7.Person example = new lab7.Person("Max", "Terpstra");
        //people.addElement(example);
        
        // bottom: centered buttons
        personButtons = new JPanel(); // uses FlowLayout by default
        //personButtons.setBackground(Color.CYAN);

        createPerson = new JButton("Add");
        personButtons.add(createPerson);
        deletePerson = new JButton("Remove");
        personButtons.add(deletePerson);
        
        personPanel.add(personButtons, BorderLayout.SOUTH);


        // =====================================================================
        // Build the outputPanel UI
        // =====================================================================
        outputPanel = new JPanel();
        //outputPanel.setBackground(Color.YELLOW);
        outputPanel.setLayout(new BorderLayout());
        
        outputArea = new JTextArea();
        outputPanel.add(
            new JScrollPane(outputArea),
            BorderLayout.CENTER
        );
        
        drawMatrix = new JButton("Draw Matrix");

        outputButtons = new JPanel(); // uses FlowLayout by default
        //outputButtons.setBackground(Color.ORANGE);
        outputButtons.add(drawMatrix);
        outputPanel.add(outputButtons, BorderLayout.SOUTH);

        
        // =====================================================================
        // Build the calculatorPanel UI
        // =====================================================================
        calculatorPanel = new JPanel(); // uses FlowLayout by default
        //calculatorPanel.setBackground(Color.PINK);

        // use an inner JPanel to prevent vertical stretching
        JPanel calculatorInner = new JPanel();
        //calculatorInner.setBackground(Color.RED);
        // stack contents vertically
        calculatorInner.setLayout(new BoxLayout(calculatorInner, BoxLayout.Y_AXIS));
        calculatorPanel.add(calculatorInner);
        
        leftOperand = new JSpinner();
        calculatorInner.add(leftOperand);
        rightOperand = new JSpinner();
        calculatorInner.add(rightOperand);

        // use another nested JPanel to layout buttons horizontally
        JPanel calculatorButtons = new JPanel(); // uses FlowLayout by default
        //calculatorButtons.setBackground(Color.LIGHT_GRAY);
        add = new JButton("+");
        subtract = new JButton("-");
        calculatorButtons.add(add);
        calculatorButtons.add(subtract);
        calculatorInner.add(calculatorButtons);

        calculatorResult = new JTextField("= ??");
        calculatorResult.setHorizontalAlignment(JTextField.CENTER);
        calculatorResult.setEditable(false);          
        calculatorInner.add(calculatorResult);        
        
        
        // =====================================================================
        // Pack evertying together, auto-size, and display!
        // =====================================================================

        // label our panels nicely
        personPanel.setBorder(new TitledBorder("Person Information"));
        outputPanel.setBorder(new TitledBorder("Display Results"));
        calculatorPanel.setBorder(new TitledBorder("Calculator"));

        // add everything into a window
        window = new JFrame("GUI with no ActionListeners :(");
        // note: JFrame uses BorderLayout by default (different than JPanel!)
        window.add(personPanel, BorderLayout.WEST);
        window.add(outputPanel, BorderLayout.CENTER);
        window.add(calculatorPanel, BorderLayout.EAST);

        // calculate layout and size everything to fit
        window.pack();

        // prevent the window from getting any smaller than this
        window.setMinimumSize(window.getSize());
        
        // show it!
        window.setVisible(true);
        
        // end the program when this window closes
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
