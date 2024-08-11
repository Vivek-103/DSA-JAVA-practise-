import java.util.Scanner;
class q3a
{
    static int sumofn(int n){
        if (n == 0){
            return 0;
        }
        return n + sumofn(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of n number is:" + sumofn(n));

    }
}