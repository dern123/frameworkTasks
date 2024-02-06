package app.task1.dao;

import app.task1.models.Account;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier
@Repository
public class AccountDAO implements DAO<Account> {
    private static long lastAccountId = 0;
    public Account findByNumber (Account account){
        return account;
    }
    @Override
    public Account save(Account account) {
        account.setId(++lastAccountId);
        return null;
    }

    @Override
    public boolean delete(Account account) {
        return false;
    }

    @Override
    public void deleteAll(List<Account> entities) {

    }

    @Override
    public void saveAll(List<Account> entities) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Account getOne(long id) {
        return null;
    }
}
