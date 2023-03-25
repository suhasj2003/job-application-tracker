package com.suhasj2003.jobapptrack.users;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    
    @OneToOne(mappedBy = "application")
    private Long userID;
    

}
