import java.util.Scanner;
public class Linear {
    public static void main(String[] args){
        Scanner num=new Scanner (System.in);
        int[] a=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter the array element a["+i+"]=");
            a[i]=num.nextInt();
        }
        System.out.print("Enter the search element :");
        int key=num.nextInt();
        for (int i=0;i<=10;i++){
            if(key==a[i]){
                System.out.println("The element at index of : "+i);
                break;
            }
        }
    }
}