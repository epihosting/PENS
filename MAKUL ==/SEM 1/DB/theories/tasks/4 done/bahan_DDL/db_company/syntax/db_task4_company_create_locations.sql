CREATE TABLE
IF NOT EXISTS locations (
	location_id INT (3),
	street_address text,
	postal_code VARCHAR (5),
	city VARCHAR (25),
	state_province VARCHAR (25),
	country_id INT (3),
	CONSTRAINT PK_location_id PRIMARY KEY (location_id),
	CONSTRAINT FK_country_id_2 FOREIGN KEY (country_id) REFERENCES countries (country_id)
);