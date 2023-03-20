import java.util.Scanner;



public class palindromeNo {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the num");
    int num= sc.nextInt();
    int temp, rem,sum=0;
    temp=num;
for( ;num!=0;num= num/10) {
      rem =num%10;
    sum=sum*10+rem;
}
System.out.println("reverse of num  " +sum);
if(temp==sum){
    System.out.println("palindrome no.");
}
    else{
        System.out.println("not a palindrome");
    
    }
}

    
}
