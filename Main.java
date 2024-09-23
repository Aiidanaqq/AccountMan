public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "Aidana Kokumova");

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(100);
        account.deposit(300);

        System.out.println("Current Balance: " + account.getBalance());

        account.printTransactionHistory();
    }
}
