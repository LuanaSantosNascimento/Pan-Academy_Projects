use bancopan;
create table if not exists filmes (
	id int unsigned not null auto_increment,
	titulo varchar(255) not null,
    categorias_id int unsigned not null,
    primary key (id),
    foreign key(categorias_id) references categoria_filmes(id)
);

create table if not exists testes (
	id int unsigned not null auto_increment primary key
);

drop table if exists testes;
insert into filmes (titulo, categorias_id)
values ("Steve Jobs", 104);
INSERT INTO categoria_filmes (nome, classificacao)
VALUES ('Aventura', '12' );
INSERT INTO filmes
	(titulo, categorias_id)
VALUES (
	"Senna: O Brasileiro, O Herói, O Campeão",
    (select id from categoria_filmes where nome = "Documentário")
);
INSERT INTO filmes
	(titulo, categorias_id)
VALUES
	("O Poderoso Chefão", (select id from categoria_filmes where nome = "Drama")),
	("Forrest Gump - O Contador de Histórias",  (select id from categoria_filmes where nome = "Comédia")),
    ("O Senhor dos Anéis - O Retorno do Rei", (select id from categoria_filmes where nome = "Aventura"))
;
select * from categoria_filmes cf, filmes f;
select
	f.id,
    titulo,
	nome as categoria
from
	filmes f,
    categoria_filmes cf
where cf.id = f.categorias_id;
select
	f.id,
    titulo,
	nome as categoria
from
	filmes f
inner join categoria_filmes cf
on cf.id = f.categorias_id;
select
	cf.id,
	nome as categoria,
    f.titulo
from
	categoria_filmes cf
inner join filmes f
on f.categorias_id = cf.id ;
create table if not exists diretores (
	id int unsigned not null auto_increment,
	nome varchar(100) not null,
    filme_id int unsigned,
    primary key (id),
    unique key(filme_id),
    foreign key(filme_id) references filmes(id)
);
insert into diretores (nome, filme_id)
values
	("Danny Boyle", 1),
    ("Robert Zemeckis", 5),
    ("Francis Ford Coppola", 3),
    ("Chris Columbus", null);
insert into diretores (nome, filme_id)
values ("Alfonso Cuarón", null);
insert into diretores (nome, filme_id)
values ("Alfonso Cuarónn", 5);
-- joins
select * from filmes f inner join diretores d on f.id = d.filme_id;
select * from filmes f left join diretores d on f.id = d.filme_id;
select * from filmes f right join diretores d on f.id = d.filme_id;
-- simulacao full join
select * from filmes f left join diretores d on f.id = d.filme_id
union
select * from filmes f right join diretores d on f.id = d.filme_id;
-- n para n
create table if not exists atores (
	id int unsigned not null auto_increment,
	nome varchar(100) not null,
    primary key (id)
);
insert into atores (nome)
values ("Tom Hanks"), ("Michael Fassbender");
create table if not exists filme_elenco (
	filme_id int unsigned not null,
    ator_id int unsigned not null,
    primary key(filme_id, ator_id)
);
insert into filme_elenco (filme_id, ator_id)
values (5, 1), (1, 2);
select a.nome, f.titulo
from atores a, filme_elenco fe, filmes f
where a.id = fe.ator_id
and f.id = fe.filme_id;
select * from categoria_filmes;
select * from filmes;
select * from diretores;
select * from atores;
select * from filme_elenco;