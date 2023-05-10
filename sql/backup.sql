/* Criação do banco de dados */
CREATE DATABASE IF NOT EXISTS arquitetura;
USE arquitetura;

/* Criação do usuário administrador */
CREATE TABLE administrador(
	id INT AUTO_INCREMENT PRIMARY KEY,
	usuario VARCHAR(255),
	senha VARCHAR(255)
);
/* Inserção de um administrador */
INSERT INTO administrador VALUES
(1, "admin", "1234");

/* Criação da tabela usuário */
CREATE TABLE usuario(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255),
	email VARCHAR(255),
	cpf CHAR(11) UNIQUE
);

