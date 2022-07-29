package AdditionalHomework3_1;

public class Chessboard {
    public static void main(String[] args) {

        char[][] chess = new char[4][12];

        for (int i = 0; i < 4; i += 2) {
            for (int j = 0; j < 12; j += 2) {
                chess[i][j] = '*';
            }

            for (int a = 1; a < 4; a += 2) {
                for (int j = 1; j < 12; j += 2) {
                    chess[a][j] = '*';
                }

            }

        }

        for (char[] i : chess) {

            System.out.println(i);
        }


    }
}

