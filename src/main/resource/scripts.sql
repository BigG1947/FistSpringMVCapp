CREATE USER HelloWorldAPP IDENTIFIED BY helloWorld666;

GRANT CONNECT, RESOURCE TO HelloWorldAPP;

CONNECT HelloWorldAPP/helloWorld666;

CREATE TABLE Users (
  id_user NUMERIC PRIMARY KEY,
  first_name VARCHAR(45) NOT NULL,
  age NUMERIC NOT NULL);

COMMIT;

INSERT INTO	Users (id_user, first_name, age) VALUES	(1, 'Robert',19);
INSERT INTO	Users (id_user, first_name, age) VALUES	(2, 'Nick', 23);
INSERT INTO	Users (id_user, first_name, age) VALUES	(3, 'Vlad', 21);
INSERT INTO	Users (id_user, first_name, age) VALUES	(4, 'Artem', 21);

COMMIT ;
