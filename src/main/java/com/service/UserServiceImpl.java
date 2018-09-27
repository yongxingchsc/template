package com.service;

import com.entity.User;
import com.entity.UserExample;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findBaseDictWithTypeCode(String id) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andNameEqualTo(id);
        List<User> users = mapper.selectByExample(userExample);

        return users;
    }
}
