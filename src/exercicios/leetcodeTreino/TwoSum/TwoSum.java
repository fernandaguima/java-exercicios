package exercicios.leetcodeTreino.TwoSum;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {4, 1, 6, 3};
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices encontrados:");
                    System.out.println(i + " , " + j);
                }
            }
        }
    }
}