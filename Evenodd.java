
    import java.util.Scanner;
    public class Evenodd {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number:");
            int num=sc.nextInt();
            sc.close();
            System.out.println((num % 2 ==0) ? "Even" :" Odd");
        }
    }  

