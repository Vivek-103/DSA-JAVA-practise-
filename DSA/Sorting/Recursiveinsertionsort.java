public class Recursiveinsertionsort 
{
    static void Recursiveinsertionsort(int arr[] , int i, int n){
        if(i==n){
            return;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        Recursiveinsertionsort(arr, i+1, n);
    }   
    public static void main(String[] args) {
        int arr[] = {23,43,12,56,76,35,29};
        System.out.println("array before sorting is-\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        Recursiveinsertionsort(arr, 0,arr.length);
        System.out.println("array before sorting is-\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}

