
    
    
    
    
    import java.util.Scanner;
    import java.util.Arrays;
    
    public class addtwoarray {
        
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the input for first array: ");
            int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the input for second array: ");
        int m=sc.nextInt();
        int [] arr1=new int[m];
        for(int j=0;j<m;j++){
            arr1[j]=sc.nextInt();
        }
        int [] arr3=new int[n+m];
        for(int i=0;i<n+m;i++){
            if(i<n){
                arr3[i]=arr[i];
            }
            else{
                arr3[i]=arr1[i-n];
            }
        }
        
        System.out.println("Unsorted array is : ");
        for(int i=0;i<n+m;i++){
            System.out.print(arr3[i]+" ");
        }
        
        // Bubble sort to sort the merged array
        for (int i = 0; i < n + m; i++) {
            for (int j = i + 1; j < n + m; j++) {
                if (arr3[i] > arr3[j]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        
        System.out.println("\nSorted array is : ");
        for(int i=0;i<n+m;i++){
            System.out.print(arr3[i]+" ");
        }

        /*Another way of sorting in java*/
        // Arrays.sort(arr3);
        // System.out.println("sorted array is : ");
        // for(int i=0;i<n+m;i++){
        //     System.out.print(arr3[i]+" ");
        // }
    }
}
