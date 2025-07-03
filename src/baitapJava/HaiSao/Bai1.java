package baitapJava.HaiSao;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thu nhập cá nhân trong một năm: ");
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("Nhập thu nhập cá nhân trong một năm phải lớn hơn 0. Yêu cầu nhập lại ");
            n = scanner.nextInt();
        }
        totalTax(n);
    }
    static int tax(int luong){
        int x = 1000000;
        if(luong > 0 && luong <= 5*x){
            return 5;
        }else if(luong > 5*x && luong <= 10*x){
            return 10;
        }else if(luong > 10*x && luong <= 18*x){
            return 15;
        }else if(luong > 18*x && luong <= 32*x){
            return 20;
        }else if(luong > 32*x && luong <= 52*x){
            return 25;
        }else if(luong > 52*x && luong <= 80*x){
            return 30;
        }else{
            return 35;
        }
    }
    static void totalTax(int luong){
        System.out.println("Mức thuế là "+ tax(luong) +"% Thuế thu nhập cá nhân 1 năm là: "+ luong * tax(luong) /100 );
    }
}
