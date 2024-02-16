import java.util.*;
class anotherclass{
    
    public int x;
    public int Y;
    public anotherclass(){
        System.out.println("hello");
    }

    public anotherclass(int a,int b){
        x=a;
        Y=b;
    }
    public void fun(){
        System.out.println("hi***");
    }
}






public class classesandobject {
    public static void main(String[] args) {
        anotherclass obj1=new anotherclass(50,20);
        // obj1.x=50;
        // obj1.Y=20;
        System.out.println("this is for object1 : "+(obj1.x+obj1.Y));
        anotherclass obj2=new anotherclass(30,20);
        // obj2.x=30;
        // obj2.Y=20;
        System.out.println("this is for object2 : "+(obj2.x+obj2.Y));
        // obj1.x=50;
        anotherclass obj3=new anotherclass();
    }
}
