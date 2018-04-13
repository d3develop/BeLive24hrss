package com.belive24hrs.belive24hrs.login.dto;

/**
 * Created by Akash on 4/12/2018.
 */

public class LoginResponse {
    private String success;
    private String error;
    private Response response;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
