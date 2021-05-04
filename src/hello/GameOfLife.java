package hello;

public class GameOfLife {

    public static void main(String[] args) {
                char[][] field = {
            {'.', 'X', '.', 'X', '.'},
            {'.', '.', 'X', 'X', '.'},
            {'.', 'X', 'X', 'X', '.'},
            {'.', '.', '.', '.', '.'},
            {'X', 'X', '.', 'X', '.'}
        };
 
//        char[][] field = new char[15][50];
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[i].length; j++) {
//                if (Math.random() < 0.25) {
//                    field[i][j] = 'X';
//                } else {
//                    field[i][j] = '.';
//                }
//            }
//        }
 
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println("0-----------------");
 
        for (int i = 1; i <= 50; i++) {
            char[][] newField = new char[field.length][field[0].length];
            for (int y = 0; y < field.length; y++) {
                for (int x = 0; x < field[y].length; x++) {
                    int kk = 0;
                    if (y > 0) {
                        kk += (x > 0 && field[y-1][x-1] == 'X') ? 1 : 0;
                        kk += (field[y-1][x] == 'X') ? 1 : 0;
                        kk += (x < field[y-1].length - 1 && field[y-1][x+1] == 'X') ? 1 : 0;
                    }
                    kk += (x > 0 && field[y][x-1] == 'X') ? 1 : 0;
                    kk += (x < field[y].length - 1 && field[y][x+1] == 'X') ? 1 : 0;
                    if (y < field.length - 1) {
                        kk += (x > 0 && field[y+1][x-1] == 'X') ? 1 : 0;
                        kk += (field[y+1][x] == 'X') ? 1 : 0;
                        kk += (x < field[y+1].length - 1 && field[y+1][x+1] == 'X') ? 1 : 0;
                    }
                    if (field[y][x] == 'X') {
                        if (kk == 2 || kk == 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '.';
                        }
                    } else {
                        if (kk == 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '.';
                        }
                    }
                }
            }
            for (int y = 0; y < newField.length; y++) {
                for (int x = 0; x < newField[y].length; x++) {
                    System.out.print(newField[y][x]);
                }
                System.out.println();
            }
            System.out.print(i);
            System.out.println("-----------------");
            field = newField;
        }
    }
}
