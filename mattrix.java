public class mattrix {
    public static void main(String[] args) {
        int[][] matri=new int[2][2];
        int[][] matrix1 =new int[2][2];
        int[][] sum =new int[2][2];
        matrix1[0][0]=4;
        matrix1[0][1]=9;
        matrix1[1][0]=7;

        matri[0][0]=5;
        matri[0][1]=9;
        matri[1][0]=6;
int i,j;
        for(i=0;i<1;i++) {
            for (j = 0; j < i; j++) {
                sum[i][j] = matrix1[i][j] + matri[i][j];
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++) {
                System.out.print(matrix1[i] [j]);
            }
            System.out.println("");
        }
    }
}

