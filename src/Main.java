import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //lệnh xuất
        System.out.println("heloo");
        Scanner scanner = new Scanner(System.in);

        //ye cầu cho phép người dùng nhập tên mình v xuất ra màn hình
        System.out.println("vui lòng nhập tên người dùng");
        //nhập giá trị người dùng và gắn vào biến
        String name = scanner.nextLine();
        //xuất ra màn hình
        System.out.println("vui lòng nhập tên lớp");
        String classStu = scanner.nextLine();
        System.out.println("vui lòng nhập tuổi người dùng");
        int age = scanner.nextInt();
        System.out.println("Xin chào:" + name + " lớp "+classStu+ " tuổi "+age);

    }
}