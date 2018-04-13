package com.belive24hrs.belive24hrs.login.dto;

/**
 * Created by Akash on 4/12/2018.
 */

public class Response {
    private String firstName;
    private String lastName;
    private String email;
    private String api_token;
    private String phone;
    private String zip_code;
    private String address;
    private String imageUrl;
    private String fcmId;
    private String role;
    private String status;
    private String isProfileDataSaved;
    private String policyCount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApi_token() {
        return api_token;
    }

    public void setApi_token(String api_token) {
        this.api_token = api_token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFcmId() {
        return fcmId;
    }

    public void setFcmId(String fcmId) {
        this.fcmId = fcmId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsProfileDataSaved() {
        return isProfileDataSaved;
    }

    public void setIsProfileDataSaved(String isProfileDataSaved) {
        this.isProfileDataSaved = isProfileDataSaved;
    }

    public String getPolicyCount() {
        return policyCount;
    }

    public void setPolicyCount(String policyCount) {
        this.policyCount = policyCount;
    }
}
