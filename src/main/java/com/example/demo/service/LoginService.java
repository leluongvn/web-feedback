package com.example.demo.service;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public boolean registerUser(TaiKhoan user){
        if (taiKhoanRepository.existsById(user.getEmail())){
            return false;
        }

        taiKhoanRepository.save(user);
        return true;
    }

    public String login(String email, String password){
        TaiKhoan taiKhoan = taiKhoanRepository.getOne(email);
        if (taiKhoan == null){

        } else if (!taiKhoan.getTkPassword().equals(password)){

        }

        return "";
    }
}
