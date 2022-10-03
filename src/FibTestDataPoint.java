public class FibTestDataPoint {
    private Long time;
    private Integer fibNum;

    public String getTimeToString() {
        return time.toString();
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getFibNumToString() {
        return fibNum.toString();
    }

    public void setFibNum(Integer fibNum) {
        this.fibNum = fibNum;
    }
}
