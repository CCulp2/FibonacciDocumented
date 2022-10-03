import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class FibCSV {
    String filename;
    FileOutputStream file;

    public void WriteFibCSV(List<FibTestDataPoint> iter, List<FibTestDataPoint> recur) throws FileNotFoundException {
        filename = createFileName();
        file = new FileOutputStream(filename, true);
        PrintWriter pw = new PrintWriter(file);
        pw.println("Iterative, FibNum, Time, Recursive, FibNum, Time");
        for (int i = 0; i == iter.size(); i++) {
            FibTestDataPoint iterPoint = iter.get(i);
            FibTestDataPoint recurPoint = recur.get(i);
            pw.println(fibEntryBuilder(iterPoint, recurPoint));
        }
        pw.close();

    }

    private String createFileName() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMddHHmm");
        LocalDateTime now = LocalDateTime.now();
        String datetimeInString = dtf.format(now);
        StringBuilder nameOfFile = new StringBuilder();
        nameOfFile.append(datetimeInString);
        nameOfFile.append("FibSeq.csv");
        return nameOfFile.toString();
    }

    private String fibEntryBuilder(FibTestDataPoint iter, FibTestDataPoint recur) {
        StringBuilder str = new StringBuilder("," + iter.getFibNumToString() + "," + iter.getTimeToString() + ",," +
                recur.getFibNumToString() + "," + recur.getTimeToString());
        return str.toString();

    }
}
