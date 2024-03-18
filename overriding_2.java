

abstract class calculation{                                     //if we are making any class a abstract class then we cannot make its object 
    abstract void add();            //only declaration is done in this class                            // we cannot run because their is no defination of the function inside the class
    abstract void subtract();        //beacuse here  in abstract class we have some method so we don't have defination of method   if we will create any object of abstract class than that object should  run these method that is not possible beocz these method dont have any defination          
}

//if you created a abstract class it means we cannot be able to create a object of class whenever you will inherit that class or extend the class you have to overwrite the below method

class integer extends calculation{
    void add(){                                     //above written is for thes function 
        int x=12;                                     //#add and #subtract
        int y=13;
        System.out.println(x+y);
    }
    void subtract(){
        int x=15;
        int y=13;
        System.out.println(x-y);
    }
}



class child2 extends integer{             // this is to check that we can extends the class or not So yes we can the class in abstract function
    
}


public class overriding_2 {
    public static void main(String[] args) {
        System.out.println("Hello program is runnig fine");
    }
}
