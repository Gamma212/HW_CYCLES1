public class FrelansServis {
    public int calculate(int income, int expenses, int threshold) {
        int maney = 0;
        int mants = 0;
        for (int i = 0; i < 12; i++) {
            if (maney >= threshold) {
                maney = maney - expenses;
                maney /= 3;
                mants++;


            } else {
                maney = maney + income;
                maney = maney - expenses;
            }

        }
        return mants;

    }
}
