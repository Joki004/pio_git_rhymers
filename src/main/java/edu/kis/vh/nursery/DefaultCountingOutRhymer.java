package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE_OF_ARRAY = 12;
    private final int[] numbers = new int[SIZE_OF_ARRAY];

    private final int RETURN_ERROR = -1;
    public int total = RETURN_ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN_ERROR;
    }

    public boolean isFull() {
        return total == SIZE_OF_ARRAY + RETURN_ERROR;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_ERROR;
        return numbers[total--];
    }

}
