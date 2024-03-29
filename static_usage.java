import java.io.*;
import java.util.*;

class Outer{
    public int x;
    public static int y;
    public static void fun(){
        System.out.println("Fun fun fun");
    }
    static class InnerClass{
        public int x2;
        public static int y2;
         void details(){

            Outer obj3=new Outer();                 ////You can declare the object of the outer class 
            obj3.x=999;
            System.out.println("value of x2:"+x2);
            System.out.println("value of y2:"+y2);
            System.out.println("value of y:"+y);
            System.out.println("value of x:"+obj3.x); ////this is not prossible as non static word or another class cannot be referenced in another class so this statmenet shows no output
        }
        InnerClass(int val1,int val2){                 /////You can create a constructor as well of the innerclass no problem in making that
            x2=val1;                           //
            y2=val2;
        }
    }
}



public class static_usage {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        // obj1.y=13;                               /////object of the parent class is not possible 
        obj1.fun();
        Outer.InnerClass obj2=new Outer.InnerClass(111,222);      //// this is the way to create an object of inner nested class or static nested class
        // obj2.x2=5;
        // obj2.y2=5;
        // obj2.y=5;
            obj2.details();
    }
}
