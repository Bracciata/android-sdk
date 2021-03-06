package com.loginradius.androidsdk.response.login;

/**
 * Created by loginradius on 7/30/2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class PhoneNumber implements Serializable{

    @SerializedName("PhoneType")
    @Expose
    private String phoneType;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;

    /**
     *
     * @return
     * The phoneType
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     *
     * @param phoneType
     * The PhoneType
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     *
     * @return
     * The phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     * The PhoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}