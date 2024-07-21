package hocjava;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Mời nhập giá trị x =");
        x = scan.nextInt();
        System.out.println("Gía trị x="+x);
        System.out.println("Mời bạn nhập một chuỗi kí tự :");
        String ss = scan.nextLine();
        System.out.println("Chuỗi bạn vừa nhâp là:"+ss);
    }
}
