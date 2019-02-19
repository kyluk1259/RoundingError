/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;

import javax.swing.*;
import java.math.*;
/**
 *
 * @author Kyle's PC
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double first, sqrt, sqr, diff;
        //initialize question window
        String numStr = JOptionPane.showInputDialog("Please enter a number");
        
        //convert input into double
        first = Double.parseDouble(numStr);
        
        //initialize sqrt, sqr, diff
        sqrt = Math.sqrt(first);
        sqr = Math.pow(sqrt,2);
        diff = sqr - first;
        
        //initialize output window
               JOptionPane.showMessageDialog(null,"The square of the square = " + sqr + "\nThe round off error = " + diff);

    }
    
}
