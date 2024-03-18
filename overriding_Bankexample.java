abstract class bank{
    abstract void personaloan();
    abstract void homeloan();
}

class SBI_bank extends bank{
    final int age=12;   //value is final or constant
        void personaloan(){
            System.out.println("SBI say's: we are providing loan at 9% rate");
        }
        void homeloan(){
            System.out.println("SBI say's: We are providing home loan at 10% interest");
        }

        void carloan(){
            System.out.println("SBI say's: we ae providing car loan at 12% interest");
        }
}

class HDFC_bank extends bank{
    void personaloan(){
        System.out.println("HDFC say's : we are providing loan at 9% rate");
    }
    void homeloan(){
        System.out.println("HDFC say's : We are providing home loan at 10% interest");
    }
    
    void propertyloan(){
        System.out.println("HDFC say's : We are providing the loan at 8% interest and expecially female account holder");
    }
}





public class overriding_Bankexample {
    
        public static void main(String[] args) {
            
        }

}
