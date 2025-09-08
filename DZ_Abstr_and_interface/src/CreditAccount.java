public class CreditAccount extends Account{

    private int limit;

    public CreditAccount(int limit) {
        this.limit = limit;
    }

    @Override
    boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    boolean pay(long amount) {
        if (balance - amount >= limit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
