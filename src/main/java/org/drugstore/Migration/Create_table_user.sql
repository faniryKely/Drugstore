CREATE TABLE "user" (
    Id SERIAL PRIMARY KEY,
    Name VARCHAR(50) ,
    First_name VARCHAR(50) ,
    EmailAdress VARCHAR(50)  CHECK (CHARINDEX('@', EmailAdress) > 0 )
);