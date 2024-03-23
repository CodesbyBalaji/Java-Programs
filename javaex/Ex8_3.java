import java.util.Scanner;

class Ex8_3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int[][] matrixA = getMatrixInput(ss, "Enter matrix A:");
        int[][] matrixB = getMatrixInput(ss, "Enter matrix B:");

        performMatrixOperation(matrixA, matrixB, "Addition");
        performMatrixOperation(matrixA, matrixB, "Subtraction");
        performMatrixOperation(matrixA, matrixB, "Mulitiplication");

        ss.close();
    }

    public static int[][] getMatrixInput(Scanner ss, String message) {
        System.out.println(message);
        System.out.print("Enter number of rows: ");
        int rows = ss.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = ss.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = ss.nextInt();
            }
        }
        return matrix;
    }

    public static void performMatrixOperation(int[][] matrixA, int[][] matrixB, String operation) {
        System.out.println("Matrix " + operation + " Result:");
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                switch (operation) {
                    case "Addition":
                        result[i][j] = matrixA[i][j] + matrixB[i][j];
                        break;
                    case "Subtraction":
                        result[i][j] = matrixA[i][j] - matrixB[i][j];
                        break;
                    case "Multiplication":
                        result[i][j] += matrixA[i][j] * matrixB[i][j];
                        break;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
