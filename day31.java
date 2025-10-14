public class day31 {

        public static void main(String[] args) {
            int a = 7;
            int b = 12;

            System.out.println((a > 5) && (b > 10));  // true && true = true
            System.out.println((a > 5) && (b < 10));  // true && false = false
            System.out.println((a < 5) && (b > 10));  // false && true = false
        }
    }
