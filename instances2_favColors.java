import java.util.Scanner;

public class instances2_favColors {
        public static void main(String[] args){
            Scanner input = new Scanner (System.in);
            instances2 colorName = new instances2 (); //instances2: class name
            
            System.out.println("Enter your favorite color here: ");
            String temp = input.nextLine();
            colorName.setColor(temp);
            colorName.saying();
    }
}