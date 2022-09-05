CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    INT,
    weight    DECIMAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INT
);