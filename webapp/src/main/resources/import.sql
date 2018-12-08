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

DROP TABLE IF EXISTS `client`;

create table `client`
(
	`id` int NOT NULL,
	`name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `packageId` varchar(36) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL,
  `phone`varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO employee (id, email, first_name, last_name, salary) values(1, 'xx@xx.pl', 'Stefan', 'Pyk', 22);
INSERT INTO employee (id, email, first_name, last_name, salary) values(2, 'xx@xx.pl', 'Zenon', 'Byk', 200);
INSERT INTO product (id, name, val,) values(1, 'Bulbulator', '3.22');
INSERT INTO product (id, name, val,) values(2, 'KiloFaza', '6.66');
INSERT INTO product (id, name, val,) values(3, 'Kilwater w proszku', '1.50');

INSERT INTO client (id, name, address, packageId, time, description, phone) values(1, 'Jan Kowalski', 'Zachlapana 32/2', 'PL00004', '2018/11/03 12:30', 'pc parts', '+48123123123');
INSERT INTO client (id, name, address, packageId, time, description, phone) values(4, 'Janina Nowak', 'Blotna 42/12', 'PL00314', '2018/11/03 13:30', 'rubber ducks', '+48163888123');
INSERT INTO client (id, name, address, packageId, time, description, phone) values(6, 'Ewa Brzeczyszczykiewicz', 'Zachodnia 121', 'PL05641', '2018/11/03 14:45', 'machines', '+48555123123');
