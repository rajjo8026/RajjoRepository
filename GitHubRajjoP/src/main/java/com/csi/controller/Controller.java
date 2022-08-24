package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public String sayName() {
        return "RANJIT BHOSALE" ;
    }

    @GetMapping
    public String changesByYogesh() {
        return "Chenges made by yogeshwar Please review and do needful if any" ;
    }
}
