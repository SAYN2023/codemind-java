import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x1 = read.nextInt();
        int x2 = read.nextInt();
        if(x1>x2){
           System.out.printf("%d",x1);
        }
        else{
         System.out.printf("%d",x2);
        }
    }
}