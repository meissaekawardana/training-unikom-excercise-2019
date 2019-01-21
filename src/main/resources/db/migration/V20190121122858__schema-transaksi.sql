create table transaksi
(
  id       varchar(64) not null primary key,
  tanggal  timestamp   not null default now(),
  id_toko  varchar(64) not null,
  id_pelanggan varchar (64) not null
  ) engine = InnoDB;