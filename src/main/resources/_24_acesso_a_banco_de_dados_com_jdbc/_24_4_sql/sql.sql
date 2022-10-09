
-- 24.4.1 consulta sql básica
-- consulta em especificar as colunas que preciso;
SELECT * FROM `author`;

-- consulta especificando que colunas quero;
SELECT a.`author_id`, a.`last_name` FROM `author` AS a;

-- 24.4.2 cláusula WHERE
-- Os critérios da cláusula WHERE podem conter os operadores <, >, <=, >=, =, <> e LIKE.
SELECT t.`title`, t.`edition_number`, t.`copyright` FROM `title` AS t WHERE t.`copyright` > '2013';

-- Um padrão que contém um caractere porcentagem (%) procura strings que tenham zero ou mais caracteres na posição do caractere porcentagem no padrão.
SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a 
WHERE a.`last_name` LIKE 'D%';

-- Um caractere sublinhado (_) na string padrão indica um único curinga nessa posição no padrão.
SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a 
WHERE a.`last_name` LIKE '_o%';

-- 24_4_3_Cláusula ORDER BY
-- Ordem crescente
SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a 
ORDER BY a.`last_name` ASC;

-- Odem decrescente
SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a 
ORDER BY a.`last_name` DESC;

-- Ordem crescente last_name e depois first_name
SELECT a.`author_id`, a.`first_name`, a.`last_name` FROM `author` AS a 
ORDER BY a.`last_name`, a.`first_name`;

-- Utilizando WHERE e ORDER BY
SELECT t.`isbn`, t.`title`, t.`edition_number`, t.`copyright` FROM `title` AS t 
WHERE t.`title` LIKE '%How to program'
ORDER BY t.`title`;

-- Utilizando INNER JOIN
SELECT a.`first_name`, a.`last_name`, aisbn.`isbn` FROM `author` AS a
INNER JOIN `author_isbn` as aisbn
	ON aisbn.`author_id` = a.`author_id`
ORDER BY a.`last_name`, a.`first_name`;

-- Utilizando a instrução INSERT
INSERT INTO `author` (`first_name`, `last_name`)
VALUES ('Sue', 'Red');

-- Utilizando a cláusula UPDATE
UPDATE `author`
SET `last_name` = 'Black'
WHERE `last_name` = 'Red' AND `first_name` = 'Sue';
-- Podemos utilizar a primary para identificar o registo "WHERE `author_id` = 6"

-- Utilizando a cláusula DELETE
DELETE FROM `author`
WHERE `last_name` = 'Black' AND `first_name` = 'Sue';
-- Podemos utilizar a primary para identificar o registo "WHERE `author_id` = 6"
 


