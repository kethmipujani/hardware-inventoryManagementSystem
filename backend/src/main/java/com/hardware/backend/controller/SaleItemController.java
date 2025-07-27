package com.hardware.backend.controller;

import com.hardware.backend.model.SaleItem;
import com.hardware.backend.repository.SaleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sale-items")
public class SaleItemController {

    @Autowired
    private SaleItemRepository saleItemRepository;

    @GetMapping
    public List<SaleItem> getAllSaleItems() {
        return saleItemRepository.findAll();
    }

    @PostMapping
    public SaleItem addSaleItem(@RequestBody SaleItem saleItem) {
        return saleItemRepository.save(saleItem);
    }
}
