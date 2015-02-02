CREATE TABLE
IF NOT EXISTS countries (
	country_id INT (3),
	country_name VARCHAR (25),
	region_id INT (3),
	CONSTRAINT PK_country_id PRIMARY KEY (country_id),
	CONSTRAINT FK_country_id FOREIGN KEY (region_id) REFERENCES regions (region_id)
);
