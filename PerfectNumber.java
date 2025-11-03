public class PerfectNumber {

    public static boolean perfect(int num) {

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 28;
        perfect(num);
        if (perfect(num)) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }

    }

}
