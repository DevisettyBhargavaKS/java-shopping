package org.example.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class order {
    private int id;
    private Date date;
    private User user;
    private cart cart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public org.example.model.cart getCart() {
        return cart;
    }

    public void setCart(org.example.model.cart cart) {
        this.cart = cart;
    }
}
