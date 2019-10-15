package vip.wefun.dao;

import vip.wefun.pojo.Boss;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface UserDao {

    int update(Boss boss);

    int delete(Boss boss);
}
