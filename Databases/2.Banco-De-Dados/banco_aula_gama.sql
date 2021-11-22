-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Nov-2021 às 19:04
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_aula_gama`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nomeCliente` varchar(50) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `telefone` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nomeCliente`, `cpf`, `telefone`) VALUES
(1, 'Gabriela Silva', '101.270.170-03', '(11)3719-9570'),
(2, 'Vitor Vieira', '090.307.540-79', '(14)3517-6796'),
(3, 'Danilo Augusto', '152.719.230-02', '(16)3830-7443'),
(4, 'Giovane Cuerva', '399.963.640-89', '(13)3578-1225');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `id` int(11) NOT NULL,
  `nome` varchar(70) NOT NULL,
  `telefone` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`id`, `nome`, `telefone`) VALUES
(1, 'Mariana', '(11)3761-7887');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `valorTotal` double NOT NULL,
  `data` datetime NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedidos`
--

INSERT INTO `pedidos` (`id`, `valorTotal`, `data`, `idCliente`) VALUES
(1, 259, '2021-11-22 17:47:55', 4),
(2, 20, '2021-11-22 17:47:55', 3),
(3, 169.74, '2021-11-22 17:47:55', 1),
(4, 20, '2021-11-22 17:47:55', 1),
(5, 177.04, '2021-11-22 17:47:55', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidos_produtos`
--

CREATE TABLE `pedidos_produtos` (
  `idProduto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedidos_produtos`
--

INSERT INTO `pedidos_produtos` (`idProduto`, `idPedido`, `quantidade`, `valor`) VALUES
(1, 1, 1, 62.3),
(2, 1, 1, 107.44),
(3, 1, 1, 69.9),
(4, 1, 1, 20),
(4, 2, 1, 20),
(2, 3, 1, 107.44),
(1, 3, 1, 62.3),
(4, 4, 1, 20),
(3, 5, 1, 69.9),
(2, 5, 1, 107.44);

-- --------------------------------------------------------

--
-- Estrutura stand-in para vista `pedido_completo`
-- (Veja abaixo para a view atual)
--
CREATE TABLE `pedido_completo` (
`id` int(11)
,`data` datetime
,`valorTotal` double
,`Nome_Produto` varchar(200)
,`nomeCliente` varchar(50)
,`telefone` varchar(14)
,`Nova_Data` datetime
);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `quantidade`, `valor`) VALUES
(1, 'Bloco XL espiral aquarelle A4 300g Canson BL 30 FL', 250, 62.3),
(2, 'Aquarela Bisnaga Misci 6 ml 24 cores Artools', 150, 107.44),
(3, 'Kit Pincel Giotto Taklon Redondo Série 500-7 pinceis', 500, 69.9),
(4, 'Godê Para Pintura Sinoart Com Tampa', 456, 20);

-- --------------------------------------------------------

--
-- Estrutura para vista `pedido_completo`
--
DROP TABLE IF EXISTS `pedido_completo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pedido_completo`  AS SELECT `pedidos`.`id` AS `id`, `pedidos`.`data` AS `data`, `pedidos`.`valorTotal` AS `valorTotal`, `produtos`.`nome` AS `Nome_Produto`, `clientes`.`nomeCliente` AS `nomeCliente`, `clientes`.`telefone` AS `telefone`, (select `p`.`data` from `pedidos` `p` where `p`.`id` = `pedidos`.`id`) AS `Nova_Data` FROM (((`pedidos` join `clientes` on(`clientes`.`id` = `pedidos`.`idCliente`)) join `pedidos_produtos` on(`pedidos_produtos`.`idPedido` = `pedidos`.`id`)) join `produtos` on(`pedidos_produtos`.`idProduto` = `produtos`.`id`)) ORDER BY `pedidos`.`id` ASC ;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cpf_unico` (`cpf`),
  ADD KEY `nome_rapido` (`nomeCliente`);

--
-- Índices para tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cliente` (`idCliente`);

--
-- Índices para tabela `pedidos_produtos`
--
ALTER TABLE `pedidos_produtos`
  ADD KEY `fk_produto` (`idProduto`),
  ADD KEY `fk_pedido` (`idPedido`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `pedidos_produtos`
--
ALTER TABLE `pedidos_produtos`
  ADD CONSTRAINT `fk_pedido` FOREIGN KEY (`idPedido`) REFERENCES `pedidos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto` FOREIGN KEY (`idProduto`) REFERENCES `produtos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
