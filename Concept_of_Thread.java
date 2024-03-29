import java.util.*;
import java.io.*;
// class thread12 extends Thread{
//     public void run(){
//             System.out.println("New thread is working");
//     }
// }

// class thread1 implements Runnable{
//     public void run(){
//         System.out.println("i am new Thread");
//     }
// }                             ////How to create from runnable interface 


interface demo{
    void fun();              //if we have only one function we can have lambda function
    // void fun2();
}

public class Concept_of_Thread {
    public static void main(String[] args) {
        // demo d1=new demo(){
        // public void fun(){
        //     System.out.println("Hello i am fun");
        // }
        // public void fun2(){
        //     System.out.println("hello i am fun2");
        // }
    // };
        // thread12 t2=new thread12();//}  -//if you will write like this becoz t1 don't have start method so we need to create one more thread as object 
       // t1.start();             //}  -            ////This system we cannot use as runnable doesn't understand any start keyword to make process work
        // Thread t=new Thread(t2);
        // t.start();
 

        // thread12 t1=new thread12();
        // t1.start();                   ////process of thread making is starts from here
        // t1.sleep(1000);            
          ////Stop the contniued process for 1000mili seconds
        // d1.fun();
        // d1.fun2();
        
        // *******************************************
        demo d1=()->{                     ////lambda expression if we have only 1function to define we can use this 
                    System.out.println("Hello Hello");
                };
                d1.fun();
        }
        } 

     