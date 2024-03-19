/**
 * example_abstract
 */

import java.io.*;
 //if we have a abstract class than it is not required to make the abstract method but
 // if we have a abstract method in class which is not abstract than we need to maketheclass abstract first 
 abstract class Car{
    void breakSystem(){
        System.out.println("car should have a good breaking system");
    }
    abstract void oilingSystem();
 }

 class BMW extends Car{
    @Override
    void oilingSystem() {
    System.out.println("car should ahve a good oiling system");        
    }
 }



public class example_abstract {
    public static void main(String[] args) {
        
        BMW b1=new BMW();
        b1.oilingSystem();
        b1.breakSystem();
    }
    
}