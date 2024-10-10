package com.example.lab7_20210779.controller;
import com.example.lab7_20210779.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*; //postmapping, getmapping
//import javax.validation.Valid;


@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UsersRepository usersRepository;


}
