create table toko
(
  id     varchar(64)  not null primary key,
  nama   varchar(100) not null,
  alamat text,
  no_tlp varchar (30)

) engine = InnoDB;

insert into toko(id, nama, alamat,no_tlp) values
('001', 'Happy Cookies', 'Antapani','085797953068'),
('002', 'Elektronik Bahagia', 'Jakarta','086764565476'),
('003', 'Fashion Beauty', 'Cicadas','086764576394');

