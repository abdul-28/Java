import java.util.Arrays;

public class ConsecutiveSequence {

    public static int consecutiveSequenceLength(int[] nums) {

        int count = 1;
        int n = nums.length;
        Arrays.sort(nums);
        if (n<=1) {
            return 0;
        }
        else {
            for (int i = 1; i < n; i++) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else if (nums[i] == nums[i - 1] + 1) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 100,4,200,1,3,2};
        int length = consecutiveSequenceLength(arr);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
