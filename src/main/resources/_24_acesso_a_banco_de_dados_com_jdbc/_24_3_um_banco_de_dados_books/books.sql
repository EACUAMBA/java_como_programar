DROP DATABASE IF EXISTS `books`;
CREATE DATABASE IF NOT EXISTS `books`;
USE `books`;

-- Table: authors
CREATE TABLE IF NOT EXISTS `author` (
	`author_id` INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    `first_name` VARCHAR(255),
    `last_name` VARCHAR(255),
    PRIMARY KEY (`author_id`)
);

INSERT INTO `author` (`author_id`, `first_name`, `last_name`) 
VALUES 
(1, 'Paul', 'Deitel'),
(2, 'Harvey', 'Deitel'),
(3, 'Abbey', 'Deitel'),
(4, 'Dan', 'Quirk'),
(5, 'Michael', 'Morgan');

-- Table: titles
CREATE TABLE IF NOT EXISTS `title`(
	`isbn` VARCHAR (255) NOT NULL UNIQUE,
    `title` VARCHAR(255),
    `edition_number` INTEGER,
    `copyright` VARCHAR(255),
    PRIMARY KEY (`isbn`)
);

INSERT INTO `title` (`isbn`, `title`, `edition_number`, `copyright`)
VALUES
('0132151006', 'Internet & World Wide Web How to Program', 5, '2012'),
('0133807800', 'Java How to Program', 10, 2015),
('0132575655', 'Java How to Program, Late Objects Version', 10, '2015'),
('013299044X', 'C How to Program', 7, 2013),
('0132990601', 'Simply Visual Basic 2010', 4, '2013'),
('0133406954', 'Visual Basic 2012 How to Program', 6,'2014'),
('0133379337', 'Visual C# 2012 How to Program', 5, '2014'),
('0136151574', 'Visual C++ 2008 How to Program', 2, '2008'),
('0133378713', 'C++ How to Program', 9, '2014'),
('0133570924', 'Android How to Program', 2, '2015'),
('0133764036', 'Android for Programmers: An App-Driven Approach Volume 1', 2 , '2014'),
('0132121360', 'Android for Programmers: An App-Driven Approach', 1 , '2012');

-- Table: author_isbn
CREATE TABLE IF NOT EXISTS `author_isbn` (
	`author_id` INTEGER,
    `isbn` VARCHAR(255),
    FOREIGN KEY (`author_id`) REFERENCES `author`(`author_id`) ON UPDATE NO ACTION ON DELETE NO ACTION,
    FOREIGN KEY(`isbn`) REFERENCES `title`(`isbn`) ON UPDATE NO ACTION ON DELETE NO ACTION
);

INSERT INTO `author_isbn` (`author_id`, `isbn`)
VALUES 
(1, '0132151006'),
(2, '0132151006'),
(3, '0132151006'),
(1, '0133807800'),
(2, '0133807800'),
(1, '0132575655'),
(2, '0132575655'),
(1, '013299044X'),
(2, '013299044X'),
(1, '0132990601'),
(2, '0132990601'),
(3, '0132990601'),
(1, '0133406954'),
(2, '0133406954'),
(3, '0133406954'),
(1, '0133379337'),
(2, '0133379337'),
(1, '0136151574'),
(2, '0136151574'),
(4, '0136151574'),
(1, '0133378713'),
(2, '0133378713'),
(1, '0133764036'),
(2, '0133764036'),
(3, '0133764036'),
(1, '0133570924'),
(2, '0133570924'),
(3, '0133570924'),
(1, '0132121360'),
(2, '0132121360'),
(3, '0132121360'),
(5, '0132121360');