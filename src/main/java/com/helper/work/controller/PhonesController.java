package com.helper.work.controller;

import com.helper.work.entity.Phone;
import com.helper.work.operator.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhonesController {

    @Autowired
    private PhoneService phoneService;

    public PhonesController() {
    }

    @GetMapping("/phones")
    public List<Phone> getAllPhones() {
        return phoneService.list();
    }
}