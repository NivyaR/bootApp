package com.poshley.app.Controllers;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.poshley.app.Components.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class appController {

    @Autowired public App app;

    @RequestMapping(value = "/getapp", method = RequestMethod.GET, produces = "application/json")
    public String getApp(){

        return "Hello nivya";
    }

    @RequestMapping(value = "/createuser", method = RequestMethod.POST, produces = "application/json")
    public String createUser(@RequestBody String userdetails) throws Exception {

        JsonObject userObj = new JsonParser().parse(userdetails).getAsJsonObject();
        String createuser = app.CreateUser(userObj);

        return createuser;
    }

    @RequestMapping(value = "/getuserdetails", method = RequestMethod.GET, produces = "application/json")
    public String getUserDetails(@RequestParam(name = "username") String username) throws Exception {
        
        return "";
    }
}
