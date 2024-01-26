import java.util.Scanner;

public class Sum_of_Consecutive_elementis_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        checkingtheelement(arr,n,15);

    }
                                                    //10    //15 
    public static void checkingtheelement(int[] arr,int n,int x){
        for (int i = 0; i < n; i++) {
            int d=x-arr[i];
                if(i<n-1 && (arr[i]+arr[i+1]==d || arr[i]==d)){
                    System.out.println("YES");
                    return;
                }
            }
                System.out.println("NO");
        }
    }



//     import java.util.Scanner;

// public class Sum_of_Consecutive_elementis_15 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         checkingtheelement(arr, n, 15);
//     }

//     public static void checkingtheelement(int[] arr, int n, int x) {
//         for (int i = 0; i < n - 1; i++) {
//             int d = x - arr[i];
//             if (i < n - 1 && (arr[i] + arr[i + 1] == x || arr[i] == d)) {
//                 System.out.println("YES");
//                 return;
//             }
//         }
//         System.out.println("NO");
//     }
// }

