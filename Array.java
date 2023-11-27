public class Array {
    public static void main(String args[]) {
        int Num[]= new int[10];
        int K;
        for (int x=0; x<10; x++)
            Num[x] = 1;
        System.out.println( Num[ 0 ] );
        Num[ 3 ] = Num[ 1 ] + Num[ 2 ];
        System.out.println( Num[ 3 ] );
        Num[ 6 ] = Num[ 3 ] + Num[ 4 ] + Num[ 5 ];
        System.out.println( Num[ 6 ] );
        Num[ 7 ] = Num[ 3 ] * Num[ 6 ];
        System.out.println( Num[ 7 ] );
        System.out.println( Num[ 8 ] );
        Num[ 9 ] = Num[ 7 ] * Num[ 8 ];
        System.out.println( Num[ 9 ]);
        for ( K=0; K<Num.length; K++) {
            Num [ K ] = K;
            System.out.print( Num[ K ] + " ");
        }
        System.out.println();
        Num [ 10 ] = 1;
        System.out.println( Num[ 10 ]);
    }
}