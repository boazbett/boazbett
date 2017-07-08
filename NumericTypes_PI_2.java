import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumericTypes_PI_2    
{
    public static void main (String [] args)
    {
        String rad;

        float radius,area,circum, volume;

       rad = JOptionPane.showInputDialog("Enter the Radius of circle:");

        radius = Integer.parseInt(rad);
        area = (float) (Math.PI*radius*radius);
        circum = (float) (2*Math.PI*radius);
        volume = (float) (4/3*Math.PI*radius*radius*radius);

        JOptionPane.showMessageDialog(null, "Volume: " + volume,"VOLUME",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Area: " + area,"AREA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "circumference: " + circum, "Circumfernce",JOptionPane.INFORMATION_MESSAGE);
    }
}