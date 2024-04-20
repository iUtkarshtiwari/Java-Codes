



import java.util.*;
import java.io.*;

class Outer{
    public int x;
    public static int y;
    public static void fun(){
        System.out.println("I am fun function ");
        System.out.println("value of y : "+y);
        // System.out.println("value of y : "+x);         ////this we cannot do as it was not declared as static 
    }
    
    
    
    static class inner{
        public int x2;
        // public static int y2;
        public void fun2(){
            System.out.println("hello Guys");
            fun();
        }
        
    }

    static class inner2{
        public int x3;
        public static int y3;
        public void fun3(){
            System.out.println("You are inner2 function ");
            fun();
        }
    }

    
    
}

    public class static_nested_class {
    public static void main(String[] args) {
        // Outer obj1=new Outer();            ////this is for the outer class is we want to apply to call any function than we have to call by object like obj1.fun() we are callng 
        // obj1.fun();
        Outer.inner2 obj1=new Outer.inner2();
        obj1.fun3();                            /////in this as we are calling the inner class so we are writing outer.inner  and calling obj1 
        Outer.inner obj2=new Outer.inner();
        obj2.fun2();
        
    }
}
