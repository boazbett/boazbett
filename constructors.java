public class constructors {
    private String girlName;
    
    public constructors (String name){
        girlName = name;//constructors will be passed into girlname
    }
    
    public void setName(String name){
        girlName = name; 
    }
    public String getName(){
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first girl is %s\n", getName());
    }
}