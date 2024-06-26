-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: sistemalibreria
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `escribir`
--

DROP TABLE IF EXISTS `escribir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escribir` (
  `codigoBarras` bigint(13) unsigned zerofill NOT NULL,
  `idAutor` int(7) unsigned zerofill NOT NULL,
  PRIMARY KEY (`codigoBarras`,`idAutor`),
  KEY `fk_escribir_autor_idx` (`idAutor`),
  CONSTRAINT `fk_escribir_autor` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`idAutor`),
  CONSTRAINT `fk_escribir_libro` FOREIGN KEY (`codigoBarras`) REFERENCES `libro` (`codigoBarras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escribir`
--

LOCK TABLES `escribir` WRITE;
/*!40000 ALTER TABLE `escribir` DISABLE KEYS */;
INSERT INTO `escribir` VALUES (0000122344557,0000001),(1231231231231,0000001),(0009342343565,0000002),(9781234567890,0000005),(9781234567915,0000005),(9781234567891,0000006),(9781234567892,0000007),(9781234567893,0000008),(9781234567894,0000009),(9781234567895,0000010),(9781234567896,0000011),(9781234567897,0000012),(9781234567898,0000013),(9781234567899,0000014),(9781234567900,0000015),(9781234567902,0000017),(9781234567903,0000018),(9781234567905,0000020),(9781234567906,0000021),(9781234567907,0000022),(9781234567908,0000023),(9781234567909,0000024),(9781234567910,0000025),(9781234567911,0000026),(9781234567912,0000027),(9781234567913,0000028),(9781234567914,0000029);
/*!40000 ALTER TABLE `escribir` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-01 18:22:41
