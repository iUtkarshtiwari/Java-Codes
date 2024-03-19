/**
 * interface_intro
 */


// interface Car {            //interface islike classes only we cannot create a object of interface class
//     void breakSystem();    //public        //interface is fully abstract class 
//     void oilingSytem();    //public         //and also we dont have to write abstract keywork in front of all methods
// }

// class BMWs implements Car{
//     public void breakSystem(){                                                            // // if in normal class we will write like this thanit will be default access modifier  but in interface it will come under public 
//         System.out.println("Every car their should be a proper break system");
//     }
//     public void oilingSystem(){
//         System.out.println("in every car their should be a proper oiling system");
//     }

//     public void powerSystem(){
//         System.out.println("car should have a power system");
//     }
// }


// public class interface_intro {
//         public static void main(String[] args) {
//             BMWs b1=new BMWs();
//             b1.powerSystem();
//             b1.oilingSystem();
//         }
    
// }

interface Car {            
    void breakSystem();    
    void oilingSystem();    
}

class BMWs implements Car {
    public void breakSystem() {
        System.out.println("Every car should have a proper braking system");
    }

    public void oilingSystem() {
        System.out.println("Every car should have a proper oiling system");
    }

    public void powerSystem() {
        System.out.println("Every car should have a power system");
    }
}

public class interface_intro {
    public static void main(String[] args) {
        BMWs b1 = new BMWs();
        b1.powerSystem();
        b1.oilingSystem();
    }
}
