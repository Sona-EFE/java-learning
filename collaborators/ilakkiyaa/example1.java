import java.util.Scanner;

class example1{
    public static void main(String args[])
    {
      Scanner scan= new Scanner(System.in);
      String name= scan.nextLine();
      int age =scan.nextInt();
      System.out.println("My name is "+name);
      System.out.print("My age is "+age); 
      scan.close();
       
    }
}