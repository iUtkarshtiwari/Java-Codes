import java.util.Scanner;

public class if_else_voting_code {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            int b=18-age;
            System.out.printf("Yes cannot vote now you have still %d years left",b);
        }
        else if (age==18 || age==19) {
            System.out.println("You can apply for voting card");
        } else {
            System.out.println("Yes surely you have right to vote");
        }
    }
}
