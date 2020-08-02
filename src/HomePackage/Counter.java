package HomePackage;

public class Counter
{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void setCount() {
        this.count = count + 1;
    }
}
