import java.util.Scanner;
public class sayantan{
    public static void main(String[] args){
        int r;
        float  area,perimeter;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        area=((float)3.14 *(float) (r * r));
        perimeter=((float) 3.14*(float) (2* r));
        System.out.printf("%.2f
", area);
        System.out.printf("%.2f",perimeter);
    }
}