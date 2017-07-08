import java.util.Scanner;

public class manyInstances {
        public static void main(String[] args){
            Scanner input = new Scanner (System.in);
            instances instanceName = new instances ();
            
            System.out.println("Enter full name of your daughter here: ");
            String temp = input.nextLine();
            instanceName.setName(temp);
            instanceName.saying();
    }
}