package ltd.hengpro.libproject.serivce.impl;

import jakarta.annotation.Resource;
import ltd.hengpro.libproject.entity.User;
import ltd.hengpro.libproject.mapper.UserMapper;
import ltd.hengpro.libproject.serivce.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}
