package com.arabbank.evouchers;

import java.util.ArrayList;

public class BalanceRequest {
    private String username;
    private String password;
    private ArrayList<Object> data;

    public BalanceRequest(String username, String password, ArrayList<Object> data) {
        this.username = username;
        this.password = password;
        this.data = data;


    }

    public BalanceRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }
}
