CREATE DATABASE  IF NOT EXISTS `parts_directory`;
USE `parts_directory`;
--
-- Table structure for table `parts_directory`
--
DROP TABLE IF EXISTS `parts`;
CREATE TABLE `parts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL, 
  `tracking_number` varchar(45) DEFAULT NULL,
  `received_from` varchar(45) DEFAULT NULL,
  `date_expected` varchar(45) DEFAULT NULL,
  `date_received` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);