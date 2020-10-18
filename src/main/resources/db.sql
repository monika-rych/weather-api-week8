CREATE DATABASE IF NOT EXISTS weather;
CREATE USER IF NOT EXISTS 'weatherUser'@'%' IDENTIFIED BY 'weatherPassword';
GRANT ALL PRIVILEGES ON weather.* TO 'weatherUser'@'%';