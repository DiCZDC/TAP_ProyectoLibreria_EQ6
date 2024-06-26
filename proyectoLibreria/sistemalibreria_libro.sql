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
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `codigoBarras` bigint(13) unsigned zerofill NOT NULL,
  `existencia_tienda` int(4) unsigned zerofill NOT NULL DEFAULT '0000',
  `ISBN` varchar(17) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `precio` double unsigned NOT NULL,
  `existencia_total` int(5) unsigned zerofill NOT NULL DEFAULT '00000',
  `idEditorial` int unsigned NOT NULL,
  PRIMARY KEY (`codigoBarras`),
  UNIQUE KEY `ISBN_UNIQUE` (`ISBN`),
  KEY `idEditorial_idx` (`idEditorial`),
  CONSTRAINT `fk_libro_editorial` FOREIGN KEY (`idEditorial`) REFERENCES `editorial` (`idEditorial`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (0000122344557,0003,'12233-24343','mistborn: el metal perdido',560.5,00003,1),(0009342343565,0002,'978-607-14-3750-1','1984',356,00002,3),(1231231231231,0004,'1212-1213','el archivo de las tormentas:palabras radiantes',867.4,00004,1),(9781234567890,0010,'978-3-16-148410-0','Cien años de soledad',299,00010,4),(9781234567891,0005,'978-0-7432-7356-5','Orgullo y prejuicio',199,00005,5),(9781234567892,0007,'978-0-06-085052-4','Kafka en la orilla',350,00007,6),(9781234567893,0008,'978-0-545-01022-1','Harry Potter y la piedra filosofal',400,00008,7),(9781234567894,0012,'978-0-06-093636-7','La casa de los espíritus',250,00012,8),(9781234567895,0006,'978-1-56619-909-4','Guerra y paz',450,00006,9),(9781234567896,0003,'978-0-14-243723-0','La metamorfosis',150,00003,10),(9781234567897,0004,'978-0-374-12340-7','Confieso que he vivido',275,00004,11),(9781234567898,0009,'978-0-385-53715-1','El cuento de la criada',300,00009,12),(9781234567899,0011,'978-0-14-303995-2','Siddhartha',175,00011,13),(9781234567900,0002,'978-0-14-044913-6','La Ilíada',200,00002,14),(9781234567902,0008,'978-0-385-02425-4','Todo se desmorona',180,00008,16),(9781234567903,0015,'978-0-14-118253-3','Ficciones',250,00015,17),(9781234567905,0006,'978-0-06-093546-9','Beloved',350,00006,19),(9781234567906,0012,'978-0-15-603041-0','Una habitación propia',200,00012,20),(9781234567907,0007,'978-0-261-10221-7','El señor de los anillos',500,00007,21),(9781234567908,0004,'978-0-394-51956-1','El laberinto de la soledad',150,00004,22),(9781234567909,0005,'978-1-57322-245-8','Cometas en el cielo',225,00005,23),(9781234567910,0006,'978-0-14-303956-3','Las aventuras de Tom Sawyer',180,00006,4),(9781234567911,0003,'978-0-14-303746-0','La ciudad y los perros',275,00003,5),(9781234567912,0009,'978-0-141-43983-6','Germinal',225,00009,6),(9781234567913,0008,'978-0-15-603297-1','El nombre de la rosa',300,00008,7),(9781234567914,0010,'978-0-394-58048-7','Ulises',450,00010,8),(9781234567915,0011,'978-0-14-303943-3','Cumbres borrascosas',175,00011,9);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
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
