public class midtermPractice {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 1; i<=9; i++) {
            for(int x = 0; x<=i; x++) {
                System.out.print(" ");
            }
            for(int y = i; y<=n; y++) {
                System.out.print(y);
            }
            for(int z = n; z>i; z--) {
                System.out.print(z);
            }
            for(int a = 0; a<=i; a++) {
                System.out.print(" ");
            }
            System.out.println();
        }


        int count = 0;
        while(count++<9) {
            System.out.println(count);
        }
    }
}
