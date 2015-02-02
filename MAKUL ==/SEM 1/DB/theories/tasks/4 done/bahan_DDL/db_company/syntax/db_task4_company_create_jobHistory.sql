CREATE TABLE
IF NOT EXISTS job_history (
	employee_id INT (3),
	start_date date,
	end_date date,
	job_id int(3),
	department_id INT (3),
	CONSTRAINT FK_job_id_2 FOREIGN KEY (job_id) REFERENCES jobs (job_id),
	CONSTRAINT FK_department_id_2 FOREIGN KEY (department_id) REFERENCES departments (department_id)
);