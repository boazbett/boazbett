class compoundinterest{
    public static void main (String[] args){
        //A=P(1+R)^n;...this is the compound interest formula
        
        double amount;
        double principal = 10000;
        double rate = 0.05;
        
        for (int day=1; day <= 10; day++){
            amount = principal*Math.pow(1 + rate, day);
            //amount = principal*Math.pow(arg0, arg1)
            System.out.println(day + "  "  + amount);
        }
    }
}