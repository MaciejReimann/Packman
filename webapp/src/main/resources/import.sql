DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `product`;

create table `product`
(
	`id` int NOT NULL,
	`name` varchar(255) DEFAULT NULL,
	`val` float DEFAULT NULL,
);


INSERT INTO employee (id, email, first_name, last_name, salary) values(1, 'xx@xx.pl', 'Stefan', 'Pyk', 22);
INSERT INTO employee (id, email, first_name, last_name, salary) values(2, 'xx@xx.pl', 'Zenon', 'Byk', 200);
INSERT INTO product (id, name, val,) values(1, 'Bulbulator', '3.22');
INSERT INTO product (id, name, val,) values(2, 'KiloFaza', '6.66');
INSERT INTO product (id, name, val,) values(3, 'Kilwater w proszku', '1.50');