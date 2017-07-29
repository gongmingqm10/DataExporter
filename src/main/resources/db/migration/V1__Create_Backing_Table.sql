CREATE TABLE backing (
    ID INTEGER not null PRIMARY KEY,
    code1 VARCHAR(100),
    code2 VARCHAR(100),
    launched_at DATETIME,
    status VARCHAR(100),
    money DOUBLE
);