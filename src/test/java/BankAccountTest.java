import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Mike", "Wazowski", "1995-08-17", "1234567890");
    }

//Test Getters

    @Test
    public void canGetFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "Mike";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetLastName() {
        String actual = bankAccount.getLastName();
        String expected = "Wazowski";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth() {
        String actual = String.valueOf(bankAccount.getDateOfBirth());
        String expected = "1995-08-17";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber() {
        String actual = bankAccount.getAccountNumber();
        String expected = "1234567890";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetBalance() {
        double actual = bankAccount.getBalance();
        double expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    //Test Setters
    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Mike");
        assertThat(bankAccount.getFirstName()).isEqualTo("Mike");
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Wazowski");
        assertThat(bankAccount.getLastName()).isEqualTo("Wazowski");
    }

    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth("1995-08-17");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("1995-08-17");
    }

    @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber("1234567890");
        assertThat(bankAccount.getAccountNumber()).isEqualTo("1234567890");
    }

    @Test
    public void canSetBalance() {
        bankAccount.setBalance();
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }


// DEPOSIT
    @Test
    public void canDeposit() {
        double actual = bankAccount.deposit(80);
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }


// WITHDRAWAL
    @Test
    public void canWithdraw() {
        double actual = bankAccount.withdrawal(30);
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }

// INTEREST
    @Test
    public void canAddInterest() {
        double actual = bankAccount.interest(0.03);
        double expected = bankAccount.getBalance();
        assertThat(actual).isEqualTo(expected);
    }


}