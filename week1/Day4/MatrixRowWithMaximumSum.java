package Day4;

import java.util.Scanner;

public class MatrixRowWithMaximumSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows and column : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter the elements : ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE , idx = -1;

        for(int i=0;i<m;i++){

            int currentMax = 0;

            for( int a : mat[i])
                currentMax += a;

            if(currentMax > max){
                idx = i;
                max = currentMax;
            }
        }

        System.out.println("Row with maximum sum : "+idx);
        System.out.println("Sum : "+max);

    }
}
