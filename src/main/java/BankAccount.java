import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;


    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = LocalDate.parse(dateOfBirth);
    this.accountNumber = accountNumber;
    this.balance = 0;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }


    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getBalance() {
    return balance;
    }
    public void setBalance() {
        this.balance = balance;
    }

// DEPOSIT
    public double deposit(int amountDeposited) {
        return this.balance += amountDeposited;
    }

// WITHDRAWAL
    public double withdrawal(int amountWithdrawn) {
        return this.balance -= amountWithdrawn;
    }

// INTEREST
    public double interest(double interestRate) {
        return this.balance += (this.balance * interestRate);
    }



}




