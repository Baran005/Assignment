public class Matrixmultiplication {

    public static void main(String [] args) {

        int A[][] = {
                {1, 2, 2},
                {1, 2, 4},
                {1, 3, 6}
        };
        int B[][] = {
                {1, 6, 5},
                {2, 7, 9},
                {3, 8, 4}
        };

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                int sum=0;
                for (int k = 0; k < A[0].length; k++) {
                    sum = sum + A[i][k] * B[k][j];
                }

                System.out.println(sum + " ");

            }
        }
    }
}
