package com.hassan.JamatStatus;

import java.math.BigInteger;

public class Person
{
    private String id;
    private String password;
    private String name;
    private String phoneNumber;
    private String currentCity;
    private String currentState;
    private String currentCountry;
    private String modeOfTransport;

    public Person(String id, String password, String name, String phoneNumber, String currentCity, String currentState, String currentCountry, String modeOfTransport) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.currentCity = currentCity;
        this.currentState = currentState;
        this.currentCountry = currentCountry;
        this.modeOfTransport = modeOfTransport;
    }

    public Person(){}

    @Override
    public String toString(){
        return String.format("ID %s: %s (%s) is currently in %s, %s, %s and travelling by %s.", this.id,
                this.name,this.phoneNumber,this.currentCity,this.currentState,this.currentCountry,this.modeOfTransport);
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

}
