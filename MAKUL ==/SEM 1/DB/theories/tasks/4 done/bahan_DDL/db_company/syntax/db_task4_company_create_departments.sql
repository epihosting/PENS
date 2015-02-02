CREATE TABLE
IF NOT EXISTS departments (
	department_id INT (3),
	department_name VARCHAR (25),
	manager_id INT (3),
	location_id INT (3),
	CONSTRAINT PK_department_id PRIMARY KEY (department_id),
	CONSTRAINT FK_location_id FOREIGN KEY (location_id) REFERENCES locations (location_id)
);