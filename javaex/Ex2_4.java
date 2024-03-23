import java.util.Scanner;
public class Ex2_4 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=ss.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=ss.nextInt();
        int[][] matrix=new int[rows][cols];
        int[][] transposedmatrix=new int[rows][cols];
        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=ss.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposedmatrix[j][i]= matrix[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transposedmatrix[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
}
}

