package vn.edu.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.edu.fit.models.User;
import vn.edu.fit.services.UserServices;

@Controller
public class UserController {

    @Autowired
    public UserServices userServices;

    @GetMapping("users/{id}")
    @ResponseBody
    public String getUserById(@PathVariable String id){

        long usrid = Long.parseLong(id);

        User user = userServices.getUserById(usrid).orElse(new User());

        return user.toString();
    }
}
