import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FibCSV {
    public static void WriteFibCSV(List<FibTestDataPoint> iter, List<FibTestDataPoint> recur) throws FileNotFoundException {
        String filename = createFileName();
        FileOutputStream file = new FileOutputStream(filename, true);
        PrintWriter pw = new PrintWriter(file);
        pw.println("Fib Number, Iterative Time, Recursive Time");
        for (int i = 0; i <= iter.size() - 1; i++) {
            FibTestDataPoint iterPoint = iter.get(i);
            FibTestDataPoint recurPoint = recur.get(i);
            pw.println(fibEntryBuilder(iterPoint, recurPoint));
        }
        pw.close();

    }

    private static String createFileName() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMddHHmm-ss");
        LocalDateTime now = LocalDateTime.now();
        String datetimeInString = dtf.format(now);
        StringBuilder nameOfFile = new StringBuilder();
        nameOfFile.append(datetimeInString);
        nameOfFile.append("FibSeq.csv");
        return nameOfFile.toString();
    }

    private static String fibEntryBuilder(FibTestDataPoint iter, FibTestDataPoint recur) {
        StringBuilder str = new StringBuilder(iter.getFibNumToString() + "," + iter.getTimeToString() + "," + recur.getTimeToString());
        return str.toString();

    }
}
