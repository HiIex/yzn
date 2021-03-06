package com.example.yzn.service;

import com.example.yzn.entity.BillDatabase;
import com.example.yzn.entity.HeadDatabase;
import com.example.yzn.entity.User;
import com.example.yzn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public UserService() {
    }

    public int insert(User user){
        return userMapper.insert(user);
    }

    public int insertBill(BillDatabase billDatabase){
        return userMapper.insertBill(billDatabase);
    }


    public User select(String id){
        return userMapper.select(id);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int delete(String id){
        return userMapper.delete(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public User findByPhone(String phone){
        return userMapper.findByPhone(phone);
    }


    public List<BillDatabase> findAllBill(){
        return userMapper.findAllBill();
    }

    public int insertHead(HeadDatabase headDatabase){
        return userMapper.insertHead(headDatabase);
    }

    public HeadDatabase findHeadByID(String id){
        return userMapper.findHeadByID(id);
    }
}
