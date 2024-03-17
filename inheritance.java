/**
 * inheritance
 */
class Base{
        public int data;
        private String name;
                                        //we need a default constructor  //else you can do is use the super keyword to acces this base class
        Base(int x,String str1){
                data=x;
                name=str1;
}
        // Base(){
               //this is another method of accessing the base class by making a defaultconstructor by ourself 
               //You can go with any meethod to access the base class
        // }

        void BaseDetails()
        {
            System.out.println("name : "+name);
        }
}

class Child extends Base{
    public int age;
    private String school;
    // Child(){
    //     super(0,"rahul");     //this we are doing to access the base class as there is no default constructor in Base so we need to write this super so that it can access the value from the Base class 
    // }

    // Child(int y,String str2){         //if you are calling this paramerterized constructor than you need a default construction means you cannot access the paramerterized function or constructer in/from Base class
    //     age=y;                        
    //     school=str2;
    // }                                    //------
    
    Child(int y,String str2,int x,String str1){     //this is how you can access the base class constructor 
        super(x,str1);                             //by passing the variable in the argument of a function and using super class to access the paramerterized constructor from child class to base class
        age=y;
        school=str2;
    }
    void ChildDetails(){
        super.BaseDetails();     //this we have written after making the private value accessible via the function which we have make of BaseDetails to access in child class we have writter it in child class 
                                //Name which is private in base class will be printed from the baseDetials in base class we don't need to print the name in child details
        System.out.println("age: " +age);
        System.out.println("School: "+school);
        System.out.println("data of Base class: "+data);
        // System.out.println("name of Base class: "+name);   //this will show error as we cannot access the private access modifier value for that we need to make a function in base class 
    }
}


public class inheritance {
        public static void main(String[] args) {
            Child c1=new Child(12,"Abc",2000,"happy");
            c1.ChildDetails();
        }
}