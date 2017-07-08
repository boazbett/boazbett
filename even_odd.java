//this program checks if number is prime

import java.util.Scanner;

class Prime_Number_Check {

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Does %d is prime? %s %s  %s %n", number,
                    isPrime(number), isPrimeOrNot(number), isPrimeNumber(number));
        }
    }
}
