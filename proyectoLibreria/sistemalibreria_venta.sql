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
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idVenta` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(70) NOT NULL,
  `fecha_venta` date NOT NULL,
  `idCajero` int unsigned NOT NULL,
  `correo_cliente` varchar(255) NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_venta_cajero_idx` (`idCajero`),
  CONSTRAINT `fk_venta_cajero` FOREIGN KEY (`idCajero`) REFERENCES `cajero` (`idCajero`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (3,'pedro almaraz almaraz','2024-05-23',2,'pedro@gmail.com'),(4,'vicky melchor','2024-05-22',7,'vicky@gmail.com'),(5,'lucia garcia','2024-05-24',2,'lucia@gmail.com'),(6,'marco antonio','2024-05-24',7,'marco@gmail.com'),(7,'sofia ramirez','2024-05-25',2,'sofia@gmail.com'),(8,'alejandro perez','2024-05-25',7,'alejandro@gmail.com'),(9,'juan carlos','2024-05-26',2,'juan@gmail.com'),(10,'maria lopez','2024-05-26',7,'maria@gmail.com'),(11,'roberto diaz','2024-05-27',2,'roberto@gmail.com'),(12,'laura martinez','2024-05-27',7,'laura@gmail.com'),(13,'antonio morales','2024-05-28',2,'antonio@gmail.com'),(14,'carla fernandez','2024-05-28',7,'carla@gmail.com'),(15,'luis hernandez','2024-05-29',2,'luis@gmail.com'),(16,'ana sanchez','2024-05-29',7,'ana@gmail.com'),(17,'fernando gomez','2024-05-30',2,'fernando@gmail.com'),(18,'patricia ortiz','2024-05-30',7,'patricia@gmail.com'),(19,'javier ruiz','2024-05-31',2,'javier@gmail.com'),(20,'carmen mendoza','2024-05-31',7,'carmen@gmail.com'),(21,'rafael reyes','2024-06-01',2,'rafael@gmail.com'),(22,'laura serrano','2024-06-01',7,'laura@gmail.com'),(23,'diego vasquez','2024-06-02',2,'diego@gmail.com'),(24,'beatriz castro','2024-06-02',7,'beatriz@gmail.com'),(25,'daniel ortega','2024-06-03',2,'daniel@gmail.com'),(26,'monica rios','2024-06-03',7,'monica@gmail.com'),(27,'hector flores','2024-06-04',2,'hector@gmail.com'),(28,'silvia nuñez','2024-06-04',7,'silvia@gmail.com'),(29,'jose martinez','2024-06-05',2,'jose@gmail.com'),(30,'clara estrada','2024-06-05',7,'clara@gmail.com'),(31,'ricardo navarro','2024-06-06',2,'ricardo@gmail.com'),(32,'veronica vazquez','2024-06-06',7,'veronica@gmail.com');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
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
