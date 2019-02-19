/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;

import javax.swing.*;
import java.math.*;

/**
 * Kyle Lukaszek 
 * 2/18/19 
 * Rounding Error Program
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable initialization for input, sqrt, sqr, and difference
        double input, sqrt, sqr, diff;

        //initialize question window
        String numStr = JOptionPane.showInputDialog("Please enter a number");

        //convert input into double
        input = Double.parseDouble(numStr);

        //initialize sqrt, sqr, diff
        sqrt = Math.sqrt(input);
        sqr = Math.pow(sqrt, 2);
        diff = sqr - input;

        //initialize output window
        JOptionPane.showMessageDialog(null, "The square of the squareroot = " + sqr + "\nThe round off error = " + diff);

    }

}
