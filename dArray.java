import java.util.*;

class dArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] row = new int[n+1][];
        int c = 0;
        for(int i=0;i<=n;i++){
            row[i] = new int[i];
            for(int j=0;j<i;j++){
                row[i][j] = c;
                c++;
                // System.out.println(row[i][j]);
            }
        }


        for(int i=0;i<row.length;i++){
            for(int j=0;j<row[i].length;j++){
                System.out.print(row[i][j] + " ");
            }
            System.out.println();
        }
    }
}