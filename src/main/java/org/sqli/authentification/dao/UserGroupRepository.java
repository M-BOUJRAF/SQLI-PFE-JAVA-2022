package org.sqli.authentification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sqli.authentification.entitie.User_Group;

@Repository
public interface UserGroupRepository extends JpaRepository<User_Group, Integer> {
}
