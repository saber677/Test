package day05;

/**
 * @author luqiqi
 * @create 2021--12-14:46
 */
public class Day05Test {
    private  int year;
    private  int month;
    private  int day;

    public Day05Test(){

    }

    public Day05Test(int yaer, int month, int day) {
        this.year = yaer;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "生日信息{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
