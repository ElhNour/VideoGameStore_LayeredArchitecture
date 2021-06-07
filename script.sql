--<ScriptOptions statementTerminator=";"/>

CREATE TABLE RentedItem (
        itemID INTEGER PRIMARY KEY NOT NULL,
        customerID INTEGER NOT NULL,
        dueDate TIMESTAMP NOT NULL,
        FOREIGN KEY customerID REFERENCES Client(customerID)
);

CREATE TABLE StockItem (
        itemID INTEGER PRIMARY KEY NOT NULL,
        title VARCHAR(50) NOT NULL,
        rentalPrice INTEGER NOT NULL
);

CREATE TABLE Film (
        filmid INTEGER NOT NULL,
        acteur VARCHAR(50) NOT NULL,
        FOREIGN KEY filmid REFERENCES StockItem(itemID)

);

CREATE TABLE Jeux (
        jeuid INTEGER NOT NULL,
        platform VARCHAR(100) NOT NULL,
        FOREIGN KEY jeuid REFERENCES StockItem(itemID)
);

CREATE TABLE Client (
        customerID INTEGER NOT NULL,
        custname VARCHAR(50) NOT NULL,
        accountBalance INTEGER NOT NULL,
);

