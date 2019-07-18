create database cargabd;

use cargabd;

create table docente(
	id_docente integer auto_increment primary key,
    nombre varchar(25) not null,
    apellido_paterno varchar(25) not null,
    apellido_materno varchar(25) not null
);

create table carga_academica(
	id_carga integer auto_increment primary key,
    semestre_academico varchar(10) not null,
    numero_horas_semanales integer not null,
    id_docente integer not null,
    foreign key (id_docente) references docente(id_docente)
);

insert into docente(nombre, apellido_paterno, apellido_materno)
values ("Fredy", "Barrientos", ""), ("Damaris", "Solier", "");

insert into carga_academica(semestre_academico, numero_horas_semanales, id_docente) 
values ("2019 I", 16, 1), ("2019 I", 12, 2); 
