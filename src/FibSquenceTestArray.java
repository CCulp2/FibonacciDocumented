import java.util.ArrayList;
import java.util.List;

public class FibSquenceTestArray {
    private List<Integer> fibNumber;
    private List<Long> fibTime;

    public FibSquenceTestArray() {
        fibNumber = new ArrayList<>();
        fibTime = new ArrayList<>();
    }

    public List<Integer> getFibNumber() {
        return fibNumber;
    }

    public void setFibNumber(List<Integer> fibNumber) {
        this.fibNumber = fibNumber;
    }

    public List<Long> getFibTime() {
        return fibTime;
    }

    public void setFibTime(List<Long> fibTime) {
        this.fibTime = fibTime;
    }
}
