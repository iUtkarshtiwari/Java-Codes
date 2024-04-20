import java.util.*;
import java.io.*;

class Outer{
    public int x;
    public static int y;
    
    
    public static void fun(){
        System.out.println("you are in fun function");
        System.out.println("value of y:"+y);
    }

    static class inner{
        public int x2;
        public static int y2;
        
        
        public void fun2(){
            System.out.println("i am in fun2");
            fun();
        }
        static class inner2{
            public int x2;
            public static int y2;
            public void fun3(){
                System.out.println("i am in inside inner class");
                fun();
            }
            public static void hello(){
                System.out.println("Helloo Hello");
            }
        }
    }
    
}

public class static_usage_II {
public static void main(String[] args) {
        Outer obj1=new Outer();
        Outer.inner obj2=new Outer.inner();
        // Outer.inner2 obj3=new Outer.inner2();
        Outer.inner.inner2 obj3=new Outer.inner.inner2();
        Outer.inner.inner2.hello();     ////this you can do when the function is static
        // obj.fun();
        // obj2.fun2();
        // obj3.hello();
    }
}
