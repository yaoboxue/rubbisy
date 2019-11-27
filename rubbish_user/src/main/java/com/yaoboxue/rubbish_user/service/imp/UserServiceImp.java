package com.yaoboxue.rubbish_user.service.imp;

import com.yaoboxue.rubbish_user.bean.UmsMember;
import com.yaoboxue.rubbish_user.mapper.UserMapper;
import com.yaoboxue.rubbish_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> UmsMembersList = userMapper.selectAlluser();
        return UmsMembersList;
    }
}
