package controller;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mangs on 17. 2. 2.
 */
@RestController
public class UserController {
    @Autowired
    private UserDao dao;

    @RequestMapping("/userList")
    public List getAllListForBeanPropertyRowMapper() {
        return dao.getUserAllList();
    }
}
