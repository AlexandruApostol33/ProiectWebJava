package com.example.proiectalex.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;
    @NotNull(message =  "Name can't be empty")
    private String name;
    @NotNull(message =  "Address can't be empty")
    private String address;
    @NotNull(message =  "Phone Number can't be empty")
    private String phoneNumber;

    public Shop() {
    }

    public Shop(int shopId, String name, String address, String phoneNumber) {
        this.shopId = shopId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Shop(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
