public class SimpleAccount extends Account{

    @Override
    boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    boolean pay(long amount) {
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
}
