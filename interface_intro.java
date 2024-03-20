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

// interface Car {            
//     void breakSystem();    
//     void oilingSystem();    
// }

// class BMWs implements Car {
//     public void breakSystem() {
//         System.out.println("Every car should have a proper braking system");
//     }

//     public void oilingSystem() {
//         System.out.println("Every car should have a proper oiling system");
//     }

//     public void powerSystem() {
//         System.out.println("Every car should have a power system");
//     }
// }

// public class interface_intro {
//     public static void main(String[] args) {
//         BMWs b1 = new BMWs();
//         b1.powerSystem();
//         b1.oilingSystem();
//     }
// }
//////////////////////////////////////////////////////////////////
/*package whatever //do not write package name here */

import java.io.*;

  interface Safety{
      void safetyRule();
  }
  interface Car extends Safety{
      void breakSystem();   // public 
      void OilingSystem();  // public 
  }
    //private < protected < default < public
 abstract class BMW implements Car{
    
      public void OilingSystem(){
          System.out.println("i am oiling System of BMW");
      }
     public  void powerSystem(){
          System.out.println(" i have extra power for race");
      }
     public void safetyRule(){
         System.out.println("you have to follow rules");
     }
  }
  class BWMchild extends BMW {
      public void breakSystem(){
          System.out.println("breaking system");
      }
  }
  
  
 

class interface_intro {
	public static void main (String[] args) {
	BWMchild b1 = new BWMchild();
	  b1.powerSystem();
	  b1.breakSystem();
		  
	}
}