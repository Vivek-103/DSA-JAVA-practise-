import java.util.Scanner;
class q2 
{
  static void print(int i , int n)
 {
    if (i>n){
        return;
    }
    System.out.println("VIVEK");
    print(i+1, n);
 }
 public static void main(String[] args) 
 {
    System.out.println("enter how many times you want your name ");
    Scanner sc = new Scanner(System.in);
    Integer n = sc.nextInt();
    print(1,n);
 }   
}
