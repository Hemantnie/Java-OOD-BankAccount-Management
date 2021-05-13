public abstract class  Account implements IBaseRate{

    static int index = 10000;

    private  String name;
    private  String sSN;
    private double balance;

    private String accountNumber;
    double rate;

    public Account(String name, String sSN, double balance) {
        this.name = name;
        this.sSN = sSN;
        this.balance = balance;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();// derived classes method will be called.
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueId + randomNumber;
    }

    public String getName() {
        return name;
    }

    public String getsSN() {
        return sSN;
    }

    public double getRate() {
        return rate;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void setRate();

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void showInfo(){
        System.out.println("Account{" +
                "name='" + name + '\'' +
                ", sSN='" + sSN + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", sSN='" + sSN + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
