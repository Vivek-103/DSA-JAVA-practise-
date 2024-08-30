public class Recursivebubblesort 
{
    static void Recursivebubblesort(int arr[],int n)
    {
        if(n==1)
        {
            return;
        }
        for(int i=0;i<=n-2;i++){
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        Recursivebubblesort(arr, n-1);
    }   
    public static void main(String[] args) {
        int arr[] = {23,43,12,56,76,35,29};
        System.out.println("array before sorting is-\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        Recursivebubblesort(arr, arr.length);
        System.out.println("array before sorting is-\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    } 

}
