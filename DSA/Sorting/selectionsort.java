import java.util.*;
class selectionsort
{
    static void selectionsort(int arr[],int n){
    for(int i = 0; i<n-1;i++){
        int min = i;
        for (int j=i+1; j<n; j++){
            if(arr[j]<arr[min]){
                min =j;
            }
        }
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i] = temp;
    }
    System.out.println("after sorting");
    for(int i =0;i<n;i++){
        System.out.println(arr[i] + "");    
    }   
    System.out.println();
}
public static void main(String[] args) {
    System.out.println("enter no off elements in array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[50];
    System.out.println("enter elements in array");
    for(int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("before selection sort we have");
    for(int i =0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    System.err.println("after selection sort:");
    selectionsort(arr, n);

    
}
}
