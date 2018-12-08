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
  `description` varchar(512) DEFAULT NULL,
  `phone`varchar(16) DEFAULT NULL,
  `bfr` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `parcel`;

create table `parcel`
(
	`id` int NOT NULL,
	`client_id` int DEFAULT NOT NULL,
  `address` varchar(512) DEFAULT NULL,
  `parcel_no` varchar(36) DEFAULT NULL,
  `status` varchar(36) DEFAULT NULL,
  `delivery_time`  varchar(512) DEFAULT NULL,
  `eta`  varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO employee (id, email, first_name, last_name, salary) values(1, 'xx@xx.pl', 'Stefan', 'Pyk', 22);
INSERT INTO employee (id, email, first_name, last_name, salary) values(2, 'xx@xx.pl', 'Zenon', 'Byk', 200);
INSERT INTO product (id, name, val,) values(1, 'Bulbulator', '3.22');
INSERT INTO product (id, name, val,) values(2, 'KiloFaza', '6.66');
INSERT INTO product (id, name, val,) values(3, 'Kilwater w proszku', '1.50');

INSERT INTO client (id, name, description, phone, bfr) values(1, 'Jan Kowalski', 'Dull Company', '+48123123123', 'JK');
INSERT INTO client (id, name, description, phone, bfr) values(2, 'Janina Nowak', 'Borning Inc', '+48163888123', 'JN' );
INSERT INTO client (id, name, description, phone, bfr) values(3, 'Ewa Brzeczyszczykiewicz', 'Nice Co.', '+48555123123', 'EB');

INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(1, 1, 'Zachodnia 121', 'PL00021', 'out for delivery', '2018/12/10 12:30', '30');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(2, 1, 'Zachodnia 121', 'PL00333', 'out for delivery',  '2018/12/10 12:30', '30');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(3, 3, 'Blotna 1/14', 'PL01528', 'out for delivery',  '2018/12/10 13:30', '90');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(4, 2, 'Wschodnia 6', 'PL00112', 'out for delivery',  '2018/12/10 15:00', '180');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(5, 2, 'Wschodnia 6', 'PL02244', 'out for delivery',  '2018/12/10 15:00', '180');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(6, 2, 'Wschodnia 6', 'PL03890', 'out for delivery',  '2018/12/10 15:00', '180');

