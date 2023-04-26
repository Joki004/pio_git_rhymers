package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int ARRAY_SIZE = 12;
    private final int ARRAY_FULL = 11;
    private final int ERROR_CODE = -1;
    private int[] NUMBERS = new int[ARRAY_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == ARRAY_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
