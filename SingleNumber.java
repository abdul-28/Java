public class SingleNumber {

    public static int singleNumber(int [] nums){

        int res = 0;

        for(int x : nums){

            res ^= x;
        }
        return res;
    }
    public static void main(String[] args) {

        int [] nums = {4,2,1,2,1};
        int singleNum = singleNumber(nums);
        System.out.println(singleNum);

    }
}
