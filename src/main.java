import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<FibTestDataPoint> iterList = new ArrayList<>();
        List<FibTestDataPoint> recurList = new ArrayList<>();


        for (int i = 2; i <= 25; i++) {
            FibIterative iter = new FibIterative(i);
            iter.start();
            iterList.add(iter.getDataPoint());
            FibRecursive recur = new FibRecursive(i);
            recur.start();
            recurList.add(recur.getDataPoint());
        }

        try {
            FibCSV.WriteFibCSV(iterList, recurList);
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
