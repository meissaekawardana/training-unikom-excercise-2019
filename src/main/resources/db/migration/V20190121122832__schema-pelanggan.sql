create table pelanggan
(
  id     varchar(64)  not null primary key,
  nama   varchar(100) not null,
  alamat text,
  no_tlp varchar (30) not null

) engine = InnoDB;

insert into pelanggan(id, nama, alamat,no_tlp) values
('001', 'Ratna', 'Antapani','085797953975'),
('002', 'Tuti', 'Jakarta','086764563648'),
('003', 'Udin', 'Cicadas','086764576980');

