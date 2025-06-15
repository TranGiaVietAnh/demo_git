import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
//        String greet = "Hello cyber";
//        System.out.println(greet.length());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số tuổi:");
//        int age = sc.nextInt();
//        if(age >= 18){
//            System.out.println("Đủ tuổi học đại học");
//        }else{
//            System.out.println("Chưa đủ tuổi học đại học");
//        }
//        String rs = (age >18) ? "Đủ tuổi học đại học" :"Chưa đủ tuổi học đại học";
//        System.out.println(rs);
        // Nhập thông tin khách hàng
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập tên khách hàng: ");
//        String tenKhachHang = scanner.nextLine();

//        System.out.print("Nhập số Kw tiêu thụ: ");
//        double soKw = scanner.nextDouble();
//
//        double tienDien = 0;
//
//        // Tính tiền điện theo quy tắc
//        if (soKw <= 50) {
//            tienDien = soKw * 500;
//        } else if (soKw <= 100) { // Từ 51 đến 100 Kw
//            tienDien = (50 * 500) + ((soKw - 50) * 650);
//        } else if (soKw <= 200) { // Từ 101 đến 200 Kw (50 đầu + 50 kế + 100 kế)
//            tienDien = (50 * 500) + (50 * 650) + ((soKw - 100) * 850);
//        } else if (soKw <= 350) { // Từ 201 đến 350 Kw (50 đầu + 50 kế + 100 kế + 150 kế)
//            tienDien = (50 * 500) + (50 * 650) + (100 * 850) + ((soKw - 200) * 1100);
//        } else { // Còn lại
//            tienDien = (50 * 500) + (50 * 650) + (100 * 850) + (150 * 1100) + ((soKw - 350) * 1300);
//        }
//
//        // Xuất kết quả
//        System.out.println("\n--- HÓA ĐƠN TIỀN ĐIỆN ---");
//        System.out.println("Tên khách hàng: " + tenKhachHang);
//        System.out.println("Số Kw tiêu thụ: " + soKw + " Kw");
//        System.out.println("Tổng tiền điện phải trả: " + tienDien + " VNĐ");
        System.out.print("Nhập N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int sumEven = 0;
        for(int i=1;i<= n; i++){
           sum +=i;
           if(i%2==0){
               sumEven +=i;
           }
        }
        System.out.println("Tổng từ 1 đến n " + sum);
        System.out.println("Tổng chẵn từ 1 đến n " + sumEven);
        scanner.close();
    }
}
