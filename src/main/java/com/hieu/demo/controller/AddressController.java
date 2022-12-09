package com.hieu.demo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hieu.demo.bean.User;
import com.hieu.demo.model.Address;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final User userSingleton;

    @PostMapping
    public String create(@Valid @RequestBody Address address) {
        return "Success";
    }

    @GetMapping
    public void test() {
        System.out.println(userSingleton.hashCode());
        System.out.println(userSingleton);
    }
}
