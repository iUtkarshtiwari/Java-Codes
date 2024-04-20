import java.util.*;
import java.util.Scanner;

public class binary_search{

    static int binary_search1(int arr[],int n,int k){
            int l=0;
            int h=n-1;
            while(l<=h){
                int mid=(h+l)/2;
                if(arr[mid]==k){
                    return mid;
                }
                else if(arr[mid]<k){
                        l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the element : ");
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr);
        System.out.println(binary_search1(arr,n,k));
    }
}
    