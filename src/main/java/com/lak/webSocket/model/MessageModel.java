package com.lak.webSocket.model;

public class MessageModel {

    private String message;
    private String formLogin;

    public MessageModel(String message, String formLogin) {
        this.message = message;
        this.formLogin = formLogin;
    }

    public MessageModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormLogin() {
        return formLogin;
    }

    public void setFormLogin(String formLogin) {
        this.formLogin = formLogin;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", formLogin='" + formLogin + '\'' +
                '}';
    }
}
