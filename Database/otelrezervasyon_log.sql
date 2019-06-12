-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: otelrezervasyon
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_tarih` timestamp(6) NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `log_islem` varchar(255) DEFAULT NULL,
  `log_kullanici` varchar(255) DEFAULT NULL,
  `log_odaNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (17,'2019-05-15 14:45:07.146998','Müşteri Kayıt','tolga',16),(18,'2019-05-15 14:45:12.316627','Sipariş Yemek','tolga',16),(19,'2019-05-15 14:45:14.436577','Sipariş İçecek','tolga',16),(20,'2019-05-15 14:45:16.322851','Müşteri Çıkışı','tolga',16),(21,'2019-05-18 14:53:32.103563','Sipariş İçecek','null',1),(22,'2019-05-18 14:53:56.521791','Müşteri Kayıt','null',17),(23,'2019-05-18 14:54:04.970608','Müşteri Çıkışı','null',17),(24,'2019-05-18 16:39:48.198257','Müşteri Kayıt','admin',17),(25,'2019-05-18 16:40:27.198706','Müşteri Çıkışı','admin',17),(26,'2019-05-18 16:58:13.949881','Müşteri Kayıt','null',16),(27,'2019-05-18 17:12:37.073516','Sipariş Yemek','null',16),(28,'2019-05-18 17:12:38.149284','Sipariş Yemek','null',16),(29,'2019-05-18 17:12:38.333360','Sipariş Yemek','null',16),(30,'2019-05-18 17:12:38.493125','Sipariş Yemek','null',16),(31,'2019-05-18 17:12:39.345119','Sipariş İçecek','null',16),(32,'2019-05-18 17:12:39.503268','Sipariş İçecek','null',16),(33,'2019-05-18 17:12:39.647262','Sipariş İçecek','null',16),(34,'2019-05-18 17:12:42.705144','Sipariş İçecek','null',16),(35,'2019-05-18 17:12:42.855259','Sipariş İçecek','null',16),(36,'2019-05-18 17:12:43.003114','Sipariş İçecek','null',16),(37,'2019-05-18 17:12:43.137199','Sipariş İçecek','null',16),(38,'2019-05-18 17:12:46.317127','Sipariş Yemek','null',16),(39,'2019-05-18 17:12:50.643185','Sipariş İçecek','null',16),(40,'2019-05-18 17:22:20.948089','Müşteri Çıkışı','null',0),(41,'2019-05-18 17:23:29.209436','Sipariş Yemek','null',1),(42,'2019-05-18 17:23:29.625632','Sipariş Yemek','null',1),(43,'2019-05-18 17:23:29.767729','Sipariş Yemek','null',1),(44,'2019-05-19 20:54:30.427245','Müşteri Kayıt','null',12),(45,'2019-05-19 20:54:37.379808','Müşteri Çıkışı','null',12),(46,'2019-05-19 21:00:01.776486','Müşteri Kayıt','admin',15),(47,'2019-05-19 21:00:12.567619','Sipariş Yemek','admin',15),(48,'2019-05-19 21:00:13.487766','Sipariş Yemek','admin',15),(49,'2019-05-19 21:00:14.841529','Sipariş İçecek','admin',15),(50,'2019-05-19 21:00:20.773501','Sipariş İçecek','admin',15),(51,'2019-05-19 21:00:23.982959','Müşteri Çıkışı','admin',15),(52,'2019-05-19 21:01:39.717397','Müşteri Kayıt','admin',15),(53,'2019-05-19 21:01:48.254299','Müşteri Çıkışı','admin',15),(54,'2019-05-19 21:47:25.299305','Müşteri Kayıt','admin',14),(55,'2019-05-19 21:47:44.280205','Sipariş Yemek','admin',14),(56,'2019-05-19 21:47:44.972186','Sipariş Yemek','admin',14),(57,'2019-05-19 21:47:45.114152','Sipariş Yemek','admin',14),(58,'2019-05-19 21:47:45.258146','Sipariş Yemek','admin',14),(59,'2019-05-19 21:47:47.604101','Sipariş Yemek','admin',14),(60,'2019-05-19 21:47:50.646147','Sipariş İçecek','admin',14),(61,'2019-05-19 21:47:56.224229','Müşteri Çıkışı','admin',14),(62,'2019-05-19 21:48:03.772051','Sipariş İçecek','admin',14),(63,'2019-05-19 21:48:04.030086','Sipariş İçecek','admin',14),(64,'2019-05-19 21:48:04.328021','Sipariş İçecek','admin',14),(65,'2019-05-19 21:51:13.792400','Müşteri Kayıt','admin',14),(66,'2019-05-19 21:51:41.750928','Sipariş Yemek','admin',14),(67,'2019-05-19 21:52:12.342070','Müşteri Çıkışı','admin',14),(68,'2019-05-25 16:20:06.361841','Müşteri Kayıt','admin',14),(69,'2019-05-25 16:20:24.350719','Sipariş Yemek','admin',14),(70,'2019-05-25 16:20:24.835508','Sipariş Yemek','admin',14),(71,'2019-05-25 16:20:24.990758','Sipariş Yemek','admin',14),(72,'2019-05-25 16:20:25.130816','Sipariş Yemek','admin',14),(73,'2019-05-25 16:20:25.302239','Sipariş Yemek','admin',14),(74,'2019-05-25 16:20:28.359822','Sipariş İçecek','admin',14),(75,'2019-05-25 16:20:32.017227','Sipariş Yemek','admin',14),(76,'2019-05-25 16:20:35.638861','Müşteri Çıkışı','admin',14),(77,'2019-05-29 11:54:33.477109','Müşteri Kayıt','admin',14),(78,'2019-05-29 11:55:17.346998','Müşteri Çıkışı','admin',14),(79,'2019-05-29 12:46:04.022598','Müşteri Kayıt','admin',15),(80,'2019-05-29 12:47:21.522755','Sipariş Yemek','admin',15),(81,'2019-05-29 12:47:30.795367','Müşteri Çıkışı','admin',15);
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-30 14:58:56
