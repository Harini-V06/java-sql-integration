-- Java-SQL Integration: Database Schema
-- Run this first to set up the required database and table

CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

CREATE TABLE IF NOT EXISTS students (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    email       VARCHAR(100) NOT NULL UNIQUE,
    age         INT CHECK (age >= 0),
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Sample data to test CRUD operations
INSERT INTO students (name, email, age) VALUES
    ('Alice Johnson', 'alice@example.com', 20),
    ('Bob Smith',     'bob@example.com',   22),
    ('Carol White',   'carol@example.com', 21);
