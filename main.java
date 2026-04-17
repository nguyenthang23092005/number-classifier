public class NumberClassifier {

    public static String classifyNumbers(int n) {
        if (n <= 0) {
            return "Invalid input";
        }

        String result = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result += i + ": Even\n";
            } else {
                result += i + ": Odd\n";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(classifyNumbers(5));
    }
}