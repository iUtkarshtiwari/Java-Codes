/**
 * useabstract_inclass
 */
// import java.lang.*;
abstract class Parent{
    void fun(){
        System.out.println("Hello i am fun function");       //this is function defination or methid defination 
    }
    abstract void fun2();                                       //body of this is not available
        //it has a abstract keyword no object it is possible so we should have class also abstract
    abstract int value(int x,int y);
    final int x;            

    Parent(int x1){
        x=x1;
    }

}
    //Since we cannot make object of that particular class which has/is abstract keyword so for that reason we should extends theclass
    abstract class Child extends Parent{

        void fun2(){      //in the extended class we have to defina that abstract function of the parent class
        System.out.println("i am from fun2");
    }

    int value(int x,int y){
        return x+y;
    }
    abstract void fun3();
    Child(int x1){
        super(x1);
    }

}
    class Grandchild extends Child{
        void fun3(){
            System.out.println("i am from fun3 ");
        }
                Grandchild(int x1){
                    super(x1);
                }

    }

public class useabstract_inclass {

    public static void main(String[] args) {
        // Parent p1=new Parent();
        // p1.fun2();
        Grandchild g1=new Grandchild(100);
        int a=g1.value(2, 5);
        g1.fun();
        // g1.x=12;    //if it is final than we cannot update it  
        System.out.println(g1.x);
        System.out.println(a);
    }
}
// in final variable either you should put the value at intialising time or take access from the function d 

// *************************************************************************************************************************************************


// // Parent class should be abstract since it contains abstract methods
// abstract class Parent {
//     void fun() {
//         System.out.println("Hello, I am fun function");
//     }

//     // Abstract method declaration without method body
//     abstract void fun2();

//     // Abstract method declaration without method body
//     abstract int value(int x, int y);
// }

// // Child class extends the abstract Parent class
// class Child extends Parent {
//     // Override the abstract method fun2() from the Parent class
//     @Override
//     void fun2() {
//         System.out.println("I am from fun2");
//     }

//     // Override the abstract method value(int x, int y) from the Parent class
//     @Override
//     int value(int x, int y) {
//         return x + y;
//     }
// }

// public class useabstract_inclass {
//     public static void main(String[] args) {
//         // Cannot create an instance of an abstract class
//         // Parent p1 = new Parent();

//         // Create an instance of the
//         Child c1 = new Child();

//         // Call the overridden methods
//         int a = c1.value(2, 5);
//         c1.fun2();

//         // Print the result
//         System.out.println(a);
//     }
// }