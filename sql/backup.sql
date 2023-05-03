CREATE DATABASE arquitetura;
USE arquitetura;

CREATE TABLE administrador(
	id INT AUTO_INCREMENT PRIMARY KEY,
	usuario VARCHAR(255),
	senha VARCHAR(255)
);

INSERT INTO administrador VALUES
(1, "admin", "1234");
