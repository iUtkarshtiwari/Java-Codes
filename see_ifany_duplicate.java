import java.util.Scanner;

public class see_ifany_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        finding_duplicates(arr,n);
    }
    public static void finding_duplicates(int[]arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                        System.out.println(arr[i]);
                }
                else{
                    continue;
                }
            }
        }
    }
    
}
