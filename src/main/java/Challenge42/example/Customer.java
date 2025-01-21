package Challenge42.example;

public class Customer {

    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount("Aj786","Anwar Jamil");
        bankacc.depositMoney(100);
        bankacc.withdrawMoney(200);
        System.out.println(bankacc.withdrawMoney(200));
        bankacc.depositMoney(-40);
        bankacc.withdrawMoney(0);
    }
}
