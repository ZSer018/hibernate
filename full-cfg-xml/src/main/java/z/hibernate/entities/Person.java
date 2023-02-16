package z.hibernate.entities;

import lombok.*;

import java.util.Set;

@NoArgsConstructor
@Data
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Set<Account> accountList;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountList size=" + accountList.size() +
                '}';
    }
}
