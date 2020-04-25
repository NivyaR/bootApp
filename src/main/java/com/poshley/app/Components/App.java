package com.poshley.app.Components;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.poshley.app.Controllers.appController;
import com.poshley.app.Entities.UserEntity;
import com.poshley.app.Services.DBConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.util.UUID;

@Component
public class App {

    @Autowired public DBConnectService dbConnectService;

    public String CreateUser(JsonObject userDetails) throws Exception {

        String insertAccount = "insert into nivya.user(username,phonenumber,dob,updateddate) values (?,?,?,?)";
        PreparedStatement preparedStatement = dbConnectService.mysqlConnection().prepareStatement(insertAccount);
        preparedStatement.setString(1, userDetails.get("username").getAsString());
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        preparedStatement.setString(2, userDetails.get("phonenumber").getAsString());
        preparedStatement.setString(3, userDetails.get("dob").getAsString());
        preparedStatement.setString(4, date.toString());

        preparedStatement.execute();

        dbConnectService.mysqlConnection().close();

        return "user account has been created";
    }

}
