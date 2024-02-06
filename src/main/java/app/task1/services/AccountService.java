package app.task1.services;

import app.task1.dao.AccountDAO;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountDAO accountDAO;

    public AccountService(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }


}
