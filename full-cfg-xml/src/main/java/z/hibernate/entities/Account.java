package z.hibernate.entities;

import lombok.Data;

@Data
public class Account {

    private String accountNumber;
    private int moneyAvailable;
    private String currencyType;
    private Person person;


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", moneyAvailable=" + moneyAvailable +
                ", currencyType='" + currencyType + '\'' +
                '}';
    }
}
