package org.sqli.authentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sqli.authentification.entitie.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
