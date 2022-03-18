package org.sqli.authentification.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private boolean enabled;

    @Column
    private Integer loginAttempts;

    @ManyToOne
    private User_Group group_id;
}
