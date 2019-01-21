package com.multipolar.bootcamp.spring.appecommerce.service;
import com.multipolar.bootcamp.spring.appecommerce.entity.Detail_transaksi;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private DetailTransaksiRepository transaksidetailRepository;

    public Iterable<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public Optional<Transaksi> findById(String id) {
        return this.transaksiRepository.findById(id);
    }

    @Transactional
    public Transaksi pembelian(Transaksi transaksi) {
        List<Detail_transaksi> newDetail = transaksi.getDetails();
        transaksi = transaksiRepository.save(transaksi);
        for (Detail_transaksi details : newDetail) {
            details.setTransaksi(transaksi);
            transaksidetailRepository.save(details);
        }
        Optional<Transaksi> transaksiOptional = transaksiRepository.findById(transaksi.getId());
        return transaksiOptional.get();
    }
}
