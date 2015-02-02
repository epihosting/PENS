CREATE TABLE
IF NOT EXISTS employees (
	employee_id INT (3),
	first_name VARCHAR (25),
	last_name VARCHAR (25),
	email VARCHAR (50),
	phone_number VARCHAR (13),
	hire_date date,
	job_id INT (3),
	salary INT (12),
	commision_pct INT (12),
	manager_id INT (3),
	department_id INT (3),
	CONSTRAINT PK_employee_id PRIMARY KEY (employee_id),
	CONSTRAINT FK_department_id FOREIGN KEY (department_id) REFERENCES departments (department_id)
);