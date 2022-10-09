
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



 


