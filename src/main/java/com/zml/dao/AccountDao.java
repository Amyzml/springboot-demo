package com.zml.dao;
import com.zml.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Account account){
        String sql = "INSERT into t_account(id,name,password) values(?,?,?)";
        jdbcTemplate.update(sql,account.getId(),account.getName(),account.getPassword());
    }
}
