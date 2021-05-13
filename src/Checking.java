public class Checking extends Account{

    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, String sSN, double balance) {
        super(name, sSN, balance);
        this.setAccountNumber("2" + this.getAccountNumber());
        this.setDebitCardDetails();
        System.out.println("New Checking Account created");
    }

    private void setDebitCardDetails(){
        this.debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        this.debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){

        super.showInfo();
        System.out.println("This is a checking account");
        System.out.println(
                "DebitCardNumber=" + debitCardNumber +
                ",\nDebitCardPin=" + debitCardPin +
                ",\nRate=" + rate + "%"
        );
    }

    @Override
    public String toString() {
        return "Checking{" +
                "debitCardNumber=" + debitCardNumber +
                ", debitCardPin=" + debitCardPin +
                '}';
    }

    @Override
    public void setRate() {
        this.rate = getBaseRate() * .15;
    }
}
