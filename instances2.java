public class instances2 {
    private String favColor;
    public void setColor (String color){
        favColor = color;
    }
    public String getColor(){
        return favColor;
    }
    public void saying (){
        System.out.printf("Your favorite color is %s", getColor());
    }
}