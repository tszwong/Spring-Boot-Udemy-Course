CREATE DATABASE  IF NOT EXISTS `pokemon_directory`;
USE `pokemon_directory`;

--
-- Table structure for table `pokemon`
--

DROP TABLE IF EXISTS `pokemon`;

CREATE TABLE `pokemon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `trainer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `pokemon`
--

INSERT INTO `pokemon` VALUES 
	(1,'Squirtle','Water','Ashe Ketchum'),
	(2,'Charmander','Fire','Joe Mama'),
	(3,'Bulbasaur','Grass','Stephen Curry'),
	(4,'Pikachu','Electric','Tom Brady'),
	(5,'Mew','Pyschic','Michael Jordan');

