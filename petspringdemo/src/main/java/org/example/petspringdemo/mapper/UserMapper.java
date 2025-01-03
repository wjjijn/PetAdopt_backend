package org.example.petspringdemo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.example.petspringdemo.entity.UserInfo;

@Mapper
public interface UserMapper {

    void insertUser(UserInfo userInfo);

    boolean checkUserName(String username);

    int verify(String username,String password);

    String getIdentity(String username);
}
