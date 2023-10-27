package org.example.model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class cart {
    private int id;
    private User user;
    private ArrayList<cartproduct> cartproducts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<cartproduct> getCartproducts() {
        return cartproducts;
    }

    public void setCartproducts(ArrayList<cartproduct> cartproducts) {
        this.cartproducts = cartproducts;
    }
}
