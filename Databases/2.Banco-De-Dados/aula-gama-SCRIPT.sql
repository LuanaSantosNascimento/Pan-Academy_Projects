use banco_aula_gama;

##Modificando as colunas "quantidade e valor" da tabela pedidos_produtos
UPDATE pedidos_produtos SET quantidade = 1, valor = 62.30 
WHERE idProduto = 1;

UPDATE pedidos_produtos SET quantidade = 1, valor = 107.44 
WHERE idProduto = 2;

UPDATE pedidos_produtos SET quantidade = 1, valor = 69.90 
WHERE idProduto = 3;

UPDATE pedidos_produtos SET quantidade = 1, valor = 20.00
WHERE idProduto = 4;

##Seleção de dados com Join (Inner, left, right)
SELECT * FROM pedidos INNER JOIN clientes ON clientes.id = pedidos.idCliente;
SELECT pedidos.id, pedidos.data, pedidos.valorTotal , clientes.nomeCliente, clientes.telefone  FROM pedidos INNER JOIN clientes ON clientes.id = pedidos.idCliente;

SELECT pedidos.id, pedidos.data, pedidos.valorTotal , clientes.nomeCliente, clientes.telefone, produtos.nome as NomeProduto FROM pedidos 
INNER JOIN clientes ON clientes.id = pedidos.idCliente
INNER JOIN pedidos_produtos ON pedidos_produtos.idPedido = pedidos.id
INNER JOIN produtos ON pedidos_produtos.idProduto = produtos.id order by pedidos.id;

SELECT pedidos.id, pedidos.data, pedidos.valorTotal , clientes.nomeCliente, clientes.telefone, produtos.nome as NomeProduto FROM pedidos 
LEFT JOIN clientes ON clientes.id = pedidos.idCliente
INNER JOIN pedidos_produtos ON pedidos_produtos.idPedido = pedidos.id
INNER JOIN produtos ON pedidos_produtos.idProduto = produtos.id order by pedidos.id;

SELECT pedidos.id, pedidos.data, pedidos.valorTotal , clientes.nomeCliente, clientes.telefone, produtos.nome as NomeProduto FROM pedidos 
RIGHT JOIN clientes ON clientes.id = pedidos.idCliente
INNER JOIN pedidos_produtos ON pedidos_produtos.idPedido = pedidos.id
INNER JOIN produtos ON pedidos_produtos.idProduto = produtos.id order by pedidos.id;

SELECT pedidos.id, pedidos.data, pedidos.valorTotal , clientes.nomeCliente, clientes.telefone, produtos.nome as NomeProduto FROM pedidos 
FULL JOIN clientes ON clientes.id = pedidos.idCliente
INNER JOIN pedidos_produtos ON pedidos_produtos.idPedido = pedidos.id
INNER JOIN produtos ON pedidos_produtos.idProduto = produtos.id order by pedidos.id;

################Seleção com uniões
SELECT  id, nome, telefone FROM fornecedores UNION SELECT  id, nomeCliente, telefone FROM clientes;

##Paginação de dados / seleções
SELECT  id, nomeCliente, telefone FROM clientes LIMIT 3 OFFSET 1;

###Agrupamento de daods
select COUNT(*) as QuantidadePedidos FROM pedidos;

select SUM(valorTotal) as Valor_total_dos_pedidos, idCliente, clientes.nomeCliente  
FROM pedidos inner join clientes on clientes.id = pedidos.idCliente group by idCliente;

select * from clientes order by id desc;
select * from clientes order by cpf asc;

###Não deixa inserir cpf duplicado
create unique index cpf_unico on clientes (cpf);
###Priorização de "colunas"
create index nome_rapido on clientes (nomeCliente);

####VIEWS

create view Pedido_Completo as 
	select
		pedidos.id, pedidos.data, pedidos.valorTotal, produtos.nome as Nome_Produto, clientes.nomeCliente , clientes.telefone,
		(select data from pedidos p where p.id = pedidos.id) as Nova_Data
	from pedidos
	INNER JOIN clientes ON clientes.id = pedidos.idCliente
	INNER JOIN pedidos_produtos ON pedidos_produtos.idPedido = pedidos.id
	INNER JOIN produtos ON pedidos_produtos.idProduto = produtos.id order by pedidos.id;

select * from pedido_completo;
select * from pedido_completo where id = 1;


