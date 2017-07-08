import java.util.Scanner;

class Primality_Test{
    public static void main(String[] args){
        
        int x;
        int y;
        y = 1;
        
        System.out.println("Enter test number: ");
        Scanner input = new Scanner (System.in);
        
        x = input.nextInt();
        
        if (x%2 == 0)
            System.out.print("This is an even and ");
        if (x%2 != 0)
            System.out.print("This is an odd and ");
        if ((x==2 | x==3| x == 5 | x == 7) | (((y++%x != 0) | (x++%x !=0) & (x != 1) & (x%2 != 0) & (x%3 != 0) & (x%5 !=0) & (x%7 != 0))))
            System.out.println("a PRIME number");
        else
            System.out.println("is NOT a prime number");
    }
}