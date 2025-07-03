package baitapJava.HaiSao;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String n = scanner.nextLine();
        if(CheckChuoiDoiXung(n)){
            System.out.println(n+" là chuỗi đối xứng");
        }else{
            System.out.println(n +" không phải là chuỗi đối xứng");
        }
    }
    static boolean CheckChuoiDoiXung(String n){
        int indexTrai=0;
        int indexPhai = n.length()-1;
        String[] chars = n.split("");
        while(indexTrai<indexPhai){
            if(!chars[indexTrai].equals(chars[indexPhai])){
                return false;
            }else{
                indexTrai++;
                indexPhai--;
            }

        }
        return true;
    }
}
