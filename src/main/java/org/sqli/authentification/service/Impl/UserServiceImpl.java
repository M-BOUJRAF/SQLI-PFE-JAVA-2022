package org.sqli.authentification.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sqli.authentification.dao.UserGroupRepository;
import org.sqli.authentification.dao.UserRepository;
import org.sqli.authentification.entitie.User;
import org.sqli.authentification.service.UserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserGroupRepository groupRepo;

//    @Override
//    public void chargeTable() {
//        Connection connection = ConnectionDb.getConnection();
//
//        try{
//            Statement st= connection.createStatement();
//            userRepo.save(st.executeQuery("SELECT * FROM USER"));
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public List<User> loginUser() {
        return userRepo.findAll();

    }
}
