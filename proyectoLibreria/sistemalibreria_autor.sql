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
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `idAutor` int(7) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `idiomaOrigen` varchar(20) NOT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idAutor`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (0000001,'Brandon sanderson','estados unidos','ingles','brandonsanderson.com'),(0000002,'eric arthur blair','reino unido','ingles',''),(0000004,'Edgar alan poe','estados unidos','ingles',''),(0000005,'Gabriel García Márquez','Colombia','Español','www.garciamarquez.com'),(0000006,'Jane Austen','Reino Unido','Inglés','www.janeausten.org'),(0000007,'Haruki Murakami','Japón','Japonés','www.harukimurakami.com'),(0000008,'J.K. Rowling','Reino Unido','Inglés','www.jkrowling.com'),(0000009,'Isabel Allende','Chile','Español','www.isabelallende.com'),(0000010,'Leo Tolstoy','Rusia','Ruso','www.leotolstoy.com'),(0000011,'Franz Kafka','Austria-Alemania','Alemán','www.franzkafka.com'),(0000012,'Pablo Neruda','Chile','Español','www.pabloneruda.com'),(0000013,'Margaret Atwood','Canadá','Inglés','www.margaretatwood.ca'),(0000014,'Hermann Hesse','Alemania','Alemán','www.hermannhesse.de'),(0000015,'Homer','Grecia','Griego','www.homerclassics.com'),(0000016,'F. Scott Fitzgerald','Estados Unidos','Inglés','www.fscottfitzgerald.com'),(0000017,'Chinua Achebe','Nigeria','Inglés','www.chinuaachebe.com'),(0000018,'Jorge Luis Borges','Argentina','Español','www.jorgeluisborges.com'),(0000019,'Fyodor Dostoevsky','Rusia','Ruso','www.fyodordostoevsky.com'),(0000020,'Toni Morrison','Estados Unidos','Inglés','www.tonimorrison.com'),(0000021,'Virginia Woolf','Reino Unido','Inglés','www.virginiawoolf.com'),(0000022,'J.R.R. Tolkien','Reino Unido','Inglés','www.jrrtolkien.com'),(0000023,'Octavio Paz','México','Español','www.octaviopaz.com'),(0000024,'Khaled Hosseini','Afganistán','Inglés','www.khaledhosseini.com'),(0000025,'Mark Twain','Estados Unidos','Inglés','www.marktwain.com'),(0000026,'Mario Vargas Llosa','Perú','Español','www.mariovargasllosa.com'),(0000027,'Emile Zola','Francia','Francés','www.emilezola.com'),(0000028,'Umberto Eco','Italia','Italiano','www.umbertoeco.com'),(0000029,'James Joyce','Irlanda','Inglés','www.jamesjoyce.com');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
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
