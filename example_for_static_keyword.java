class demo{
    static void fun(){
        // fun2();      // we cannot call non static in static 
     System.out.println("I am static keyword");
}
        static void fun2(){
            // fun();
            System.out.println(" i am non static keyword");
        }
}


public class example_for_static_keyword {

    static void fun3(){
        System.out.println("this is fun3 inside main class");
    } 
    public static void main(String[] args) {
        //use of static keyword :
            // memory allocated at compile time
            
            // memory is assigned to it at that time only  and we don't have to create object of it  that is common for all object belongs to class we can say class method other non static are object method ie class method that belongs to classs only  
            
            //another static method cannot be accesed from static one
            // to access non static method in static is not allowed
        demo.fun2();    //this comes in a static method
        // demo.fun2();  //  //this comes in a object method we cannot call a non static keyword
        fun3();
    }
}