import java.util.Scanner;

public class Sum_of_n_number_in_an_array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
        System.out.println(sum);
    }
}
