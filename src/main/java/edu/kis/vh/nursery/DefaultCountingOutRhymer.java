package edu.kis.vh.nursery;
/**
 * @brief basic rhymer, last inserted value is returned first
 */
public class DefaultCountingOutRhymer {

    private final int ARRAY_SIZE = 12;
    private final int ARRAY_FULL = 11;
    private final int ERROR_CODE = -1;
    private final int[] NUMBERS = new int[ARRAY_SIZE];

    private int total = -1;
    /**
     * @brief adds value to rhymer numbers
     * @param in - value to add
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }
    /**
     * @brief checks if rhymers is empty
     * @return true if rhymer is empty, else returns false
     */
    public boolean callCheck() {
        return total == ERROR_CODE;
    }
    /**
     * @brief checks if rhymers is full
     * @return true if rhymer is full, else returns false
     */
    public boolean isFull() {
        return total == ARRAY_FULL;
    }
    /**
     * @brief gets latest inserted value
     * @return ERROR when rhymer is empty, or latest inserted value
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }
    /**
     * @brief gets latest inserted value and removes it from rhymer
     * @return ERROR when rhymer is empty, or latest inserted value
     */
    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
