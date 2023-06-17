CREATE DATABASE  IF NOT EXISTS `pokemon_index`;
USE `pokemon_index`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `pokemon`;

CREATE TABLE `pokemon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name`varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

