package Class;

public class Account {
    public static void main(String[] args) {

        Account Rahul = new Account();
        Rahul.Deposit(1000);
        Rahul.Withdrawal(80);
        Rahul.Deposit(5000);
        Rahul.Withdrawal(1000);


    }


    private double balance;
    private String number;
    private String CustomerName;
    private String CustomerEmailAddress;
    private String CustomerPhoneNumber;


    public void Deposit(double DepositMoney) {
       this.balance += DepositMoney;
        System.out.println(" Deposited " + DepositMoney + " and Your Current Balance is " + this.balance + "." );
    }
    public void Withdrawal(double WithdrawMoney) {
        if(this.balance - WithdrawMoney <0) {
            System.out.println("You Have Insufficient Balance.");
        }
        else{
            this.balance -= WithdrawMoney;
            System.out.println(" Withdrawal of " +
                    WithdrawMoney + " is Processed. " + this.balance +
                    " is your Current Balance.");

        }


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.CustomerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.CustomerPhoneNumber = customerPhoneNumber;
    }
}
