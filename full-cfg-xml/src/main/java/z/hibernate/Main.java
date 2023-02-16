package z.hibernate;

import z.hibernate.controllers.AccountController;
import z.hibernate.controllers.PersonController;
import z.hibernate.entities.Account;
import z.hibernate.entities.Person;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.personQuery();
        //main.accountQuery();
    }

    void personQuery(){
        final PersonController personController = new PersonController();
        Person person;

        //TODO Create
 /*       person = new Person();
        person.setFirstName("Bennu");
        person.setLastName("Hill");
        personController.create(person);*/

        //TODO read
        person = personController.read("5");
        System.out.println("result: "+ person.toString());

        //TODO update
/*        person = new Person();
        person.setId(15);
        person.setFirstName("Paulo");
        person.setLastName("Cartasar");
        personController.update(person);*/

        //TODO delete
/*        person = new Person();
        person.setId(29);
        personController.delete(person);*/
    }

    void accountQuery(){
        final AccountController accountController = new AccountController();
        Account account;

        //TODO Create
 /*       account = new Account();
        account.setAccountNumber("2738-2323-6542-7653");
        account.setMoneyAvailable(10000);
        account.setCurrencyType("Rub");
        account.setPerson(new PersonController().read("10"));
        accountController.create(account);*/

        //TODO read
        account = accountController.read("6962-6821-2196-2038");
        System.out.println(account);

        //TODO update
        /*account = accountController.read(10);
        account.setMoneyAvailable(1090990);
        accountController.update(account);*/

        //TODO delete
        /*account = accountController.read(14);
        accountController.delete(account);*/
    }

}
