import java.io.*;
class StudentMarks{
		public int x;
		public int y;
		public StudentMarks(int a1,int a2){
			System.out.println("Hello");
			x=a1;
			y=a2;
		}
		public StudentMarks(){
				System.out.println("kuch nahi hai");
		}

		public StudentMarks(int a1){
			System.out.println("single vaue");
			x=a1;
		}
}
class understanding_class{
	public static void main(String[] args) {
		StudentMarks a1=new StudentMarks(50,20);
		StudentMarks a2=new StudentMarks(40,100);
		StudentMarks a3=new StudentMarks();
		StudentMarks a4=new StudentMarks(100);
		// a1.x=100;
		// a1.y=500;
		// a2.x=500;
		// a2.y=100;
		System.out.println(a1.x+a2.x);
		System.out.println(a4.x);

	}
}









// class Demo {
//     public int x;
//     public int y,z;
//     void fun(){
//         System.out.println("fun fun fun");
//     }
// }
// class understanding_class{
// 	public static void main (String[] args) {
// 		Demo obj=new Demo();
// 		Demo obj1=new Demo();
// 		obj.x=12;
// 		obj.y=13;
// 		obj.z=14;
// 		obj1.x=200;
// 		obj1.y=100;
// 		System.out.println(obj.x);
// 		System.out.println(obj.y);
// 		System.out.println(obj.z);
// 		System.out.println(obj1.x);
// 		System.out.println(obj1.y);
// 		obj.fun();
// 	}
// }