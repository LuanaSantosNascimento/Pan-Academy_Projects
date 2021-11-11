#Criando o database/schemas
create schema bancopan;
show databases;
use bancopan;
drop database panacademy;

##Criando a tabela
create table categoria_filmes(
	id int unsigned not null auto_increment,
	nome varchar(60),
	classificacao enum('0', '12', '16', '18') not NULL,
	unique KEY(nome),
	primary key(id)
)engine=innoDB;

#Inserindo dados
show tables;
insert into categoria_filmes(nome, classificacao) values ("Fantasia", "12");
insert into
	categoria_filmes(nome, classificacao) 
values 
	("Aventura", "0"),
	("Infantil", "0"),
	("Com�dia", "12"),
	("Terror", "18"),
	("Fic. Cientif�ca", "12");

insert into categoria_filmes values(100, "Drama", "12");
insert into categoria_filmes values(7, "Document�rio","0");
insert into categoria_filmes(nome, classificacao) values("Document�rio","0");
insert into categoria_filmes values(8, "Suspense", "12");
insert into categoria_filmes (nome, classificacao) values ("Romance", '12');

#Fazendo consultas
select * from categoria_filmes;
select * from categoria_filmes order by classificacao ;
select * from categoria_filmes where classificacao = "12" order by nome;
select nome, classificacao from categoria_filmes;
select count(*) as "Total de linhas" from categoria_filmes ;
select count(*) as "Filmes com categoria 12" from categoria_filmes where classificacao = "12";
select max(classificacao) as "Classifica��o M�xima" from categoria_filmes;
select min(classificacao) as "Classifica��o M�nima" from categoria_filmes;
select id, concat(nome, ' - ', classificacao) as "Nome - Classifica��o" from categoria_filmes;

select sum(id) as Total from categoria_filmes;
select avg(id) as M�dia from categoria_filmes;
select * from categoria_filmes cf  order by id desc;
select * from categoria_filmes cf  order by id asc;
select * from categoria_filmes cf  group by id order by id desc;
select count(*) as Total, classificacao from categoria_filmes group by classificacao order by Total;
select count(*) as Total, classificacao, group_concat(nome) as Gen�ros from categoria_filmes group by classificacao order by Total;

##Deletando informa��es / linhas
delete from categoria_filmes where id = 102;
delete from categoria_filmes where id = 7;

###############################################################--Atividade
##Criando a tabela
create table estados(
	id int unsigned not null auto_increment,
	nome varchar(60),
	sigla enum('AC', 'AL', 'AP', 'AM', 'BA', 'CE',
	'DF', 'ES', 'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB',
	'PR', 'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 'SP',
	'SE', 'TO') not NULL,
	regiao enum('Norte', 'Nordeste', 'Centro-Oeste', 'Sul', 'Sudeste') not NULL,
	populacao double,
	unique KEY(nome),
	primary key(id)
)engine=innoDB;

show tables;
select * from estados;
insert into 
	estados(nome, sigla, regiao,populacao) 
values
		("Esp�rito Santo", "ES", "Sudeste",4400000),
		("Rio de Janeiro", "RJ", "Sudeste",66000000);

	insert into 
	estados(nome, sigla, regiao,populacao) 
values
		("Amazonas", "AM", "Norte",4400000)
		("Acre", "AC", "Norte",66000000),
		("Bahia", "BA", "Nordeste",1500000),
		("Pernambuco", "PE", "Nordeste",92700000),
		("Santa Catarina", "SC", "Sul",700000),
		("Rio Grande do Sul", "RS", "Sul",11000000),
		("Goi�s", "GO", "Centro-Oeste",660000),
		("Mato Grosso", "MT", "Centro-Oeste",320000);

#Estados ordenados por sigla
select * from estados order by sigla;
#Popula��o total de cada regi�o
select sum(populacao) as Total, regiao from estados group by regiao;
#M�dia da popula��o por regiao
select avg(populacao) as M�dia, regiao from estados group by regiao;
#Agrupar estados por regi�o
select regiao as Regi�o,group_concat(nome) as Estados from estados group by regiao order by regiao;



