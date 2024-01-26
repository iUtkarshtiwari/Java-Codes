import java.util.Scanner;

public class print_the_duplicates {
    public static void main(String[] args) {
        // 2 5 6 7 4 6 5 1 9 1 
     //  1 6 5
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]==arr1[j]){
                        System.out.println(arr1[i]);
                }
            }
        }

    }
    
}
