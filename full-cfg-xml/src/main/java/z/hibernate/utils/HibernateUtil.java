package z.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import z.hibernate.entities.Account;
import z.hibernate.entities.Address;
import z.hibernate.entities.Person;
import z.hibernate.entities.Transaction;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Transaction.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Account.class);

        final StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources( standardServiceRegistry).buildMetadata().buildSessionFactory();


        } catch (Exception e){
            System.out.println(e.getMessage());
            StandardServiceRegistryBuilder.destroy( standardServiceRegistry);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
