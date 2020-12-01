public class Pyramid {

    public static void main(String[] args) {

        int n = 9;
        int array[][] = new int[n][n];

        int row = 0;
        int col = 0;
        int step = 0;
        int i = 0;
        int x = 1;
        int c = 1;
        int v = 1;
        int a = 1;


        for (int z = 0; i < n * n - 1; z++) {

            for (int j = 0; j < n - step; j++) {
                array[row][col++] = x;
                i++;
            }
            x++;
            col--;
            ++step;

            for (int k = 0; k < n - step; k++) {
                array[++row][col] = c;
                i++;
            }
            c++;

            for (int l = 0; l < n - step; l++) {
                array[row][--col] = v;
                i++;
            }
            v++;
            ++step;

            for (int m = 0; m < n - step; m++) {
                array[--row][col] = a;
                i++;
            }
            if (n % 2 != 0) {
                for (int b = 0; b < n - step; b++) {
                    array[row][col++] = n;
                }
            }
            a++;
            col++;

        }

        for (int d = 0; d < n; d++) {
            for (int s = 0; s < n; s++) {
                System.out.print(array[d][s] + "\t");
            }
            System.out.println();
        }


    }
}


