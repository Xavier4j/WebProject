package vip.wefun.service.impl;

import vip.wefun.dao.UserDao;
import vip.wefun.pojo.Boss;
import vip.wefun.dao.UserDao;
import vip.wefun.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public Boolean updateUserinfo(Boss boss) {

        return userDao.update(boss) > 0;
    }

    @Override
    public Boolean deletUser(Boss boss) {

        return userDao.delete(boss) > 0;
    }
}
