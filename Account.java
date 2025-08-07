class Client {
    private String name;
    private long accNo;
    private double balance;
    private int pwd;

    // Constructor
    Client(String name, long accNo, double balance, int pwd) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        this.pwd = pwd;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public long getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public int getPwd() {
        return pwd;
    }

    // Setter methods
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}

public class Account {
    public static void main(String[] args) {
        Client c = new Client("Sikendra", 21324, 344.4, 3455435);

        // Accessing private fields via getter methods
        System.out.println("Name: " + c.getName());
        System.out.println("Account Number: " + c.getAccNo());
        System.out.println("Balance: " + c.getBalance());
        System.out.println("Password: " + c.getPwd());
    }
}
