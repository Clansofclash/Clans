package AgeofClans.domain;

public class Point {
    private String latVal;
    private String longVal;

    public String getLatVal() {
        return latVal;
    }

    public void setLatVal(String latVal) {
        this.latVal = latVal;
    }

    public String getLongVal() {
        return longVal;
    }

    public void setLongVal(String longVal) {
        this.longVal = longVal;
    }

    public Point(String latVal, String longVal) {
        this.latVal = latVal;
        this.longVal = longVal;
    }
}
