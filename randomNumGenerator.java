import java.util.Random;//will use for loop 

class randomNumGenerator{
    public static void main(String[] args){
        Random dice = new Random();
        int number;//store the number that outputs on the dice
        
        for (int counter=1; counter <=10; counter++){
            number = 1+dice.nextInt(6);//1+ uses #s 0-5 but adds 1 to them(illusion), # of options needed typed into parentheses
            System.out.println(number + " ");
        }
    }
}