public class ApproximatePI {
    public static void main(String[] args) {
        int maxIterations = 100000;
        double piApproximation = 0;

        for (int i = 1; i <= maxIterations; i++) {
            double term = (i % 2 == 0) ? -1.0 / (2 * i - 1) : 1.0 / (2 * i - 1);
            piApproximation += 4 * term;

            if (i % 10000 == 0) {
                System.out.println("i=" + i + " PI approximate: " + piApproximation);
            }
        }
    }
}
