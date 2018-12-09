DROP TABLE IF EXISTS `client`;

CREATE SEQUENCE IF NOT EXISTS client_seq START WITH 10;
CREATE SEQUENCE IF NOT EXISTS parcel_seq START WITH 10;

create table `client`
(
	`id` int NOT NULL,
	`name` varchar(255) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL,
  `phone`varchar(16) DEFAULT NULL,
  `bfr` varchar(16) DEFAULT NULL,
  `time_from` varchar(128) DEFAULT NULL,
  `time_to` varchar(128) DEFAULT NULL,
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


INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(1, 'Jan Kowalski', 'Dull Company', '+48123123123', 'JK', '2018/12/10 08:00', '2018/12/10 14:00');
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(2, 'Janina Nowak', 'Borning Inc', '+48163888123', 'JN', '2018/12/10 10:00', '2018/12/10 12:00' );
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(3, 'Ewa Brzeczyszczykiewicz', 'Nice Co.', '+48555123123', 'EB', '2018/12/10 12:00', '2018/12/10 18:00');
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(4, 'Robert Derden', 'Nice Co.', '+4855666123', 'RB', '2018/12/10 8:00', '2018/12/10 12:00');
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(5, 'Krzysztof Erbra', 'Rock Co.', '+48121345633', 'KE', '2018/12/10 12:00', '2018/12/10 18:00');
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(6, 'Filip Konopny', 'Dance Limited.', '+48555123123', 'FK', '2018/12/10 06:00', '2018/12/10 11:00');

INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(1, 1, 'Zachodnia 121', 'PL00021', 'in transit', '2018/12/10 12:30', '270');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(2, 1, 'Zachodnia 121', 'PL00333', 'out for delivery',  '2018/12/10 12:30', '270');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(3, 3, 'Blotna 1/14', 'PL01528', 'out for delivery',  '2018/12/10 13:30', '330');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(4, 2, 'Wschodnia 6', 'PL00112', 'out for delivery',  '2018/12/10 15:00', '420');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(5, 2, 'Wschodnia 6', 'PL02244', 'in depot #1',  '2018/12/20 15:00', null);
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(6, 2, 'Wschodnia 6', 'PL03890', 'ready for driver pickup',  '2018/12/12 15:00', null);
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(7, 4, 'Izolacyjna 1143', 'PL43328', 'out for delivery',  '2018/12/10 09:30', '90');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(8, 5, 'Lukrecji 13', 'PL11118', 'out for delivery',  '2018/12/10 08:30', '30');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(9, 5, 'Rudy 102', 'PL10200', 'out for delivery',  '2018/12/10 08:15', '15');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(5, 2, 'Wschodnia 6', 'PL42264', 'delivered',  '2018/12/02 08:00', '0');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(5, 2, 'Wschodnia 6', 'PL00012', 'delivered',  '2018/12/04 10:15', '0');

