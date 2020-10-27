package com.lti.PracticeEcom.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column(name="username")
    private String userName;
    private String password;
    private String role;

    public int getuser_id() {
        return user_id;
    }

    public void setId(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }


    public String getRoles() {
        return role;
    }

    public void setRoles(String roles) {
        this.role = roles;
    }
    
    @Override
    public String toString() {
    	
    	return "Username= "+userName+" Password= "+password+ " role= "+role;
    }
    
}
