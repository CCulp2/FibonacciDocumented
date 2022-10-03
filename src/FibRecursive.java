public class FibRecursive extends Fib {

    public FibRecursive(int positionInSequence) {
        super(positionInSequence);
    }

    public void start() {
        long startTime = System.nanoTime();
        fibNumber = FibRe(positionInSequence);
        timeToComplete = System.nanoTime() - startTime;

    }

    public int FibRe(int n) {
        if (n <= 1) {
            return n;
        } else {
            return FibRe(n - 1) + FibRe(n - 2);
        }
    }

}
