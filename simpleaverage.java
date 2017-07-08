import java.util.Scanner;

class simpleaverage{
    public static void main(String[] args){
        System.out.println("Enter your 10 numbers");
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        
        while (counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter++;//increments your counter each time to go through a loop
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }
}