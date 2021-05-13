public class Saving extends Account{

    private int safetyDepositBoxId;
    private int safetyDepositBoxPin;

    public Saving(String name, String sSN, double balance) {
        super(name, sSN, balance);
        this.setAccountNumber("1" + this.getAccountNumber());
        setSafetyDepositBoxId();
        System.out.println("New Saving Account created");
    }

    private void setSafetyDepositBoxId(){
        this.safetyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type : Saving");
        System.out.println("Saving{" +
                "safetyDepositBoxId=" + safetyDepositBoxId +
                ",\nsafetyDepositBoxPin=" + safetyDepositBoxPin +
                ",\nrate=" + rate + "%"
                );
    }

    @Override
    public String toString() {
        return "Saving{" +
                "safetyDepositBoxId=" + safetyDepositBoxId +
                ", safetyDepositBoxPin=" + safetyDepositBoxPin +
                '}';
    }

    @Override
    public void setRate() {
        this.rate = getBaseRate() - .25;
    }
}
