import com.ldy.config.SpringConfig;
import com.ldy.mapper.AccountMapper;
import com.ldy.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Tset01 {
    @Test
    public void test01(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountMapper mapper = ac.getBean(AccountMapper.class);
        List<Account> accounts = mapper.getAllAccounts();
        for (Account account : accounts){
            System.out.println(account);
        }

    }
}
