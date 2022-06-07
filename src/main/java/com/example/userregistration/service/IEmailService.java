package com.example.userregistration.service;

import com.example.userregistration.dto.ResponseDto;
import com.example.userregistration.model.Email;
import org.springframework.http.ResponseEntity;

public interface IEmailService {

    public ResponseEntity<ResponseDto> sendMail(Email email);

    public String getLink(String token);
}