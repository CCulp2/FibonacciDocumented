public class main {

    public static void main(String[] args) {
        FibIterative fibit = new FibIterative(7);
        FibRecursive fibcur = new FibRecursive(7);
        fibcur.start();
        fibit.start();
        System.out.println("Recursive:");
        System.out.println(fibcur.fibNumber);
        System.out.println(fibcur.timeToComplete);
        System.out.println("Iterative:");
        System.out.println(fibit.fibNumber);
        System.out.println(fibit.timeToComplete);
    }
}
