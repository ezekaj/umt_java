
public class App {

    public static void main(String[] args) throws Exception {
        int[] num = {1, 4, 7, 124, 123, 22};
        int max;

        max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("The largest number in this array is " + max);
    }
}
