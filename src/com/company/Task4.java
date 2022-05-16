package com.company;

public class Task4 {
    public static void Method(int a) throws LessThan1Exception,GreaterThan1Exception,Equals0Exception{
        if(a<0){
            throw new LessThan1Exception("The number Less Than 0");
        }
        else if (a>1){
            throw new GreaterThan1Exception("The number Greater Than 1");
        }
        else if(a==0){
            throw new Equals0Exception("The number equal To 0");
        }
    }
    public static  void main(String[]args) throws GreaterThan1Exception, LessThan1Exception, Equals0Exception {
        try {

            Method(0);
        }
        catch (GreaterThan1Exception | Equals0Exception |LessThan1Exception f ){
            System.out.println(f);
        }

    }

}
