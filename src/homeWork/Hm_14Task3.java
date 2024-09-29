package homeWork;

public class Hm_14Task3 {
    public static Integer findSecondLargest(int[] nums){
        if (nums.length < 2) {
            return null;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;

            }
        }
        return second == Integer.MIN_VALUE ? null : second;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 9, 3};
        System.out.println("Второе по величине число: " + findSecondLargest(array));
    }
}
