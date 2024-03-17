
class Base{
    public int data;
    private String name;
    Base(int x,String str){
        data=x;
        name=str;
    }
    // public void BaseDetails(){
    //     System.out.println("DATA: "+data);    // //  Making it in one child class show that we can access it in one call from main function 
    //     System.out.println("name: "+name);
    // }

    public void getName(){
        System.out.println("name: "+name);
    }
}

class Child extends Base{
    public int age;
    private String school;
    Child(int y,String str2,int x,String str){
        super(x,str);
        age=y;
        school=str2;
    }
    public void ChildDetails(){
        System.out.println("age : "+age);
        System.out.println("school: "+school);
            System.out.println("DATA: "+data);
            super.getName();
        //    System.out.println("name: "+name);      // //we cannot this private variable in main BASE class
        }


}





public class inheritance_2 {

    public static void main(String[] args) {
        // Base b1=new Base(100,"rahul");
        Child c1=new Child(100,"Utkarsh",50,"GD Goenka");
        c1.ChildDetails();
        
    }
}
