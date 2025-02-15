package il.co.mm2001.model;

public class IntNumber {
    private int num;

    public IntNumber() {
        this.num = 0;
    }

    public IntNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void increment() {
        num++;
    }

    public void decrement() {
        num--;
    }
}
