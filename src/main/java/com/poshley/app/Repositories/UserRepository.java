package com.poshley.app.Repositories;

import com.poshley.app.Components.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired public App app;

}
