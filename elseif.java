import java.util.Scanner;

public class elseif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]%3==0 && arr[j]%2==0){
                System.out.println("Fizz Buzz");
            }
            else if(arr[j]%2==0){
                System.out.println("Fizz");
                }
            else if(arr[j]%3==0){
                System.out.println("Buzz");
                }
            else{
                System.out.println(arr[j]);
            }
        }
    }
} 