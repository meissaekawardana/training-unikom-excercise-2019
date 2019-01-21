create table detail_transaksi
(
  id             varchar(64) not null primary key,
  id_transaksi   varchar(64) not null,
  id_produk      varchar(64) not null
) engine = InnoDB;
