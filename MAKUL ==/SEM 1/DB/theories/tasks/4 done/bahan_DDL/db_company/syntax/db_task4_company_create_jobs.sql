CREATE TABLE
IF NOT EXISTS jobs (
	job_id INT (3),
	job_title VARCHAR (25),
	min_salary INT (12),
	max_salary INT (12),
	CONSTRAINT PK_job_id PRIMARY KEY (job_id)
);