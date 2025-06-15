import java.util.Scanner;

public class baitap2 {
    static int sum(int day, int money){
        return day*money;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền làm 1 ngày: " );
        int money = scanner.nextInt();
        System.out.println("Nhập số ngày làm việc: " );
        int day = scanner.nextInt();
        System.out.println("Tổng số tiền là: " +sum(day,money));
        scanner.close();
    }
}
