create database Creative_shop;


use Creative_shop;

create table cadastroClientes(
	id_client int primary key auto_increment,
    nome varchar (220),
    idade int,
    endereco varchar (250),
    numero int,
    bairro varchar (120),
    cep char(9),
    uf char(2));
    