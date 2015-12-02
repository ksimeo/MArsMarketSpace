package com.ksimeo.arsu.rest.controllers;

import com.ksimeo.arsu.core.models.User;
import com.ksimeo.arsu.rest.services.IUserService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Properties;

/**
 * @author Ksimeo 09.11.2015.
 */
@Controller
public class UserController {

//    @Autowired
    private IUserService userService;
    private ObjectMapper objectMapper = null;


    @RequestMapping(value = "/getuserbylogin", method = RequestMethod.POST, consumes = "application/json",
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public User getUser(@RequestBody String jsonData) {
        try {
            Properties prop = objectMapper.readValue(jsonData, new TypeReference<Properties>(){});
            String login = prop.getProperty("login");
            String password = prop.getProperty("password");
            return userService.getUser(login, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/getallusers", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getUsers();
    }
}