class Demo{
    private int x;
    public int y,z;
    private void fun2(){
        System.out.println("hello");
    }
    public void Set_X(int val){
        x=val;
    }
    void Get_X(){
        System.out.println(x);
    }
    public int Get_val_x(){
        return x;
    }
    void fun(){
        System.out.println("fun fun fun");
    }
}




public class accessing_public_private {
    public static void main(String[] args){
            Demo obj=new Demo();
            obj.Set_X(12);
            obj.y=13;
            obj.z=14;
            obj.Get_X();
            int Val_x=obj.Get_val_x();
            System.out.println(Val_x);
            System.out.println(obj.y);
            System.out.println(obj.z);
            //obj.fun2();        //its not possible becoz it is private member
        }
    }
