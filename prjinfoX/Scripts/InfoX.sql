-- a linha abaixo cria um banco de dados
create database dbinfox;
-- a linha abaixo seleciona o banco de dados a ser utilizado
use dbinfox;
create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null 
);

-- o comando abaixo descreve a tabela
desc tbusuarios;

-- a linha  abaixo insere dados na tabela(CRUD)
-- create - INSERT
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(1,'José de Assis', '9999-9999','joseassis', '123456');
-- a linha abaixo exibe os dados da tabela (CRUD)
-- read -> select
select * from tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(2,'Administrador', '9999-9999','admin', 'admin');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(3,'Bill Gates', '9999-9999','bill', '123456');

-- a linha abaixo modifica dados na tabela (CRUD)alter
-- update
update tbusuarios set fone='8888-8888' where iduser=2;

-- a linha abaixo apaga um registro da tabela
-- delete -> delete
delete from tbusuarios where iduser=3;

-- criando tabela  clientes
create table tbcliente(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

desc tbclientes;

insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Linus Torvalds','Rua Tux 2015','9999-9999','linux@linux.com');

select * from tbclientes;

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(50),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

select * from tbos;

insert into tbos (equipamento,defeito,servico,tecnico,valor, idcli)
values ('Noteboook','Não Liga','Troca da Fonte','Zé',87.50,1);

-- o codigo abaixo tras informaçoes de duas tabelas
select
O.os,equipamento,defeito,servico,valor,
C.nomecli,fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);