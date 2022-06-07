package com.example.userregistration.service;

import com.example.userregistration.dto.ForgotPWDDto;
import com.example.userregistration.dto.LoginDto;
import com.example.userregistration.dto.ResponseDto;
import com.example.userregistration.dto.UserDto;
import com.example.userregistration.model.User;
import org.springframework.http.ResponseEntity;

public interface IUserService {

    public ResponseEntity<ResponseDto> createAccount(UserDto userDto);
    public ResponseEntity<ResponseDto> getAll();
    public User getById(String id);
    //public ResponseEntity<ResponseDto> login(LoginDto loginDto);
    public ResponseEntity<ResponseDto> forgotPwd(ForgotPWDDto forgotPWDDto);

    public ResponseEntity<ResponseDto> verify(String token);


    public ResponseEntity<ResponseDto> loginUser(LoginDto dto);
}