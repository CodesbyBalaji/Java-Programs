import java.util.Scanner;
public class java{
    public static void main(String args[]){

        Scanner ss=new Scanner(System.in);
        int[][] matrixA=getinput(ss,"Enter MatrixA: ");
        int[][] matrixB=getinput(ss,"Enter MatrixB: ");
        performoperation(matrixA,matrixB,"Addition");
        performoperation(matrixA,matrixB,"Subtraction");
        performoperation(matrixA,matrixB,"Multiplication");
}
    public static int[][] getinput(Scanner ss,String message){
        System.out.println(message);
        System.out.println("Enter the number of rows: ");
        int rows=ss.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols=ss.nextInt();
        int[][] matrix=new int[rows][cols];

        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=ss.nextInt();
            }
        }
        return matrix;
    }
    public static void performoperation(int[][] matrixA, int[][] matrixB, String operation) {
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

