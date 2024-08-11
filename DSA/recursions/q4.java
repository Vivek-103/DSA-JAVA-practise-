import java.util.Scanner;
class q4
{
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n *fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("value of factorial is " + fact(n));
    }
}