package com.example.proiectalex.controller;

import com.example.proiectalex.model.Shop;
import com.example.proiectalex.service.ShopService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
@Validated
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {

        this.shopService = shopService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Shop>> getAllShops(){
        return ResponseEntity.ok().body(shopService.getAllShops());
    }
}
