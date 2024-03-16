
    
    
    
    
    import java.util.Scanner;
    import java.util.Arrays;
    
    import java.util.Scanner;

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
            int i=0;
            int j=0;
            int k=0;
            while(j<m && i<n){
                if(arr[i]<arr1[j]){
                    arr3[k]=arr[i];
                    i++; k++;
                }
                else{
                    arr3[k]=arr1[j];
                    j++; k++;
                }
            }
            while (i<n) {
                arr3[k]=arr[i];
                i++;
                k++;
            }
            while (j<m) {
                arr3[k]=arr1[j];
                j++;
                k++;
            }
            
            System.out.println("Merged array is : ");
            for(i=0;i<n+m;i++){
                System.out.print(arr3[i]+" ");
            }
            System.out.println();
        
        
        
            
        // Bubble sort to sort the merged array
        // for (int i = 0; i < n + m; i++) {
        //     for (int j = i + 1; j < n + m; j++) {
        //         if (arr3[i] > arr3[j]) {
        //             int temp = arr3[i];
        //             arr3[i] = arr3[j];
        //             arr3[j] = temp;
        //         }
        //     }
        // }
        
        // System.out.println("\nSorted array is : ");
        // for(int i=0;i<n+m;i++){
        //     System.out.print(arr3[i]+" ");
        // }
        
        /*Another way of sorting in java*/
        // Arrays.sort(arr3);
        // System.out.println("sorted array is : ");
        // for(int i=0;i<n+m;i++){
            //     System.out.print(arr3[i]+" ");
            // }
        }
    }