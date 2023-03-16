import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size");
   int size= sc.nextInt();
   int [] array = new int[size];
   System.out.println("enter the elemens");
    for(int i=0; i<size; i++){
        array[i] = sc.nextInt();
    }
//logic
System.out.println("enter the num");
int x= sc.nextInt();
for(int i=0;i<size;i++){
    if(x== array[i])
    System.out.println("x found at " +array[i]);
}
        System.out.println("element not found");
    

}
    
}
