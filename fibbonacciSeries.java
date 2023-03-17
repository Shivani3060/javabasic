import java.util.Scanner;

import javax.naming.spi.ResolveResult;

public class fibbonacciSeries{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("number of elements");
        int size = sc.nextInt();
        System.out.println("enter the num one");
        int num1 = sc.nextInt();
System.out.println("enter the num 2");
int num2 =sc.nextInt();
//logic
for(int i=0;i<size;i++){

int res= num1 +num2;
System.out.println(res);
    num1=num2;
    num2=res;
}
    
}
}
