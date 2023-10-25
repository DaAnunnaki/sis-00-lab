public class RandomMatrix {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for(int i = 0; i<8; i++) {
            for(int j = 0; j<8; j++) {
                array[i][j] = (int) Math.floor((Math.random()*2)+0);
                System.out.print(array[i][j]);
            }
            System.out.println();
            int r = 0;
            int rzero = 0;
            int c = 0;
            for(int j = 0; j<8; j++) {
                switch(array[i][j]) {
                    case 1: r++;
                    if(r==8) {
                        System.out.println("all 1's on the column "+r);
                    } r=0;
                    break;
                    case 0: rzero++;
                    if(r==8) {
                        System.out.println("all 0's on the column "+r);
                    } rzero=0; 
                    break;
                }
            }
            switch(array[i][j]) {
                    case 1: r++;
                    if(r==8) {
                        System.out.println("all 1's on the row "+r);
                    } break;
                    case 0: rzero++;
                    if(r==8) {
                        System.out.println("all 0's on the row "+r);
                    } break;
                }
          
        }

   
    }
}

/*
 * RandomMatrix.java: Write a program that randomly fills in 0s and 1s into an 8 x 8 checker board, 
 * prints the board, and finds the rows, columns, or diagonals with all 0s or 1s. 
 * Use a two dimensional array to represent a checkerboard. Here is a sample run of the program:
10101000
10100001
11100011
10100001
11100111
10000001
10100111
00100001
All 0's on the minor diagonal
 */