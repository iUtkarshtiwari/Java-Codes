// public class base{
//     public int val1;
//     public int val2;
//     public void fun(){
//         System.out.println("i am in base class");
//     }
// }

// public class child1 extends base{
//     public int val3;
//     public int val4;

// }

// public class child2 extends base{
//     public int val5;
//     public void fun2(){
//         System.out.println("you are in child2 class fun2");
//     }
// }




// public class inheritance{
//             public static void main(String[] args) {
//                 family obj=new family();
//                 obj.age=10;
//                 obj.weight=50;
//                 obj.fun2();
//                 System.out.println(obj.age);
//                 System.out.println(obj.weight);
                
//             }
        
//         }


//         class family{
//                 public int age;
//                 public int weight;
//                 public void fun2(){
//                     System.out.println("hi welcome to family");
//                 }
//             }
import java.io.*;
class Base{
    public int val1;
    public int val2;
    Base(int X,int Y){
        val1=X;
        val2=Y;

    }
    Base(){
        System.out.println("Base class constructor");
    }
}

class Child extends Base(){
    public int val2;

    Child(){
        super(2,3);
        System.out.println("Child constructor called");
    }
}


public class inheritance{
    public static void main(String[] args) {
        Child c1=new Child();
        System.out.println(c1.val1+" "+c1.val2);

    }
}