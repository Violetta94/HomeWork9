import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
    }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                sum+=arr[i];
            }
            System.out.println(Arrays.toString(arr));
            // task 1
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

            //task 2
            System.out.println();
            int max=0;
            int min=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                } if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей».");

            //task 3
            System.out.println();
            float middle;
            middle=(float)sum/arr.length;
            System.out.println(middle);


            //task 4
            System.out.println();
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length-1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
            return arr;

        }

}