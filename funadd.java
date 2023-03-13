import java.util.*;
public class funadd {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println(sum);
        sc.close();
    }
    public static int add( int a, int b){
       
        int sum = a+b;
        return sum;
     }
     
     
     
     

    
}
