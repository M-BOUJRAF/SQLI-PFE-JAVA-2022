package org.sqli.authentification.service;

import org.sqli.authentification.entitie.User;

import java.util.List;

public interface UserService {

//    public void chargeTable();
    public List<User> loginUser();
}
