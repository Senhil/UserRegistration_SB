package com.example.userregistration.dto;

public class UpdatePWDDto {
    private String newPassword;
    private String conformPassword;

    public UpdatePWDDto(String newPassword, String conformPassword) {
        this.newPassword = newPassword;
        this.conformPassword = conformPassword;
    }
}