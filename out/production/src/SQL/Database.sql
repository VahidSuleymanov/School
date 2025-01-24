drop table telebeler;
drop table muellimler;
drop table drektorlar;
drop table user_melumatlari;
drop table vezifeler;

create table vezifeler(
id serial primary key,
name varchar(50) not null
);

create table user_melumatlari(
id serial primary key,
ad varchar(50) not null,
soyad varchar(50) not null,
yas int not null,
mekteb int not null,
vezife_id int references vezifeler (id)
);

create table drektorlar(
id serial primary key,
telefon_nomresi varchar(50) not null,
vezife_id int references vezifeler (id),
sexsi_melumatlar int references user_melumatlari(id)
);

create table muellimler(
id serial primary key,
dersler text not null,
vezife_id2 int references vezifeler (id),
sexsi_melumatlar2 int references user_melumatlari(id)
);

create table telebeler(
id serial primary key,
kurs int not null,
vezife_id3 int references vezifeler (id),
sexsi_melumatlar3 int references user_melumatlari(id)
);

insert into vezifeler (name)
values
('Drektor'),
('Muellim'),
('Telebe');

insert into user_melumatlari (ad, soyad, yas, mekteb, vezife_id)
values
('Vahid', 'Suleymanov', 19, 13, 3),
('Seymur', 'Memmedov', 20, 13, 3),
('Aytac', 'Aliyeva', 19, 13, 3),
('Aqil', 'Haciyev', 35, 13, 2),
('Konul', 'Muradova', 40, 13, 2),
('Irade', 'Ibrahimova', 39, 13, 2),
('Sevda', 'Elekberova', 50, 13, 1),
('Aqsin', 'Isayev', 52, 13, 1),
('Tural', 'Veliyev', 48, 13, 1);

insert into drektorlar (vezife_id, telefon_nomresi, sexsi_melumatlar)
values
(1, '0556544585', 7),
(1, '0504521223', 9),
(1, '2703214565', 8);

insert into muellimler (vezife_id2, dersler, sexsi_melumatlar2)
values
(2, 'Tarix', 4),
(2, 'Ingilis-dili', 5),
(2, 'Riyaziyyat', 6);

insert into telebeler (vezife_id3, kurs, sexsi_melumatlar3)
values
(3, 2, 1),
(3, 3, 2),
(3, 2, 3);

select * from vezifeler;
select * from user_melumatlari;
select * from drektorlar;
select * from muellimler;
select * from telebeler;

select user_melumatlari.*, vezifeler.name as vezife_adi
from user_melumatlari
left join vezifeler
on user_melumatlari.vezife_id = vezifeler.id;


select user_melumatlari.*, drektorlar.telefon_nomresi, vezifeler.name as vezife_adi
from drektorlar
left join user_melumatlari
on drektorlar.sexsi_melumatlar = user_melumatlari.id
left join vezifeler
on drektorlar.vezife_id = vezifeler.id;


select user_melumatlari.*, muellimler.dersler, vezifeler.name as vezife_adi
from muellimler
left join user_melumatlari
on muellimler.sexsi_melumatlar2 = user_melumatlari.id
left join vezifeler
on muellimler.vezife_id2 = vezifeler.id;


select user_melumatlari.*, telebeler.kurs, vezifeler.name as vezife_adi
from telebeler
left join user_melumatlari
on telebeler.sexsi_melumatlar3 = user_melumatlari.id
left join vezifeler
on telebeler.vezife_id3 = vezifeler.id;





