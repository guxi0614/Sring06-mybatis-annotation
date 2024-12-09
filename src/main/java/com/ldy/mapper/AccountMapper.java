package com.ldy.mapper;

import com.ldy.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AccountMapper {

    @Select("SELECT * FROM account WHERE ac_id = #{acId}")
    Account getAccountById(Integer acId);

    @Select("SELECT * FROM account")
    List<Account> getAllAccounts();

    @Insert("INSERT INTO account(ac_name, balance) VALUES(#{acName}, #{balance})")
    @Options(useGeneratedKeys = true, keyProperty = "acId")
    void insertAccount(Account account);

    @Update("UPDATE account SET ac_name = #{acName}, balance = #{balance} WHERE ac_id = #{acId}")
    void updateAccount(Account account);

    @Delete("DELETE FROM account WHERE ac_id = #{acId}")
    void deleteAccount(Integer acId);
}
