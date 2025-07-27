package com.hardware.backend.controller;

import com.hardware.backend.model.Sale;
import com.hardware.backend.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SaleController {

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @PostMapping
    public Sale addSale(@RequestBody Sale sale) {
        return saleRepository.save(sale);
    }
}
