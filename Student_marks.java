import java.util.Scanner;

public class Student_marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            total += a;
        }

        System.out.println("Total marks: " + total);
        double percentage = ((double) total / (n * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
