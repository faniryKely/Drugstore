CREATE TABLE UserCurrent (
    Id SERIAL PRIMARY KEY,
    EmailAdress VARCHAR(50) ,
    Password VARCHAR(50) UNIQUE
);