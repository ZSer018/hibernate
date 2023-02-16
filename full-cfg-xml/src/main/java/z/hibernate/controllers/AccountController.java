package z.hibernate.controllers;

import org.hibernate.SessionFactory;
import z.hibernate.dao.AccountDAO;
import z.hibernate.entities.Account;
import z.hibernate.utils.HibernateUtil;

public class AccountController implements DAOController<Account, String>{

   private final SessionFactory sessionFactory;

   public AccountController() {
      sessionFactory = HibernateUtil.getSessionFactory();
   }

   @Override
   public void create(Account account) {
      new AccountDAO(sessionFactory).create(account);
   }

   @Override
   public Account read(String query) {
      return new AccountDAO(sessionFactory).read(query);
   }

   @Override
   public void update(Account account) {
      new AccountDAO(sessionFactory).update(account);
   }

   @Override
   public void delete(Account account) {
      new AccountDAO(sessionFactory).delete(account);
   }
}
