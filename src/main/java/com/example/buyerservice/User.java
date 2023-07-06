package com.example.buyerservice;

import java.util.List;

public class User
{
    Credential credential;

    Userdetail userdetail;

    List<Usertypelink> usertypes;

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public void setUserdetail(Userdetail userdetail) {
        this.userdetail = userdetail;
    }

    public void setUsertypes(List<Usertypelink> usertypes) {
        this.usertypes = usertypes;
    }

    public Credential getCredential() {
        return credential;
    }

    public Userdetail getUserdetail() {
        return userdetail;
    }

    public List<Usertypelink> getUsertypes() {
        return usertypes;
    }
}
