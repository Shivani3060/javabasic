import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the num");  
     int num= sc.nextInt();
     boolean check=false;
     for (int i=1; i*i<=num; i++) {
        if(num%i==0 && num/i==i){
         check= true;
         } }
    if(check==true)
    System.out.println("perfect square");
    else
    System.out.println("not a perfect square");

}}