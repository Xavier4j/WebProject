package vip.wefun.service;

import vip.wefun.pojo.Boss;

public interface UserService {


    Boolean updateUserinfo(Boss boss);

    Boolean deletUser(Boss boss);

}
