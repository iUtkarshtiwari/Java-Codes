import java.util.Scanner;

public class Checkif_element_isin_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                    System.out.printf("Yes element is at index: %d",i);
                    return;
            }
        }
        System.out.println("Sorry Not Found");
        return ;
    }
}
