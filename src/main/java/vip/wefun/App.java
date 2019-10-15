package vip.wefun;

import vip.wefun.dao.impl.CarDaoimpl;
import vip.wefun.pojo.Boss;
import vip.wefun.pojo.Conference;
import vip.wefun.service.impl.UserServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {


        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceimpl userServiceimpl = (UserServiceimpl) ac.getBean("userServiceimpl");
        CarDaoimpl carDaoimpl = (CarDaoimpl) ac.getBean("carDaoimpl");

        //初始化汽车信息
        carDaoimpl.init();

        Conference conference = (Conference) ac.getBean("conference");

        System.out.println("会议主题:" + conference.getTheme());

        conference.getBosses()
                .stream()
                .forEach(System.out::println);

        //修改用户信息
        userServiceimpl.updateUserinfo(new Boss());

        //删除用户信息
        userServiceimpl.deletUser(new Boss());

    }
}
