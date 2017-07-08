import java.util.Scanner;

class boazjudy{
    public static void main(String args[]){
    Scanner judy = new Scanner (System.in);
    
    double slices, people, answer;
        System.out.println("Enter number of slices: ");
        slices = judy.nextDouble();
        System.out.println("Enter number of guests: ");
        people = judy.nextDouble();
        answer = slices/people;
        System.out.print("The guests should each eat ");
        System.out.print(answer);
        System.out.println(" slices of bread!");
        
    
    int breadslices = 18;
    int remainder;
    int guests = 5; 
    
    breadslices /=5;
    remainder = breadslices %= 5;
    
    System.out.print("Each guest will get ");
    System.out.print(breadslices);
    System.out.print(" slices of bread and ");
    System.out.print(remainder);
    System.out.println(" will slices will remain!");
    System.out.print("...............END................");
    }
}