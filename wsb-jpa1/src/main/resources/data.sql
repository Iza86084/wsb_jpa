insert into address (id, address_line1, address_line2, city, postal_code)
            values (901, 'xx', 'yy', 'city', '60-400');

INSERT INTO ADDRESS (id, city, addressLine1, addressLine2, postalCode) VALUES
(1, 'Warsaw', 'Main St 1', NULL, '00-001'),
(2, 'Krakow', 'Second St 3', NULL, '30-002'),
(3, 'Gdansk', 'Third St 7', NULL, '80-003');

INSERT INTO PATIENT (id, firstName, lastName, telephoneNumber, email, patientNumber, dateOfBirth, address_id) VALUES
(1, 'Anna', 'Nowak', '123456789', 'anna.nowak@example.com', 'PN123', '1980-05-15', 1),
(2, 'Jan', 'Kowalski', '987654321', 'jan.kowalski@example.com', 'PN124', '1990-03-22', 2),
(3, 'Maria', 'Zielinska', '456789123', 'maria.zielinska@example.com', 'PN125', '1975-07-10', 3);

INSERT INTO DOCTOR (id, firstName, lastName, telephoneNumber, email, doctorNumber, specialization, address_id) VALUES
(1, 'Dr. Adam', 'Nowak', '123123123', 'adam.nowak@hospital.com', 'D123', 'CARDIOLOGY', 1),
(2, 'Dr. Ewa', 'Kowalska', '456456456', 'ewa.kowalska@hospital.com', 'D124', 'NEUROLOGY', 2);

INSERT INTO VISIT (id, description, time, patient_id, doctor_id) VALUES
(1, 'Routine checkup', '2023-05-10 10:00:00', 1, 1),
(2, 'Follow-up appointment', '2023-06-15 11:30:00', 1, 1),
(3, 'Initial consultation', '2023-07-20 14:00:00', 2, 2),
(4, 'Emergency visit', '2023-08-22 09:00:00', 3, 1);

INSERT INTO MEDICAL_TREATMENT (id, description, type, visit_id) VALUES
(1, 'Blood test', 'DIAGNOSTICS', 1),
(2, 'MRI scan', 'DIAGNOSTICS', 3),
(3, 'Prescription adjustment', 'TREATMENT', 2);

