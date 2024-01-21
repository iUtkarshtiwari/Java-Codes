import java.util.Scanner;

public class kilometer_to_meter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in Kilometers: ");
        int KM=sc.nextInt();
        change_to_meter(KM);
    }

    public static void change_to_meter(int KM){
        int Ans=KM*1000;
        System.out.println("Answer is : "+Ans);
    }
}
