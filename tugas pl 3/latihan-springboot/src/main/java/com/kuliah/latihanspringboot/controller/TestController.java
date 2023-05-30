package com.kuliah.latihanspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

@Controller
@RequestMapping(value = "/api")
@Slf4j
public class TestController {

    @GetMapping(value = "/login")
    public String openLoginPage(HttpServletResponse httpServletResponse, HttpServletRequest request){
        log.info("Selamat anda berhasil masuk ke halaman login");
        return "login";


    }
    @GetMapping(value = "/register")
    public String openRegisterPage(HttpServletResponse httpServletResponse, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman register");
        return "register";
    }

    @GetMapping(value = "/dashboard")
    public String openDashboardPage(HttpServletResponse httpServletResponse, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman dashboard");
        return "dashboard";
    }
}