package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produk")
public class Produk {
    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "kode", nullable = false)
    private String kode;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "harga", nullable = false)
    private String harga;

    @ManyToOne
    @JoinColumn(name = "id_toko", nullable = false)
    private Pelanggan toko;
}
