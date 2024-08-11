import java.util.Scanner;
class q3
{
    static void printsum(int i,int sum)
    {
        if (i<1){
            System.out.println(sum);
            return;
        }
        printsum(i-1,sum+i);
    }
    public static void main (String[] args){
        System.out.println("enter sum of number you want");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        printsum(sum,0);
    }
}