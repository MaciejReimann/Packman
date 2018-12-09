INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(1, 'Jan Kowalski', 'Dull Company', '+48123123123', 'JK', '2018/12/10 08:00', '2018/12/10 14:00');
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(2, 'Janina Nowak', 'Borning Inc', '+48163888123', 'JN', '2018/12/10 10:00', '2018/12/10 12:00' );
INSERT INTO client (id, name, description, phone, bfr, time_from, time_to) values(3, 'Ewa Brzeczyszczykiewicz', 'Nice Co.', '+48555123123', 'EB', '2018/12/10 12:00', '2018/12/10 18:00');

INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(1, 1, 'Zachodnia 121', 'PL00021', 'out for delivery', '2018/12/10 12:30', '30');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(2, 1, 'Zachodnia 121', 'PL00333', 'out for delivery',  '2018/12/10 12:30', '30');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(3, 3, 'Blotna 1/14', 'PL01528', 'out for delivery',  '2018/12/10 13:30', '90');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(4, 2, 'Wschodnia 6', 'PL00112', 'out for delivery',  '2018/12/10 15:00', '180');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(5, 2, 'Wschodnia 6', 'PL02244', 'out for delivery',  '2018/12/10 15:00', '180');
INSERT INTO parcel (id, client_id, address, parcel_no, status, delivery_time, eta) values(6, 2, 'Wschodnia 6', 'PL03890', 'out for delivery',  '2018/12/10 15:00', '180');

