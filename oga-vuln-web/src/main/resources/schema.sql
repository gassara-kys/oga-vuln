CREATE TABLE IF NOT EXISTS VULNERABILITY (
	ID INT PRIMARY KEY AUTO_INCREMENT, 
	NAME VARCHAR(200), TYPE VARCHAR(10), 
	CVE_NO VARCHAR(15), 
	DESCRIPTION VARCHAR(1000), 
	SCORE VARCHAR(8) 
);
