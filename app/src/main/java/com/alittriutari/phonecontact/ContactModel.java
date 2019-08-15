package com.alittriutari.phonecontact;

import java.io.Serializable;

public class ContactModel{
    public String name;
    public String image;
    public String number;

    public ContactModel() {
        this.name = name;
        this.image = image;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



}
