package controller;

import dao.UserDao;
import dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import response.APIResponseCode;
import response.APIResponseJson;

import java.util.List;

/**
 * Created by mangs on 17. 2. 2.
 */
@RestController
public class UserController {
    @Autowired
    private UserDao dao;

    @RequestMapping(value = "${mangs.rest.api.path}/userAllList", method= RequestMethod.GET)
    public ResponseEntity getUserAllList() {
        List<User> userList = dao.getUserAllList();
        return new ResponseEntity(APIResponseJson.makeJsonResult(APIResponseCode.G_SUCCESS, userList), HttpStatus.OK);
    }

    @RequestMapping(value = "${mangs.rest.api.path}/userInfo", method= RequestMethod.GET, produces="application/json", consumes="application/x-www-form-urlencoded")
    public ResponseEntity getAUserInfo(
            @RequestParam(value = "email", defaultValue = "") String email) {

        if(email == null || "".equals("email")) {
            return new ResponseEntity(APIResponseJson.makeJsonResult(APIResponseCode.G_INTERNAL_ERROR, ""), HttpStatus.OK);
        }
        else {
            User user = dao.getUserInfo(email);
            if(user != null) {
                return new ResponseEntity(APIResponseJson.makeJsonResult(APIResponseCode.G_SUCCESS, dao.getUserInfo(email)), HttpStatus.OK);
            }
            else {
                return new ResponseEntity(APIResponseJson.makeJsonResult(APIResponseCode.G_INTERNAL_ERROR, ""), HttpStatus.OK);
            }
        }
    }
}
