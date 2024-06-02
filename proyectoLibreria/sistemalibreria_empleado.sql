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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `idEmpleado` int unsigned NOT NULL AUTO_INCREMENT,
  `telefono` bigint unsigned NOT NULL,
  `fechaNac` date NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `RFC` varchar(13) NOT NULL,
  `sueldo` int unsigned NOT NULL,
  `mesesContrato` int unsigned NOT NULL,
  `fechaContrato` date NOT NULL,
  `horario` tinytext NOT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `tipoEmpleado` int unsigned NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  UNIQUE KEY `RFC_UNIQUE` (`RFC`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,9515502951,'2003-10-28','Raul chacon melchor','qw2e212e',1500,12,'2024-02-21','lunes a viernes de 8 a 3','menma19','perro12',0),(2,9515501432,'2004-09-07','Zaid Diaz cristobal','342k3rk2',1,12,'2024-03-12','martes a sabado de 3 a 11','crstvbl','greatVegetables',1),(3,9513915029,'2004-02-06','Miguel Alberto Alonso Heredia','3ke23ei2j3',2,5,'2024-04-01','miercoles a domingo de 8 a 3','mike7u7','extrañoamiex1',2),(6,9511234567,'2004-01-16','Luis Gael Fernandez Cucksanto','aefawdaw7d',200,6,'2024-01-11','miercoles y jueves de 6am a 10pm','meEncantaSerCuck','luis1',2),(7,9512345678,'2004-01-20','Eder Yael Villafaña Mendoza','kwefuhaow',200,8,'2024-01-16','lunes a sabado de 3pm a 11pm','yael2','yaelItoEstudiante',1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
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
