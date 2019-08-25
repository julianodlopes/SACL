-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 28-Set-2015 às 23:42
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `software`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `autenticacao`
--

CREATE TABLE IF NOT EXISTS `autenticacao` (
  `id_autenticacao` smallint(4) NOT NULL AUTO_INCREMENT,
  `id_dept` tinyint(1) NOT NULL,
  `nome_usuario` varchar(50) NOT NULL,
  `hash` varchar(50) NOT NULL,
  `tipo_permissao` varchar(50) NOT NULL,
  PRIMARY KEY (`id_autenticacao`),
  KEY `id_dept` (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `autenticacao`
--

INSERT INTO `autenticacao` (`id_autenticacao`, `id_dept`, `nome_usuario`, `hash`, `tipo_permissao`) VALUES
(1, 1, 'root', '69e7bb80c86f7833802497da162e0daa', 'Controle total');

-- --------------------------------------------------------

--
-- Estrutura da tabela `departamento`
--

CREATE TABLE IF NOT EXISTS `departamento` (
  `id_dept` tinyint(1) NOT NULL AUTO_INCREMENT,
  `nome_dept` varchar(50) NOT NULL,
  `nome_responsavel` varchar(50) NOT NULL,
  `nome_lab` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `departamento`
--

INSERT INTO `departamento` (`id_dept`, `nome_dept`, `nome_responsavel`, `nome_lab`) VALUES
(1, 'DPD', 'Maria Inácia Estevão Costa', 'LBTN');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE IF NOT EXISTS `equipamento` (
  `id_equip` smallint(4) NOT NULL AUTO_INCREMENT,
  `id_dept` tinyint(1) DEFAULT NULL,
  `nome_eq` varchar(50) NOT NULL,
  `modelo_eq` varchar(50) DEFAULT NULL,
  `tag_eq` varchar(20) DEFAULT NULL,
  `patrimonio_eq` varchar(20) DEFAULT NULL,
  `num_funed_eq` varchar(20) DEFAULT NULL,
  `serie_eq` varchar(50) DEFAULT NULL,
  `obs_eq` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_equip`),
  KEY `id_dept` (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=128 ;

--
-- Extraindo dados da tabela `equipamento`
--

INSERT INTO `equipamento` (`id_equip`, `id_dept`, `nome_eq`, `modelo_eq`, `tag_eq`, `patrimonio_eq`, `num_funed_eq`, `serie_eq`, `obs_eq`) VALUES
(1, 1, 'Agitador', 'Thelga', 'AGAQP-03C', '2426967-0', '27348.0', NULL, NULL),
(2, 1, 'Agitador', 'Thelga', 'AGAQP-04C', '2426968-9', '27349.0', NULL, NULL),
(3, 1, 'Armário', NULL, NULL, '2423033-2', NULL, NULL, NULL),
(4, 1, 'Armário', NULL, NULL, '2416504-2', '14266.0', NULL, NULL),
(5, 1, 'Autoclave', 'Phoenix lufergo', 'AUTQP-01C', '2427072-5', '27472.0', NULL, NULL),
(6, 1, 'Centrífuga', 'Analitica', 'CNTQP-08C', '2427161-6', '27579.0', NULL, NULL),
(7, 1, 'Centrífuga', 'Analitica', 'CNTQP-09C', '2427160-8', '27578.0', NULL, NULL),
(8, 1, 'Centrífuga SL 702', 'SOLAB', 'CNTAP-10C', '2427400-3', '27862.0', NULL, NULL),
(9, 1, 'Centrífuga SL 702', 'SOLAB', 'CNTAP-11C', '2427401-1', '27863.0', NULL, NULL),
(10, 1, 'Computador', 'Dell', NULL, NULL, '833.0', NULL, NULL),
(11, 1, 'Eletroporador', 'Eppendorf', NULL, NULL, NULL, NULL, NULL),
(12, 1, 'Estufa', '002 CB FANEM', 'ESTAP-02C', NULL, NULL, 'FANUC 16022', NULL),
(13, 1, 'Estufa de secagem', NULL, 'ESTAP-01C', '2409450-1', '1543.0', NULL, NULL),
(14, 1, 'Fonte de eletroforese', 'LPS 4000V - Loccus', NULL, '2428343-6', '28979.0', NULL, NULL),
(15, 1, 'Fonte de eletroforese', 'Kaswi', NULL, NULL, NULL, NULL, NULL),
(16, 1, 'Freezer -20°C 1', 'Esmaltec', 'FREQP-12C', '2423604-7', NULL, NULL, NULL),
(17, 1, 'Freezer -20°C 2', NULL, 'FREQP-13C', '2415501-2', '14065.0', NULL, NULL),
(18, 1, 'Freezer -80°C', 'Thermo scientific', NULL, '2426161-0', NULL, NULL, NULL),
(19, 1, 'Galão de nitrogênio', NULL, NULL, '2425308-1', '25162.0', NULL, NULL),
(20, 1, 'Geladeira 1', 'Metalfrio', 'GELHI-07B', '2416706-1', '14700.0', NULL, NULL),
(21, 1, 'Geladeira 2', 'Double DC440', 'GELDP-03C', '2419629-0', '15466.0', NULL, NULL),
(22, 1, 'Impressora de código de barras', 'CashWay', 'IPSQP-01C', '2426836-4', '28244.0', NULL, NULL),
(23, 1, 'Macropipetador', 'Pipette Controller', NULL, NULL, NULL, 'CO003492', NULL),
(24, 1, 'Macropipetador', 'Pipette Controller', NULL, NULL, NULL, '003492 REF HSY2091 BRANCA', NULL),
(25, 1, 'Mesa', NULL, NULL, '2418205-2', '11716.0', NULL, NULL),
(26, 1, 'Mesa microondas', NULL, NULL, '2415090-8', '10765.0', NULL, NULL),
(27, 1, 'Microondas', 'Panasonic', 'MCDQP-01C', '2428037-2', '28874.0', NULL, NULL),
(28, 1, 'Micro-ondas (Eladio)', 'Panasonic', 'MCDQP-02C', '2428038-0', '28875.0', NULL, NULL),
(29, 1, 'Microscopio óptico', 'Model L 2000A', 'MICQP-01C', '1522179-2', NULL, NULL, NULL),
(30, 1, 'Nanodrop', 'Thermo scientific nanodrop 2000', 'ESPQP-04C', '2427093-8', NULL, NULL, NULL),
(31, 1, 'pHmetro', 'DM-22 Digimed', 'PHMQP-05C', '2427121-7', '27529.0', NULL, NULL),
(32, 1, 'pHmetro', 'DM-22 Digimed', 'PHMQP-06C', '2427122-5', '27530.0', NULL, NULL),
(33, 1, 'Pipeta - 10 a 100 μl', 'Labmate pro', 'PPAQP-66C', NULL, NULL, '256642221', NULL),
(34, 1, 'Pipeta - 100 a 1000 μl', 'Labmate pro', 'PPAQP-66C', NULL, NULL, '256663789', NULL),
(35, 1, 'Pipeta - 100 a 1000 μl', 'Labmate pro', 'PPAQP-67C', NULL, NULL, '256663758', NULL),
(36, 1, 'Pipeta - 1000 a 10000 μl', 'Labmate pro', 'PPAQP-50C', NULL, NULL, '256690366', NULL),
(37, 1, 'Pipeta - 2 a 20 μl', 'Labmate pro', 'PPAQP-54C', NULL, NULL, '256630611', NULL),
(38, 1, 'Pipeta - 2 a 20 μl', 'Labmate pro', NULL, NULL, NULL, NULL, NULL),
(39, 1, 'Pipeta - 20 a 200 μl', 'Labmate pro', 'PPAQP-55C', NULL, NULL, '356652079', NULL),
(40, 1, 'Pipeta 0,1 a 2,5 μl', 'Eppendorf', 'PPAQP-75C', NULL, NULL, 'nova tag: PPAQP-75C', NULL),
(41, 1, 'Pipeta 0,5 a 10 μl', 'Eppendorf', 'PPAQP-74C', NULL, NULL, 'nova tag: PPAQP-74C', NULL),
(42, 1, 'Pipeta 10 a 100 μl', 'Labmate pro', 'PPAQP-61C', NULL, NULL, '256642222', NULL),
(43, 1, 'Pipeta 10 a 100 μl', 'Labmate pro', 'PPAQP-62C', NULL, NULL, '253342220', NULL),
(44, 1, 'Pipeta 100 a 1000 μl', 'Eppendorf', 'PPAQP-71C', NULL, NULL, 'nova tag: PPAQP-71C', NULL),
(45, 1, 'Pipeta 100 a 1000 μl', 'Labmate pro', 'PPAQP-48C', NULL, NULL, '256663799', NULL),
(46, 1, 'Pipeta 100 a 1000 μl', 'Labmate pro', 'PPAQP-49C', NULL, NULL, '356663567', NULL),
(47, 1, 'Pipeta 100 a 1000 μl', 'Labmate pro', 'PPAQP-64C', NULL, NULL, '356662499', NULL),
(48, 1, 'Pipeta 100 a 1000 μl', 'Labmate pro', 'PPAQP-65C', NULL, NULL, '356662498', NULL),
(49, 1, 'Pipeta 1000 a 10000 μl', 'Labmate pro', 'PPAQP-52C', NULL, NULL, '256690365', NULL),
(50, 1, 'Pipeta 1000 a 10000 μl', 'Labmate pro', 'PPAQP-51C', NULL, NULL, '256690367', NULL),
(51, 1, 'Pipeta 12 canais - 20 a 200 μl', 'Capp Denmark ', 'PPAQP-57C', NULL, NULL, '10785', NULL),
(52, 1, 'Pipeta 12 canais - 30 a 300 μl', 'Capp Denmark ecopipette', 'PPAQP-70C', NULL, NULL, 'IE0203', NULL),
(53, 1, 'Pipeta 1-5 ml', 'Capp Denmark ecopipette', 'PPAQP-59C', NULL, NULL, 'IA12183', NULL),
(54, 1, 'Pipeta 1-5 ml', 'Capp Denmark ecopipette', 'PPAQP-58C', NULL, NULL, 'IA12074', NULL),
(55, 1, 'Pipeta 1-5 ml', 'Capp Denmark ecopipette', 'PPAQP-60C', NULL, NULL, 'IA12150', NULL),
(56, 1, 'Pipeta 2 a 20 μl', 'Eppendorf', 'PPAQP-73C', NULL, NULL, 'nova tag: PPAQP-72C', NULL),
(57, 1, 'Pipeta 20 a 200', 'Eppendorf', 'PPAQP-72C', NULL, NULL, 'nova tag: PPAQP-73C', NULL),
(58, 1, 'Pipeta 20 a 200 μl', 'Labmate pro', 'PPAQP-56C', NULL, NULL, '256651693', NULL),
(59, 1, 'Pipeta 8 canais - 20 a 200 μl', 'Capp Denmark ecopipette', 'PPAQP-68C', NULL, NULL, 'IE0198', NULL),
(60, 1, 'Pipeta 8 canais - 5 a 50 μl', 'Capp Denmark ecopipette', 'PPAQP-70C', NULL, NULL, 'IC16474', NULL),
(61, 1, 'Pipeta sorológica', 'Capp Aid', NULL, '5711538-9', '27476.0', NULL, NULL),
(62, 1, 'Pipeta sorológica', 'CappAid', NULL, '5722539-7', '27477.0', NULL, NULL),
(63, 1, 'Reservatório de água destilada', NULL, NULL, '2419630-4', NULL, 'C9218', NULL),
(64, 1, 'Sistema eletroforese horizontal', 'Digel', 'CTFQP-02C', '2427127-6', '27535.0', NULL, NULL),
(65, 1, 'Sistema eletroforese horizontal', 'BioRad', 'CTFQP-01C', NULL, NULL, NULL, NULL),
(66, 1, 'Sistema eletroforese vertical', 'TermoScientific', 'CTFQP-03C', '2427073-3', '27475.0', NULL, NULL),
(67, 1, 'Transiluminador', 'Loccus biotecnologia', 'TRLQP-01C', '2426975-1', '27356.0', NULL, NULL),
(68, 1, 'Vortex', 'Biomixer VTX-2500', 'AGTQP-31C', '2427019-9', '27400.0', NULL, NULL),
(69, 1, 'Vortex', 'Biomixer VTX-2500', 'AGTQP-30C', '2427020-2', '27401.0', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `freezer`
--

CREATE TABLE IF NOT EXISTS `freezer` (
  `id_freezer` smallint(4) NOT NULL AUTO_INCREMENT,
  `id_dept` tinyint(1) DEFAULT NULL,
  `nome_fz` varchar(50) NOT NULL,
  `marca_fz` varchar(50) DEFAULT NULL,
  `validade_fz` date DEFAULT NULL,
  `identificacao_fz` varchar(20) DEFAULT NULL,
  `lote_fz` varchar(20) DEFAULT NULL,
  `quantidade_fz` smallint(3) DEFAULT NULL,
  `obs_fz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_freezer`),
  KEY `FK_departamentoXfreezer` (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=64 ;

--
-- Extraindo dados da tabela `freezer`
--

INSERT INTO `freezer` (`id_freezer`, `id_dept`, `nome_fz`, `marca_fz`, `validade_fz`, `identificacao_fz`, `lote_fz`, `quantidade_fz`, `obs_fz`) VALUES
(1, 1, 'Blue Green Loading Dye I', 'LGC Biotec', '2016-09-01', NULL, '220914D', 3, NULL),
(2, 1, 'Taq PCR Master Mix Kit', 'Qiagen', NULL, NULL, '148029464', 3, NULL),
(3, 1, 'Midipret Kit', NULL, NULL, NULL, NULL, 4, NULL),
(4, 1, 'Ladder 1KB', 'Ludwig', '2017-03-01', NULL, '1403032', 2, NULL),
(5, 1, 'DTT 5g', 'Ludwig', '2016-05-01', NULL, '1310405', 1, NULL),
(6, 1, 'Phenol 100g', 'Sigma', NULL, NULL, '59H1137', 1, NULL),
(7, 1, 'X-Gal', 'Promega', '2017-10-06', NULL, '121074', 1, NULL),
(8, 1, 'P1: Formamida Hi-Di', 'Apllied Biosystems', '2015-04-14', '4311320', '1304244', 3, NULL),
(9, 1, 'P1: Kit Sequenciamento', 'Apllied Biosystems', '2014-08-31', '4336917', '1302349', 6, NULL),
(10, 1, 'P2: Ultrapure dNTP Set', 'Pharmacia Biotech', NULL, NULL, '7122035021', 1, NULL),
(11, 1, 'P2: GoTag DNA Polymerase', 'Promega', '2011-06-10', NULL, '23845139', 1, NULL),
(12, 1, 'P2: DreamTaq Green DNA Polymerase', 'Fermentas', NULL, NULL, NULL, 2, NULL),
(13, 1, 'P2: Master Mix PCR', 'Eco Diagnóstica', '2014-10-01', NULL, NULL, 2, NULL),
(14, 1, 'P3: EcoRI', 'Eco Diagnóstica', '2014-12-01', NULL, NULL, 1, NULL),
(15, 1, 'P3: DNAse I', 'GE Healthcaree', NULL, NULL, 'D0641', 5, NULL),
(16, 1, 'P3: rDNAse', 'Macherey-Nagel', NULL, NULL, 'D071412', 1, NULL),
(17, 1, 'P3: DNA ladder 100bp', NULL, '2015-02-28', 'N32315', '9713022', 5, NULL),
(18, 1, 'P3: Marcador PM 1 Kb', 'Thermo Scientific', '2014-09-30', NULL, '36048', 2, NULL),
(19, 1, 'P3: RNAse Free DNAse', 'Promega', '2012-08-13', NULL, '295819', 1, NULL),
(20, 1, 'P3: BSP1407 Enzima de Restrição', 'Fermentas', '2012-06-01', NULL, '48621', 1, NULL),
(21, 1, 'P4: Super Script III First-Strand', 'Invitrogen', '2023-08-19', NULL, '954991', 3, NULL),
(22, 1, 'P4: Transcriptase reversa ', 'Promega', '2014-05-24', NULL, '22184', 1, NULL),
(23, 1, 'P4: Transcriptase reversa ', 'Fermentas', '2010-12-01', NULL, NULL, 1, NULL),
(24, 1, 'P4: Transcriptase reversa ', 'Clontech', NULL, NULL, '9022008A', 1, NULL),
(25, 1, 'cDNA library construction kit', 'Invitrogen', NULL, NULL, '740696', 3, NULL),
(26, 1, 'Pre-amplification components', 'Promega', '2012-09-01', NULL, '327964', 1, NULL),
(27, 1, 'Lysozyme', 'Sigma', NULL, NULL, '71K7032', 3, NULL),
(28, 1, 'Bovine Serum Albumin', 'Sigma', NULL, NULL, '49H1076', 1, NULL),
(29, 1, 'PEG 20% NaCl 2,5M', NULL, NULL, NULL, NULL, 1, NULL),
(30, 1, 'Catalase', 'Sigma', NULL, NULL, '125H7050', 3, NULL),
(31, 1, 'Penicillin streptomycin', 'Life', '2014-11-30', NULL, '1491906', 6, NULL),
(32, 1, 'Von willebrand factor human plasma', 'Calbiochem', NULL, '681300', 'D00155062', 1, NULL),
(33, 1, 'Willebrand F Human Plasma', 'AG', NULL, NULL, 'B13050801', 1, NULL),
(34, 1, 'Ristocetin Sulfate Salt', 'MP Biomedicals LLC', NULL, NULL, 'MG256', 1, NULL),
(35, 1, 'Buffer (10x) with EDTA', 'Apllied Biosystems', '2013-05-20', NULL, '1105380', 3, NULL),
(36, 1, 'G418 disulfate salt adution', NULL, '2015-04-14', NULL, NULL, 3, NULL),
(37, 1, 'IPTG', 'Promega', NULL, NULL, '106795', 1, NULL),
(38, 1, 'Ampicilina anidra cristalina', 'Sigma', '2016-05-01', NULL, '44174837', 1, NULL),
(39, 1, 'Isopropyl B-D1', 'Sigma', '2017-05-07', NULL, '103174065V', 1, NULL),
(40, 1, 'Chaps detergent', 'Bio-Rad', '2016-02-20', NULL, '1610460', 2, NULL),
(41, 1, 'Protein standart ', 'Sigma', NULL, NULL, 'SLBFO443V', 1, NULL),
(42, 1, 'Tampão de sequenciamento', 'Apllied Biosystems', '2015-01-09', '688', '1301232', 4, NULL),
(43, 1, 'Isoeletric Calibration kit', 'Pharmacia Biotech', NULL, NULL, '5139', 1, NULL),
(44, 1, 'Neutralization solution (NSC)', 'Promega', '2016-09-15', NULL, '117344', 1, NULL),
(45, 1, 'Silver strain developer', 'Bio-Rad', NULL, NULL, '9700998', 7, NULL),
(46, 1, 'CK-NAC Liquiform', 'Labtest Diagnóstica', '2005-01-01', NULL, '4041', 1, NULL),
(47, 1, 'Diethyl pyrccabonate', 'Sigma', NULL, NULL, 'BCBS0080V', 4, NULL),
(48, 1, 'Trizol reagent', 'Life', NULL, '1559608', '59702', 1, NULL),
(49, 1, 'Glycoprotein carbohydrate estimation kit', 'Pierce', NULL, NULL, 'HC100977', 1, NULL),
(50, 1, 'Microply (A) Purist', 'Ambrion', NULL, NULL, '909036', 1, NULL),
(51, 1, 'mRNA Purification kit', 'GE Healthcare', '2009-11-22', NULL, '335278', 1, NULL),
(52, 1, 'Substrato de plasminogênio', 'Sigma', '2002-01-01', NULL, '090K6412', 2, NULL),
(53, 1, 'Proteína C', 'Sigma', '1996-08-01', NULL, '093H6169', 1, NULL),
(54, 1, 'Micro mRNA purification kit', 'Pharmacia Biotech', NULL, NULL, '8069255011', 1, NULL),
(55, 1, 'cDNA lize fractionation columns', 'Invitrogen', NULL, NULL, '732292', 6, NULL),
(56, 1, 'mRNA Purification kit', 'Invitrogen', '2012-08-01', NULL, '666315', 1, NULL),
(57, 1, 'Ictal RNA Extraction kit', 'Bioamerica', NULL, NULL, 'TH10714', 1, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE IF NOT EXISTS `pessoa` (
  `id_nome` smallint(4) NOT NULL AUTO_INCREMENT,
  `id_dept` tinyint(1) DEFAULT NULL,
  `relacionamento_ps` varchar(11) NOT NULL,
  `nome_ps` varchar(50) NOT NULL,
  `sexo_ps` varchar(9) NOT NULL,
  `data_nasc_ps` date DEFAULT NULL,
  `estado_civil_ps` varchar(14) DEFAULT NULL,
  `email_ps` varchar(50) DEFAULT NULL,
  `tel_residencial_ps` varchar(14) DEFAULT NULL,
  `tel_celular_ps` varchar(15) DEFAULT NULL,
  `profissao_ps` varchar(50) DEFAULT NULL,
  `cep_ps` varchar(10) DEFAULT NULL,
  `logradouro_ps` varchar(50) DEFAULT NULL,
  `numero_ps` varchar(5) DEFAULT NULL,
  `bairro_ps` varchar(50) DEFAULT NULL,
  `cidade_ps` varchar(50) DEFAULT NULL,
  `estado_ps` varchar(3) DEFAULT NULL,
  `complemento_ps` varchar(50) DEFAULT NULL,
  `obs_ps` varchar(500) DEFAULT NULL,
  `obs2_ps` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_nome`),
  KEY `FK_departamentoXpessoa` (`id_dept`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `reagente`
--

CREATE TABLE IF NOT EXISTS `reagente` (
  `id_rg` smallint(4) NOT NULL AUTO_INCREMENT,
  `id_dept` tinyint(1) DEFAULT NULL,
  `nome_rg` varchar(50) NOT NULL,
  `tipo_rg` varchar(7) DEFAULT NULL,
  `marca_rg` varchar(50) DEFAULT NULL,
  `apresentacao_rg` varchar(20) DEFAULT NULL,
  `lote_rg` varchar(20) DEFAULT NULL,
  `entrada_rg` date DEFAULT NULL,
  `validade_rg` date DEFAULT NULL,
  `quantidade_rg` smallint(3) DEFAULT NULL,
  `pf_rg` varchar(5) DEFAULT NULL,
  `saida_rg` date DEFAULT NULL,
  `obs_rg` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_rg`),
  KEY `id_dept` (`id_dept`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=128 ;

--
-- Extraindo dados da tabela `reagente`
--

INSERT INTO `reagente` (`id_rg`, `id_dept`, `nome_rg`, `tipo_rg`, `marca_rg`, `apresentacao_rg`, `lote_rg`, `entrada_rg`, `validade_rg`, `quantidade_rg`, `pf_rg`, `saida_rg`, `obs_rg`) VALUES
(1, 1, 'Etanol Absoluto', 'Líquido', 'Sigma', '500ml', 'SHBB0208V', '2011-01-12', '2016-07-18', 1, 'Não', NULL, NULL),
(2, 1, '2 - Propanol', 'Líquido', 'Sigma', '1L', 'SZBD145CV', NULL, '2016-05-11', 2, 'Não', NULL, NULL),
(3, 1, 'Álcool Etílico Absoluto', 'Líquido', 'Ecibra', '1L', '18202', NULL, '2012-01-08', 1, 'Não', NULL, NULL),
(4, 1, 'Álcool iso-propílico', 'Líquido', 'Vetec', '1L', '907716', NULL, '2014-01-12', 3, 'Não', NULL, NULL),
(5, 1, 'Ácido acético glacial 100% anidro', 'Líquido', 'Merk', '1L', 'k39595863907', '2015-06-19', '2013-12-31', 1, '', NULL, NULL),
(6, 1, 'Ácido acético glacial P.A. ACS ISSO', 'Líquido', 'Vetec', '1000ml', '804331', '2015-06-19', '2012-07-01', 6, '', NULL, NULL),
(7, 1, 'Álcool Etílico Absoluto', 'Líquido', 'Vetec', '1L', 'DCBB5415', NULL, '2021-01-07', 8, 'Não', NULL, NULL),
(8, 1, 'Álcool iso-amilico', 'Líquido', 'Synth', '1000ml', '22939', '2015-06-19', NULL, 1, '', NULL, NULL),
(9, 1, 'Álcool iso-amílico', 'Líquido', 'Merck', '1L', 'k39303478', '2015-06-19', '2013-09-30', 1, '', NULL, NULL),
(10, 1, 'Álcool iso-amilico', 'Líquido', 'Synth', '1000ml', '20383', '2015-06-19', NULL, 1, '', NULL, NULL),
(11, 1, 'Álcool Iso-amilico', 'Líquido', 'Merck', '1000ml', 'k36749379704', '2015-06-19', '2011-11-30', 1, '', NULL, NULL),
(12, 1, 'Alcool isso-amilico', 'Líquido', 'Vetec', '1 L', NULL, NULL, NULL, 2, '', NULL, NULL),
(13, 1, 'Álcool metílico', 'Líquido', 'CRQ', '1L', '0032.01/2', '2015-06-19', '2005-01-01', 1, '', NULL, NULL),
(14, 1, 'Álcool metílico', 'Líquido', 'CRQ', '1L', '1736.11/2', '2015-06-19', '2007-11-01', 1, '', NULL, NULL),
(15, 1, 'Brometo de etídio Solução', 'Líquido', 'Sigma', '10ml', 'SLBF7129V', NULL, '2015-01-30', 1, 'Não', NULL, NULL),
(16, 1, 'Dietilamina', 'Líquido', 'Vetec', '1L', '1002783', NULL, '2014-01-05', 1, 'Sim', NULL, NULL),
(17, 1, 'Dimeltiformamida', 'Líquido', 'Analyticals', '1 L', '22288', '2015-06-19', '2004-09-03', 1, '', NULL, NULL),
(18, 1, 'Formaldeido', 'Líquido', 'Quimex', '1 L', '29937', '2015-06-19', '2007-10-19', 1, '', NULL, NULL),
(19, 1, 'TBE 1X uso', 'Líquido', 'FUNED', NULL, '5', NULL, '2015-06-02', 1, 'Não', '0000-00-00', NULL),
(20, 1, 'TBE 5x estoque', 'Líquido', 'FUNED', NULL, '6', NULL, '2015-06-02', 1, 'Não', '0000-00-00', NULL),
(21, 1, 'Triton x 100', 'Líquido', 'Panreac ', '1L', 'k38668153', '2015-06-19', '2011-04-30', 1, '', NULL, NULL),
(22, 1, 'Triton x-100', 'Líquido', 'Bio-Rad', NULL, 'L1610407', NULL, NULL, 1, 'Não', NULL, NULL),
(23, 1, 'Tween 20', 'Líquido', 'Panreac', '1L', '281808', NULL, '2016-01-10', 1, 'Não', NULL, NULL),
(24, 1, 'Acetato de Amônio', 'Sólido', 'Vetec', '1kg', '1106502', NULL, '2014-01-08', 1, 'Não', NULL, NULL),
(25, 1, 'Ácido Bórico', 'Sólido', 'Sigma', '', 'BCBK5744V', '2014-07-23', '2019-01-01', 1, 'Não', NULL, NULL),
(26, 1, 'Ácido Cítrico Anidro', 'Sólido', 'Vetec', '', 'DCBB6300', '2013-12-16', '2016-04-10', 1, 'Não', NULL, NULL),
(27, 1, 'Ágar', 'Sólido', 'Sigma', '100g', 'SLBJ3874V', '2014-07-23', '2020-03-14', 1, 'Não', NULL, NULL),
(28, 1, 'Azida de Sódio Puríssima', 'Sólido', 'Vetec', '500g', '1104373', NULL, '2014-05-01', 2, 'Não', NULL, NULL),
(29, 1, 'Bórax Pó', 'Sólido', 'Vetec', '500g', '1103436', NULL, '2014-01-04', 1, 'Não', NULL, NULL),
(30, 1, 'Cloreto de Alumínio', 'Sólido', 'Sigma', '100g', 'S46342-078', NULL, '2014-01-19', 1, 'Não', NULL, NULL),
(31, 1, 'Cloreto de Amônio', 'Sólido', 'Sigma', '500g', 'SZBD1250V', NULL, '2016-04-19', 1, 'Não', NULL, NULL),
(32, 1, 'Cloreto de Magnésio', 'Sólido', 'Vetec', '500g', 'DCBC0206', NULL, '2015-01-04', 1, 'Não', NULL, NULL),
(33, 1, 'Cloreto de Potássio', 'Sólido', 'Vetec', '500g', '1005259', NULL, '2014-01-07', 2, 'Não', NULL, NULL),
(34, 1, 'Dicloreto de Níquel', 'Sólido', 'Sigma', '50g', 'STBD6908V', '2014-07-23', '2020-04-25', 1, 'Não', NULL, NULL),
(35, 1, 'Dicromato de Potássio', 'Sólido', 'Vetec', '1kg', '904177', NULL, '2014-01-07', 1, 'Não', NULL, NULL),
(36, 1, 'Extrato de Levedura', 'Sólido', 'Sigma', '500g', 'BCBL8634V', '2014-07-23', '2018-08-15', 1, 'Não', NULL, NULL),
(37, 1, 'Ficoll', 'Sólido', 'Sigma', '25g', '070M6038', '2013-07-01', '2016-06-11', 1, 'Não', NULL, NULL),
(38, 1, 'Glicina', 'Sólido', 'Ludwig Biotec', '1kg', 'G13102B', NULL, '2016-01-02', 2, 'Não', NULL, NULL),
(39, 1, 'Glicose Anidra', 'Sólido', 'Sigma', '', 'BCBC7079V', NULL, '2013-12-17', 2, 'Não', NULL, NULL),
(40, 1, 'Hidróxido de Potássio', 'Sólido', 'Merck', '1kg', 'B0749033', NULL, '2017-05-31', 2, 'Sim', NULL, NULL),
(41, 1, 'Imidazol', 'Sólido', 'Applixhwm', '500g', '4H013658', '2011-01-08', NULL, 1, 'Não', NULL, NULL),
(42, 1, 'LB Ágar', 'Sólido', 'Sigma', '250g', '031M1789', NULL, '2016-07-30', 1, 'Não', NULL, NULL),
(43, 1, 'LB Broth', 'Sólido', 'Sigma', '', '020M1521', '2014-07-23', '2016-07-06', 1, 'Não', NULL, NULL),
(44, 1, 'Nitrato de Prata', 'Sólido', 'Vetec', '100g', '1205876', NULL, '2014-01-08', 2, 'Não', NULL, NULL),
(45, 1, 'Peptona de Caseína', 'Sólido', 'Roth', '500g', '263201131', '2013-11-10', '2017-02-28', 1, 'Não', NULL, NULL),
(46, 1, 'Sacarose D (+)', 'Sólido', 'Vetec', '500g', 'DCBB1465', NULL, '2014-01-04', 2, 'Não', NULL, NULL),
(47, 1, 'Sacarose D (+)', 'Sólido', 'Vetec', '500g', '1001920', NULL, '2014-04-01', 1, 'Não', NULL, NULL),
(48, 1, 'Sulfato de Potássio', 'Sólido', 'Vetec', '1kg', '907940', NULL, '2014-01-12', 1, 'Não', NULL, NULL),
(49, 1, 'Acetato de Potássio', 'Sólido', 'Vetec', '500g', '10015443', NULL, '2014-03-01', 2, 'Não', NULL, NULL),
(50, 1, 'Ácido Bórico', 'Sólido', 'Merck', '500 gr', 'A646565', '2015-06-19', NULL, 4, '', NULL, NULL),
(51, 1, 'Ácido Tricloroacético', 'Sólido', 'Merck', '50 gr', 'k36929507725', '2015-06-19', NULL, 1, '', NULL, NULL),
(52, 1, 'Acrilamida', 'Sólido', 'Avati', '500g', 'A7002-12', NULL, '2015-12-31', 2, 'Não', NULL, NULL),
(53, 1, 'Acrilamida', 'Sólido', 'Acros Organics', '500g', 'A0336023', NULL, '2015-06-25', 2, 'Não', NULL, NULL),
(54, 1, 'Agarose', 'Sólido', 'LW Biotec', '100g', '14130318', NULL, '2018-01-03', 6, 'Não', NULL, NULL),
(55, 1, 'Agarose', 'Sólido', 'Sigma', '100g', '120M0463V', NULL, '2016-06-12', 1, 'Não', NULL, NULL),
(56, 1, 'Agarose', 'Sólido', 'Ludwig Biotec', '500g', '90318', '2009-08-07', '2013-01-11', 1, 'Não', NULL, NULL),
(57, 1, 'Azul de Bromofenol', 'Sólido', 'Vetec', '5g', '904935', NULL, '2014-01-08', 1, 'Não', NULL, NULL),
(58, 1, 'Bicarbonato de sódio', 'Sólido', 'Sigma', '5000 gr', '56H0423', '2015-06-19', NULL, 1, '', NULL, NULL),
(59, 1, 'Carvão ativo', 'Sólido', 'sem marca', '', NULL, '2015-06-19', NULL, 1, '', NULL, NULL),
(60, 1, 'Citrato de sódio', 'Sólido', 'B.Herzog', '1000 gr', '171181', '2015-06-19', NULL, 1, '', NULL, NULL),
(61, 1, 'Cloreto de Amônio', 'Sólido', 'Sigma', '500g', 'SZBD2660V', '2014-12-11', '2016-07-09', 1, 'Não', NULL, NULL),
(62, 1, 'Cloreto de Cálcio', 'Sólido', 'Merck', '500g', '50948', NULL, NULL, 1, 'Não', NULL, NULL),
(63, 1, 'Cloreto de cálcio granular', 'Sólido', 'Sigma', '500 gr', '015K0173', '2015-06-19', NULL, 1, 'Não', NULL, NULL),
(64, 1, 'Cloreto de Cobalto', 'Sólido', 'Vetec', '500g', 'DCBC7725U', '2014-12-18', '2016-07-06', 1, 'Não', NULL, NULL),
(65, 1, 'Cloreto de Magnésio', 'Sólido', 'Sigma', '500g', '50460', NULL, '2010-01-10', 1, 'Não', NULL, NULL),
(66, 1, 'Cloreto de manganês tetrahidratado', 'Sólido', 'Fluka', '250 gr', '435688/1', '2015-06-19', NULL, 2, '', NULL, NULL),
(67, 1, 'Dicromato de potássio', 'Sólido', 'Fluka', '500 gr', '431530/1', '2015-06-19', NULL, 1, '', NULL, NULL),
(68, 1, 'Dicromato de potássio', 'Sólido', 'Mallenckrodt', '500 gr', '6770KPSC', '2015-06-19', NULL, 1, '', NULL, NULL),
(69, 1, 'Docecil sulfato de sódio', 'Sólido', 'Fluka', '100 gr', '71725', '2015-06-19', '2010-03-01', 2, '', NULL, NULL),
(70, 1, 'dodecil sulfato de sódio', 'Sólido', 'Callrachem', '1 Kg', 'D00071165', '2015-06-19', '2011-05-25', 1, '', NULL, NULL),
(71, 1, 'Dodecilsulfato de sódio', 'Sólido', 'Merck', '1 Kg', 'L58134960 916', '2015-06-19', NULL, 1, '', NULL, NULL),
(72, 1, 'EDTA dissódico', 'Sólido', 'Grupo Química', '500 gr', '413124', '2015-06-19', NULL, 1, '', NULL, NULL),
(73, 1, 'Extrato de Células', 'Sólido', 'Bd', '500g', '2268204', NULL, '2017-05-31', 2, 'Não', NULL, NULL),
(74, 1, 'Extrato de Levedura', 'Sólido', 'Sigma', '250g', '061M0074V', NULL, '2016-11-22', 1, 'Não', NULL, NULL),
(75, 1, 'Fosfato de Potássio dibásico anidro', 'Sólido', 'Sigma', '1000 gr', 'I6H1428', '2015-06-19', NULL, 1, '', NULL, NULL),
(76, 1, 'Fosfato de Potássio dibásico anidro', 'Sólido', 'Mallenckrodt', '500 gr', '7092KTPA', '2015-06-19', NULL, 1, '', NULL, NULL),
(77, 1, 'Fosfato de Potássio Monobásico', 'Sólido', 'Vetec', '1kg', 'DCBB9490', NULL, '2015-07-11', 1, 'Não', NULL, NULL),
(78, 1, 'Fosfato de Sódio Dibásico anidro', 'Sólido', 'Vetec', '1000 gr', '993162', '2015-06-19', NULL, 1, '', NULL, NULL),
(79, 1, 'Fosfato de Sódio Dibásico anidro', 'Sólido', 'Mallenckrodt', '1 kg', '7917MVEC', '2015-06-19', NULL, 1, '', NULL, NULL),
(80, 1, 'Fosfato de sódio dibasico hepta-hidratado', 'Sólido', 'Sigma-Aldrich', '500 gr', '097k0052', '2015-06-19', NULL, 1, '', NULL, NULL),
(81, 1, 'Fosfato de sódio monobásico granular', 'Sólido', 'Mallenckrodt', '500 gr', '7892KTML', '2015-06-19', NULL, 2, '', NULL, NULL),
(82, 1, 'Fosfato de sódio monobásico monohidratado', 'Sólido', 'Sigma-Aldrich', '1 Kg', 'BCBI+9796V', '2015-06-19', '2015-04-30', 4, '', NULL, NULL),
(83, 1, 'Hepes', 'Sólido', 'Sigma', '25g', 'SLBK4575U', '2014-01-12', '2018-05-30', 2, 'Não', NULL, NULL),
(84, 1, 'Imidazol', 'Sólido', 'Merck', '250mg', 'L041008216406', '2015-04-01', '2017-01-31', 2, 'Não', NULL, NULL),
(85, 1, 'MOPS', 'Sólido', 'Sigma', '500 gr', '61K5435', '2015-06-19', NULL, 1, '', NULL, NULL),
(86, 1, 'Sephadex G-25', 'Sólido', 'Pharmacia', '100 gr', 'MA01548', '2015-06-19', NULL, 1, '', NULL, NULL),
(87, 1, 'Sulfato de Camamicina', 'Sólido', 'Sigma', '100mg', '094N477V', '2014-01-12', '2014-09-30', 1, 'Não', NULL, NULL),
(88, 1, 'Sulfato de cobre', 'Sólido', 'Mallenckrodt', '1000 gr', '62311', '2015-06-19', NULL, 1, '', NULL, NULL),
(89, 1, 'Sulfato de Magnésio', 'Sólido', 'Sigma', '1kg', '90K0852', NULL, NULL, 1, 'Não', NULL, NULL),
(90, 1, 'sulfato de sódio anidro', 'Sólido', 'Merck', '', '7053', '2015-06-19', NULL, 1, '', NULL, NULL),
(91, 1, 'Yeast Extract Powder', 'Sólido', 'Mp', '1kg', 'M8075', NULL, NULL, 1, 'Não', NULL, NULL);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `autenticacao`
--
ALTER TABLE `autenticacao`
  ADD CONSTRAINT `FK_DepartamentoXAutenticacao` FOREIGN KEY (`id_dept`) REFERENCES `departamento` (`id_dept`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `equipamento`
--
ALTER TABLE `equipamento`
  ADD CONSTRAINT `FK_DepartamentoXEquipamento` FOREIGN KEY (`id_dept`) REFERENCES `departamento` (`id_dept`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `freezer`
--
ALTER TABLE `freezer`
  ADD CONSTRAINT `FK_DepartamentoXFreezer` FOREIGN KEY (`id_dept`) REFERENCES `departamento` (`id_dept`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD CONSTRAINT `FK_DepartamentoXPessoa` FOREIGN KEY (`id_dept`) REFERENCES `departamento` (`id_dept`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `reagente`
--
ALTER TABLE `reagente`
  ADD CONSTRAINT `FK_DepartamentoXReagente` FOREIGN KEY (`id_dept`) REFERENCES `departamento` (`id_dept`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
