import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class armstrongNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();
        //logic
        int temp,r,sum=0;
        temp=num;
        while(num>0){
           r= num%10;
           sum=sum+r*r*r;
           num=num/10;

        }
        if(temp==sum){
            System.out.println("armstrong no");
        }
            else{
                System.out.println("not an armstrong no.");
            }
        
    }
    
}
