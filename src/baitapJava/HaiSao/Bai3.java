package baitapJava.HaiSao;

import java.util.HashMap;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String n = scanner.nextLine();
        System.out.println("Chuỗi trả về: "+ RemoveDupChar(n));
    }
    static String RemoveDupChar(String input){
        HashMap<Character,Integer> seen = new HashMap<>();
        String result = "";
        for (char c : input.toCharArray()) {
            if (!seen.containsKey(c)) {
                seen.put(c,1);
                result+=c;
            }
        }
        return result;
    }
}
