package com.ldy.mapper;

import com.ldy.pojo.Account;
import java.util.List;

public interface AccountMapper {
    Account getAccountById(int acId);
    
    List<Account> getAllAccounts();
    
    int insertAccount(Account account);
    
    int updateAccount(Account account);
    
    int deleteAccount(int acId);
}
