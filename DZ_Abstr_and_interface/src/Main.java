//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static SimpleAccount debit = new SimpleAccount();
    static CreditAccount credit = new CreditAccount(-200_000);
    public static void main(String[] args) {

        showInfo();
        debit.add(150_000);
        credit.add(150_000);
        showInfo();
        debit.pay(200_000);
        credit.pay(100_000);
        showInfo();

        debit.transfer(credit,50_000);
        showInfo();
        debit.add(600_000);
        debit.transfer(credit, 250_000);
        showInfo();
    }
    static void showInfo() {
        System.out.println("На счету дебита " + debit.getBalance());
        System.out.println("На счету кредита " + credit.getBalance());
    }
}