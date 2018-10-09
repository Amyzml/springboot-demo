package com.zml.mapper;

import com.zml.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    void save(Account account);

    @Select("select * from t_account")
    List<Account> findAll();

    @Select("select * from t_account where id = #{id}")
     Account findById(@Param("id") Integer id);
}
