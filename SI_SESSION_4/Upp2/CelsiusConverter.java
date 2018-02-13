/**
	In this exercise we will look into event handling.
	Study the existing code, and look at the TODO part
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CelsiusConverter implements ActionListener {
    JFrame converterFrame;
    JPanel converterPanel;
    JTextField tempCelsius;
    JLabel celsiusLabel, fahrenheitLabel;
    JButton convertTemp;

    public CelsiusConverter() {
        //Create and set up the window.
        converterFrame = new JFrame("Convert Celsius to Fahrenheit");
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converterFrame.setSize(new Dimension(120, 40));

        //Create and set up the panel.
        converterPanel = new JPanel(new GridLayout(2, 2));

        //Add the widgets.
        addWidgets();

        //Set the default button.
        converterFrame.getRootPane().setDefaultButton(convertTemp);

        //Add the panel to the window.
        converterFrame.getContentPane().add(converterPanel, BorderLayout.CENTER);

        //Display the window.
        converterFrame.pack();
        converterFrame.setVisible(true);
    }

    /**
     * Create and add the widgets.
     */
    private void addWidgets() {
        //Create widgets.
        tempCelsius = new JTextField(2);
        celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
        convertTemp = new JButton("Convert");
        fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);

        //TODO Listen from within this class to events from the Convert button
       

        //Add the widgets to the container.
        converterPanel.add(tempCelsius);
        converterPanel.add(celsiusLabel);
        converterPanel.add(convertTemp);
        converterPanel.add(fahrenheitLabel);
        
        celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public void actionPerformed(ActionEvent event) {
    	//TODO Read the celisius value in tempCelsius and convert it into fahrenheit and display it in fahrenheitLabel
       
    }


    /**
    * Converts from celisus to fahrenheit
    * @param celisus the celisus degree as a double
    * @return the degree in fahrenheit
    */
    static private int celisusTofahrenheit(double celisus){
    	int fahr = (int)(celisus* 1.8 + 32);
    	return fahr;
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        CelsiusConverter converter = new CelsiusConverter();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}