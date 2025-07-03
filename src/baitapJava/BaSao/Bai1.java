package baitapJava.BaSao;

public class Bai1 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 27;
        System.out.println(twoSum(numbers, target));
    }
    static String twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                String s = "Output: ["+(left + 1)+","+(right + 1)+"]";
                return s;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "Không có số thỏa mãn ";
    }
}
