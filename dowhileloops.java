class dowhileloops{ //executes the body before it even gets to the test condition 
    public static void main(String[] args){
        int counter = 7;
        
        do {
            System.out.println(counter);
            counter++;
        }while (counter <=10);
    }
}