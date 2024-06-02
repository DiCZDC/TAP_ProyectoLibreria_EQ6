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
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `idEditorial` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `telefono` bigint unsigned NOT NULL,
  `url` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  PRIMARY KEY (`idEditorial`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (1,'nova',9515502951,'nova.com','nova@gmail.com','privada de pinopaa s/n'),(2,'seix barral',9514583380,'seixbarral.com','seicbarral@gmail.com','barcelona 224'),(3,'mirlo',9514563859,'mirloeditorial.com','mirloeditorial@gmail.com','luis gonzalez obregon #5'),(4,'Penguin Random House',12127829000,'www.penguinrandomhouse.com','info@penguinrandomhouse.com','1745 Broadway, New York, NY 10019, USA'),(5,'HarperCollins',12122077000,'www.harpercollins.com','info@harpercollins.com','195 Broadway, New York, NY 10007, USA'),(6,'Simon & Schuster',12126987000,'www.simonandschuster.com','info@simonandschuster.com','1230 Avenue of the Americas, New York, NY 10020, USA'),(7,'Hachette Book Group',12123641100,'www.hachettebookgroup.com','info@hachettebookgroup.com','1290 Avenue of the Americas, New York, NY 10104, USA'),(8,'Macmillan Publishers',16463075151,'www.macmillan.com','info@macmillan.com','120 Broadway, New York, NY 10271, USA'),(9,'Scholastic',12123436100,'www.scholastic.com','info@scholastic.com','557 Broadway, New York, NY 10012, USA'),(10,'Pearson',442070102000,'www.pearson.com','info@pearson.com','80 Strand, London WC2R 0RL, UK'),(11,'Wiley',12017486000,'www.wiley.com','info@wiley.com','111 River Street, Hoboken, NJ 07030, USA'),(12,'Bloomsbury',442076315600,'www.bloomsbury.com','info@bloomsbury.com','50 Bedford Square, London WC1B 3DP, UK'),(13,'Oxford University Press',441865556767,'www.oup.com','info@oup.com','Great Clarendon Street, Oxford OX2 6DP, UK'),(14,'Cambridge University Press',441223312393,'www.cambridge.org','info@cambridge.org','University Printing House, Shaftesbury Road, Cambridge CB2 8BS, UK'),(15,'McGraw-Hill Education',16467662000,'www.mheducation.com','info@mheducation.com','1325 Avenue of the Americas, New York, NY 10019, USA'),(16,'Cengage Learning',18003549706,'www.cengage.com','info@cengage.com','200 Pier 4 Blvd, Suite 400, Boston, MA 02210, USA'),(17,'Springer Nature',4962214870,'www.springernature.com','info@springernature.com','Tiergartenstrasse 17, 69121 Heidelberg, Germany'),(18,'Elsevier',31204853911,'www.elsevier.com','info@elsevier.com','Radarweg 29, 1043 NX Amsterdam, Netherlands'),(19,'Thomson Reuters',16462234000,'www.thomsonreuters.com','info@thomsonreuters.com','3 Times Square, New York, NY 10036, USA'),(20,'SAGE Publications',18054990721,'www.sagepub.com','info@sagepub.com','2455 Teller Road, Thousand Oaks, CA 91320, USA'),(21,'John Benjamins Publishing',31206304747,'www.benjamins.com','info@benjamins.com','Klaprozenweg 75G, 1033 NN Amsterdam, Netherlands'),(22,'Brill',31715353500,'www.brill.com','info@brill.com','Plantijnstraat 2, 2321 JC Leiden, Netherlands'),(23,'Routledge',442070176000,'www.routledge.com','info@routledge.com','2 Park Square, Milton Park, Abingdon, Oxon OX14 4RN, UK');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
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
