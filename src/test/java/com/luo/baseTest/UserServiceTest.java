package com.luo.baseTest;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;

import com.luo.domain.User;
import com.luo.service.UserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println("!!!!!!!!!"+user.getUserName() + ":" + user.getUserPassword());
        logger.info("!!!!!!!!!"+user.getUserName() + ":" + user.getUserPassword());
    }  
}