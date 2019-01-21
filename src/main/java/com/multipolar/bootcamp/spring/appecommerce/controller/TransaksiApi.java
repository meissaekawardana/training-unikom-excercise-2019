package com.multipolar.bootcamp.spring.appecommerce.controller;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiApi {

    @Autowired
    private TransaksiService service;

    @GetMapping("/list")
    public Iterable<Transaksi> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaksi> findById(@PathVariable("id") String id) {
        Optional<Transaksi> transaksiOptional = service.findById(id);
        if (transaksiOptional.isPresent())
            return ResponseEntity.ok(transaksiOptional.get());
        else
            return ResponseEntity.noContent().build();
    }


}

