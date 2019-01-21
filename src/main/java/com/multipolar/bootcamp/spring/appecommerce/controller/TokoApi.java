package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/toko")
public class TokoApi {

    @Autowired
    private TokoRepository repository;

    @GetMapping("/list")
    public Iterable<Toko> findAll() {
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Toko> save(@RequestBody Toko toko) {
        toko = repository.save(toko);
        return ResponseEntity.ok(toko);
    }

    @PutMapping("/")
    @Transactional
    public ResponseEntity<Toko> updateNamaToko(@RequestBody Toko toko) {
        repository.updateNamaToko(toko.getNama(), toko.getId());
        return ResponseEntity.ok(toko);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Toko> findById(@PathVariable("id") String id) {
        Optional<Toko> penerbitOptional = repository.findById(id);
        if (penerbitOptional.isPresent())
            return ResponseEntity.ok(penerbitOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @GetMapping("/findByNama")
    public List<Toko> findByNama(@RequestParam("nama") String nama){
        return repository.findByNama(nama);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Toko> penerbitOptional = repository.findById(id);
        if (penerbitOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else return ResponseEntity.noContent().build();
    }
}
