package baitapJava.BaSao;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi lớn: ");
        String n = scanner.nextLine();
        System.out.println("Nhập chuỗi bé: ");
        String n2 = scanner.nextLine();
        String result = minString(n,n2);
        System.out.println("Output : " + result);
    }
    static String minString(String bigString,String smallString){
        String result = "";
        int minLen = Integer.MAX_VALUE;;
        for (int i = 0; i < bigString.length(); i++) {
            for (int j = i + 1; j <= bigString.length(); j++) {
                String sub = bigString.substring(i, j);
                if(checkString(sub,smallString) && sub.length() < minLen){
                    result = sub;
                    minLen = sub.length();
                }

            }
        }
        return result;
    }
    static boolean checkString(String bigString,String smallString){
        String[] chars = smallString.split("");
        int count =0;
        for (String s : chars) {
            if (!bigString.contains(s)) {
                return  false;
            }
            count ++;
        }
        if(count == chars.length){
            return true;
        }else
        return false;
    }
}
