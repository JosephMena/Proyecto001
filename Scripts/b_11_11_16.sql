-- MySQL dump 10.13  Distrib 5.6.31, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: sgr
-- ------------------------------------------------------
-- Server version	5.6.31-0ubuntu0.15.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bebida`
--

DROP TABLE IF EXISTS `bebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bebida` (
  `ID_BEBIDA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_BEBIDA`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebida`
--

LOCK TABLES `bebida` WRITE;
/*!40000 ALTER TABLE `bebida` DISABLE KEYS */;
INSERT INTO `bebida` VALUES (1,'no bebida'),(2,'chicha morada'),(3,'refresco de naranja'),(4,'refresco de piña'),(5,'refresco de carambola'),(6,'refresco mixto'),(7,'refresco de manzana');
/*!40000 ALTER TABLE `bebida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comensal`
--

DROP TABLE IF EXISTS `comensal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comensal` (
  `ID_COMENSAL` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRES` varchar(50) DEFAULT NULL,
  `APELLIDOS` varchar(50) DEFAULT NULL,
  `TELEFONO` varchar(10) DEFAULT NULL,
  `FOTO` blob,
  `DNI` varchar(8) DEFAULT NULL,
  `USUARIO` varchar(50) DEFAULT NULL,
  `CONTRASENA` varchar(200) DEFAULT NULL,
  `EMPRESA_ID_EMPRESA` int(11) DEFAULT NULL,
  `GRUPO` char(1) DEFAULT NULL,
  `HABILITADO` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID_COMENSAL`),
  KEY `COMENSALES_EMPRESA_FK` (`EMPRESA_ID_EMPRESA`),
  CONSTRAINT `COMENSALES_EMPRESA_FK` FOREIGN KEY (`EMPRESA_ID_EMPRESA`) REFERENCES `empresa` (`ID_EMPRESA`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comensal`
--

LOCK TABLES `comensal` WRITE;
/*!40000 ALTER TABLE `comensal` DISABLE KEYS */;
INSERT INTO `comensal` VALUES (1,'PUBLICO EN GENERAL','',NULL,NULL,NULL,NULL,NULL,1,NULL,1),(2,'BOART LOMGYAR',NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,0),(3,'JAMES ANTONY','ACATE REBAZA',NULL,NULL,NULL,NULL,NULL,2,NULL,1),(4,'JORGE','AGUILAR OVIEDO',NULL,NULL,NULL,NULL,NULL,2,NULL,1);
/*!40000 ALTER TABLE `comensal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `ID_EMPRESA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(300) DEFAULT NULL,
  `RUC` varchar(11) DEFAULT NULL,
  `DIRECCION` varchar(300) DEFAULT NULL,
  `TELEFONO` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_EMPRESA`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'PUBLICO EN GENERAL',NULL,NULL,NULL),(2,'BOART LOMGYAR',NULL,NULL,NULL),(3,'SEINCO',NULL,NULL,NULL),(4,'TECSUP',NULL,NULL,NULL),(5,'INSPECTORES',NULL,NULL,NULL),(6,'VULCO',NULL,NULL,NULL),(7,'T&S',NULL,NULL,NULL);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada`
--

DROP TABLE IF EXISTS `entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrada` (
  `ID_ENTRADA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_ENTRADA`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada`
--

LOCK TABLES `entrada` WRITE;
/*!40000 ALTER TABLE `entrada` DISABLE KEYS */;
INSERT INTO `entrada` VALUES (1,'no entrada'),(2,'aguadito de pollo'),(3,'sopa de semola'),(4,'sopa de fideos'),(5,'casuela de pollo');
/*!40000 ALTER TABLE `entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `list_nocturno`
--

DROP TABLE IF EXISTS `list_nocturno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `list_nocturno` (
  `ID_LIST` int(11) NOT NULL AUTO_INCREMENT,
  `RANCHO_FRIO` char(1) DEFAULT NULL,
  `LONCHERA_NOCTURNA` char(1) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `COMENSALES_ID_COMENSAL` int(11) NOT NULL,
  PRIMARY KEY (`ID_LIST`),
  KEY `TRA_CTURNO_COMENSALES_FK` (`COMENSALES_ID_COMENSAL`),
  CONSTRAINT `TRA_CTURNO_COMENSALES_FK` FOREIGN KEY (`COMENSALES_ID_COMENSAL`) REFERENCES `comensal` (`ID_COMENSAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_nocturno`
--

LOCK TABLES `list_nocturno` WRITE;
/*!40000 ALTER TABLE `list_nocturno` DISABLE KEYS */;
/*!40000 ALTER TABLE `list_nocturno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `ID_MENU` int(11) NOT NULL AUTO_INCREMENT,
  `ENTRADA_ID_ENTRADA` int(11) DEFAULT NULL,
  `SEGUNDO_ID_SEGUNDO` int(11) DEFAULT NULL,
  `POSTRE_ID_POSTRE` int(11) DEFAULT NULL,
  `BEBIDA_ID_BEBIDA` int(11) DEFAULT NULL,
  `TIPO_MENU_ID_TIPO` int(11) NOT NULL,
  `HABILITADO` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`ID_MENU`),
  KEY `MENU_BEBIDA_FK` (`BEBIDA_ID_BEBIDA`),
  KEY `MENU_ENTRADA_FK` (`ENTRADA_ID_ENTRADA`),
  KEY `MENU_POSTRE_FK` (`POSTRE_ID_POSTRE`),
  KEY `MENU_SEGUNDO_FK` (`SEGUNDO_ID_SEGUNDO`),
  KEY `MENU_TIPO_MENU_FK` (`TIPO_MENU_ID_TIPO`),
  CONSTRAINT `MENU_BEBIDA_FK` FOREIGN KEY (`BEBIDA_ID_BEBIDA`) REFERENCES `bebida` (`ID_BEBIDA`),
  CONSTRAINT `MENU_ENTRADA_FK` FOREIGN KEY (`ENTRADA_ID_ENTRADA`) REFERENCES `entrada` (`ID_ENTRADA`),
  CONSTRAINT `MENU_POSTRE_FK` FOREIGN KEY (`POSTRE_ID_POSTRE`) REFERENCES `postre` (`ID_POSTRE`),
  CONSTRAINT `MENU_SEGUNDO_FK` FOREIGN KEY (`SEGUNDO_ID_SEGUNDO`) REFERENCES `segundo` (`ID_SEGUNDO`),
  CONSTRAINT `MENU_TIPO_MENU_FK` FOREIGN KEY (`TIPO_MENU_ID_TIPO`) REFERENCES `tipo_menu` (`ID_TIPO`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (2,1,1,1,1,1,1),(3,2,2,2,2,2,0),(4,3,3,3,3,3,1),(5,4,4,4,4,4,0);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `ID_PEDIDO` int(11) NOT NULL AUTO_INCREMENT,
  `COMENSALES_ID_COMENSAL` int(11) NOT NULL,
  `MENU_ID_MENU` int(11) DEFAULT NULL,
  `NUM_MESA` int(11) DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `PRECIO_UNT` decimal(2,0) DEFAULT NULL,
  `PRECIO_TOTAL` decimal(2,0) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  PRIMARY KEY (`ID_PEDIDO`),
  KEY `PEDIDO_COMENSALES_FK` (`COMENSALES_ID_COMENSAL`),
  KEY `PEDIDO_MENU_FK` (`MENU_ID_MENU`),
  CONSTRAINT `PEDIDO_COMENSALES_FK` FOREIGN KEY (`COMENSALES_ID_COMENSAL`) REFERENCES `comensal` (`ID_COMENSAL`),
  CONSTRAINT `PEDIDO_MENU_FK` FOREIGN KEY (`MENU_ID_MENU`) REFERENCES `menu` (`ID_MENU`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postre`
--

DROP TABLE IF EXISTS `postre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `postre` (
  `ID_POSTRE` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_POSTRE`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postre`
--

LOCK TABLES `postre` WRITE;
/*!40000 ALTER TABLE `postre` DISABLE KEYS */;
INSERT INTO `postre` VALUES (1,'mazamorra de piña'),(2,'mazamorra de durazno'),(3,'arroz sambito'),(4,'pankekes'),(5,'canchita'),(6,'naranja'),(7,'manzana'),(8,'platano'),(9,'durazno');
/*!40000 ALTER TABLE `postre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `segundo`
--

DROP TABLE IF EXISTS `segundo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `segundo` (
  `ID_SEGUNDO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_SEGUNDO`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `segundo`
--

LOCK TABLES `segundo` WRITE;
/*!40000 ALTER TABLE `segundo` DISABLE KEYS */;
INSERT INTO `segundo` VALUES (1,'lomo saltado'),(2,'mondonguito italiano'),(3,'enrrollado de chancho'),(4,'enrrollado de pollo'),(5,'estofado de cordero'),(6,'estofado de pollo'),(7,'biscteck montado'),(8,'caldo de cordero'),(9,'caldo de gallina'),(10,'tallarin verde con bistek'),(11,'tallarin a la alfredo'),(12,'salpicon de pollo'),(13,'ceviche'),(14,'escabeche de pollo'),(15,'pollo a la naranja'),(16,'pollo al huacatay');
/*!40000 ALTER TABLE `segundo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_menu`
--

DROP TABLE IF EXISTS `tipo_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_menu` (
  `ID_TIPO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_menu`
--

LOCK TABLES `tipo_menu` WRITE;
/*!40000 ALTER TABLE `tipo_menu` DISABLE KEYS */;
INSERT INTO `tipo_menu` VALUES (1,'desayuno'),(2,'almuerzo'),(3,'cena'),(4,'extra');
/*!40000 ALTER TABLE `tipo_menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-11 14:27:59
