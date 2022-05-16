package com.company;

public class Task2 {
    static void MethodArith(){
        try{
            int no = 155/0;
            System.out.println(no);
        }

        catch(ArrayIndexOutOfBoundsException
            f ){
                System.out.println("Index Out Of Range");
                System.out.println(f.toString());
        }
        catch(ArithmeticException f){
            System.out.println("Error division by zero ");
            System.out.println(f.toString());
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void main(String[]args){
        MethodArith();
        System.out.println("--------");


    }
}
