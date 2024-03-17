public class useargs {


    static void fun(int... verargs){
        System.out.println("This is for printing the length :");
        System.out.print(verargs.length);
        System.out.println();
        for(int a:verargs){

            System.out.print(a+" ");
        }
    }

    static void fun2(int[] x){               // it cannot be represented like that     
        System.out.println(x.length);         //    wrong
    }                                           //wrong
    public static void main(String[] args) {

        fun(1,2,3,4,5);
        // fun2({2,3,4,5,6,8});        //wrong
    }
}
