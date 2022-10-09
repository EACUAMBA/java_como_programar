CREATE DATABASE IF NOT EXISTS `address` DEFAULT CHARSET utf8mb4;
USE `address`;

CREATE TABLE IF NOT EXISTS `person` (
	`id` INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
	`first_name` VARCHAR(255),
    `last_name` VARCHAR(255),
    `email` VARCHAR(255),
    `phone_number` VARCHAR(255),
    PRIMARY KEY (`id`)
);

INSERT INTO `person` (`first_name`, `last_name`, `email`, `phone_number`) VALUES ('Edilson', 'Cuamba', 'edilsoncuamba@gmail.com', '842473772')