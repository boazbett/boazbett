import java.util.Scanner;

public class methodwparameters {
        public static void main(String[] args){
            Scanner input = new Scanner (System.in);
            tunaparameter tunaObject = new tunaparameter ();
            
            System.out.println("Enter your full name here: ");
            String name = input.nextLine();
            
            tunaObject.simpleMessage(name);
        
    }
}