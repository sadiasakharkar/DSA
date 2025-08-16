package Questions;

public class Occur {
    public static void main(String[] args) {
        int num = 1385757879;
        int target = 7;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == target) {
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
