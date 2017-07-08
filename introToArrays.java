class introToArrays{//Arrays useful for systems with many related information
    public static void main(String[] args){//arrays can only store values of same datatype
        int boaz[]=new int[10];//square brackets are indicator of an array. number indicates how many values/variables will be stored
        
        boaz[0]=87;
        boaz[1]=543;
        //...
        boaz[9]=65;
        
        System.out.println(boaz[9]);
        
        //use of array initializer ...you dont have to type array name
        
        int bethel[]={20,148,59,767,957,75,898,46,34,456};//automatically counts how many values you put in & assigins subscripts to each of those
        
        System.out.println(bethel[9]);
    }
}