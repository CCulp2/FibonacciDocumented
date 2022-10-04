public class FibIterative extends Fib {

    public FibIterative(int positionInSequence) {
        super(positionInSequence);
    }

    public void start() {
        long startTime = System.nanoTime();

        if (positionInSequence <= 1) {
            dataPoint.setTime(System.nanoTime() - startTime);
            dataPoint.setFibNum(1);
        } else {

            fibNumber = 1;
            int previousFibNumber = 1;

            for (int i = 2; i < positionInSequence; i++) {
                int temp = fibNumber;
                fibNumber += previousFibNumber;
                previousFibNumber = temp;
            }

            dataPoint.setTime(System.nanoTime() - startTime);
            dataPoint.setFibNum(fibNumber);
        }
    }
}
