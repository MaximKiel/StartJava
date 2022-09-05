CREATE DATABASE jaegers;
\c jaegers;
   CREATE TABLE jaegers (
                id        serial primary key,
                modelName text,
                mark      text,
                height    int,
                weight    decimal,
                status    text,
                origin    text,
                launch    date,
                kaijuKill int);