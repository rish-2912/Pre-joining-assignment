use sakila;
SELECT * FROM actor;
SELECT DISTINCT last_name FROM actor;
SELECT * FROM actor WHERE first_name = 'JOE';
SELECT * FROM actor WHERE first_name = 'JOE' AND last_name = 'SWANK';
SELECT * FROM actor WHERE first_name = 'JOE' OR last_name = 'SWANK';
SELECT * FROM actor ORDER BY last_name;
INSERT INTO actor (first_name, last_name) VALUES ('John', 'Doe');
UPDATE actor SET last_name = 'Smith' WHERE actor_id = 1;
DELETE FROM actor WHERE actor_id = 1;
SELECT * FROM actor LIMIT 5;
SELECT * FROM actor WHERE first_name LIKE 'A%';
SELECT * FROM actor WHERE last_name LIKE '%th%';
SELECT * FROM actor WHERE actor_id IN (1, 2, 3);
SELECT * FROM actor WHERE actor_id BETWEEN 5 AND 10;
SELECT first_name AS 'First Name', last_name AS 'Last Name' FROM actor;

SELECT a.actor_id, a.first_name, a.last_name, fa.film_id
FROM actor a
INNER JOIN film_actor fa ON a.actor_id = fa.actor_id;

SELECT a.actor_id, a.first_name, a.last_name, fa.film_id
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id;

SELECT a.actor_id, a.first_name, a.last_name, fa.film_id
FROM actor a
RIGHT JOIN film_actor fa ON a.actor_id = fa.actor_id;

SELECT a.actor_id, a.first_name, a.last_name, fa.film_id
FROM actor a
LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
UNION
SELECT a.actor_id, a.first_name, a.last_name, fa.film_id
FROM actor a
RIGHT JOIN film_actor fa ON a.actor_id = fa.actor_id;

SELECT first_name, last_name FROM actor
UNION
SELECT first_name, last_name FROM customer;

CREATE TABLE actor_backup AS SELECT * FROM actor;

CREATE DATABASE employee;

CREATE TABLE department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK (age >= 18),
    country VARCHAR(50) DEFAULT 'INDIA',
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE INDEX idx_last_name ON actor (last_name);

DROP TABLE actor_backup;

ALTER TABLE actor ADD COLUMN middle_name VARCHAR(50);

SELECT last_name, COUNT(*) FROM actor GROUP BY last_name;

SELECT last_name, COUNT(*) FROM actor GROUP BY last_name HAVING COUNT(*) > 5;

SELECT COUNT(*) FROM actor;
SELECT AVG(length) FROM film;
SELECT SUM(amount) FROM payment;


DELIMITER //
create procedure getNumberOfFilms(IN id int,OUT filmCount int)
BEGIN
	select count into filmCount from (select actor_id,count(*) as count from film_actor group by actor_id)as t1 where actor_id=id;
END //
Delimiter ;    

set @count=0;
call getNumberOfFilms(107,@count);
select @count;	





