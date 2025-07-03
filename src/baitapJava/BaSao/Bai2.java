package baitapJava.BaSao;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String n = scanner.nextLine();
        String result = TimChuoiDoiXungDaiNhat(n);
        System.out.println("Chuỗi con đối xứng dài nhất: " + result);
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
    public static String TimChuoiDoiXungDaiNhat(String s) {
        String result = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (CheckChuoiDoiXung(sub) && sub.length() > maxLen) {
                    result = sub;
                    maxLen = sub.length();
                }
            }
        }

        return result;
    }

}
