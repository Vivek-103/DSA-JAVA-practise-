import java.util.*;
class quicksort{
    static int partition(List<Integer>arr,int low,int high){
        int pivot = arr.get(low);
        int i = low;
        int j= high;
        while(i<j){
            while(arr.get(i)<=pivot && i<=high-1){
                i++;
            }
            while(arr.get(j)>pivot&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j,temp);
        return j;
    }
    static void qs(List<Integer>arr,int low,int high){
        if(low<high){
            int pindex = partition(arr, low, high);
            qs(arr, low, pindex-1);
            qs(arr, pindex+1, high);
        }

    }
    public static List<Integer> quicksort(List<Integer>arr){
        qs(arr,0,arr.size()-1);
        return arr;
    }
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("Before Using quick sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr =quicksort(arr);
        System.out.println("After quick sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }


}