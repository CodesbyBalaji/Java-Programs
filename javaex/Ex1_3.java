public class Ex1_3 {
    public static void main(String[] args) {
        int rows = 4;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}