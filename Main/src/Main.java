public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        double average =  average(nums);

        System.out.println("The average is: " + average);
    }
    // Non-working average function (needs a fix)
    public static double average(int[] numbers) {
// Placeholder: This function is incomplete and currently returns 0
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;


    }
}