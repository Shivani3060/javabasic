import java.util.Scanner;

public class distinctelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        int[]array = new int[size];
        System.out.println("enter the elements");
        for(int i=0; i<size; i++){
            array[i]= sc.nextInt();
        }
     int count=0;
     for(int i=1; i<size; i++){
        int j;
        for( j=0; j<i; j++)
            if(array[i] == array[j])
            break;
        if(i==j)
            count++;

     }
     System.out.println(count);
    }

    
}
