public class Functional {
    public static void main(String[] args) {
        System.out.println(compare(1,2));
    }

    public static String compare(int a, int b) {
        if (a > b) {
            return "a is bigger than b";
        }
        if (a < b) {
            return "b is bigger than a";
        }
        return "a and b are the same";
    }
}
