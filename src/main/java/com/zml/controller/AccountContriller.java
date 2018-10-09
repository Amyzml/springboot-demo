package com.zml.controller;

import com.zml.dao.AccountDao;
import com.zml.entity.Account;
import com.zml.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountContriller {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private AccountMapper accountMapper;

    @GetMapping("/user")
    @ResponseBody
    public String save(){
        Account account = new Account();
        account.setName("rosejsfs");
        account.setPassword("123456");
       // accountDao.save(account);
        //accountMapper.save(account);
        System.out.println(accountMapper.findById(1));
        System.out.println(accountMapper.findAll().size());
        return "hello,user";
    }
}
