create table produk
(
  id     varchar(64)  not null primary key,
  kode   varchar(64)  not null ,
  nama   varchar(100) not null,
  harga  varchar(100) not null,
  id_toko varchar(64)  not null
) engine = InnoDB;

insert into produk(id, kode, nama, harga,id_toko) values
('001', 'F001', 'Choco Crunchy','23000','001'),
('002', 'D001', 'Flower Hijab','30000','002'),
('003', 'E001', 'HP Siomay X+','10500000','003');

alter table produk
  add constraint fk_produk_toko foreign key (id_toko)
    references toko (id) on update cascade on delete cascade;

