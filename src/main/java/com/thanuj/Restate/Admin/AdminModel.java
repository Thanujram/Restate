package com.thanuj.Restate.Admin;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @Column(name = "email")
    private String emailId;

    @Column(name = "password")
    private String password;

    public double getId(){
        return (this.id);
    }

    public void setId(double id){
        this.id=id;
    }

    public String getEmailId(){
        return (this.emailId);
    }

    public void setEmailId(String emailId){
        this.emailId=emailId;
    }

    public String getPassword(){
        return (this.password);
    }

    public void setPassword(String password){
        this.password=password;
    }
}
