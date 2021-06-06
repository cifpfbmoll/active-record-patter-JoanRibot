DROP TABLE IF EXISTS fruit;
DROP TABLE IF EXISTS farmer;
CREATE TABLE farmer
(
    name VARCHAR(255) NOT NULL UNIQUE,
    location VARCHAR(255),
    PRIMARY KEY (name)
) ENGINE = InnoDB;
CREATE TABLE fruit
(
    name VARCHAR (255) NOT NULL UNIQUE, 
    description VARCHAR(255), 
    farmer_name VARCHAR (255),
    PRIMARY KEY (name),
    CONSTRAINT `fk_fruit_farmer`
        FOREIGN KEY (farmer_name) REFERENCES farmer (name)
        ON DELETE SET NULL
        ON UPDATE SET NULL
) ENGINE = InnoDB;
CREATE TABLE Encargos
(
    id BIGINT NOT NULL UNIQUE,
    fruit_name VARCHAR (255),
    farmer_name VARCHAR(255),
    PRIMARY KEY (id),
    CONSTRAINT fk_fruit_farmer
        FOREIGN KEY (fruit_name) REFERENCES fruit (name)
            ON DELETE SET NULL
            ON UPDATE SET NULL,
    CONSTRAINT fk_farmer_fruit
        FOREIGN KEY (farmer_name) REFERENCES farmer (name)
            ON DELETE SET NULL
            ON UPDATE SET NULL
) ENGINE = InnoDB;
INSERT INTO 
    farmer (name, location) 
VALUES
    ('Farmer Rick', 'Sa Pobla'),
    ('Morty Vegan', 'Es Vivero');
INSERT INTO 
    fruit (name, description, farmer_name) 
VALUES 
    ('Apple', 'Winter fruit', 'Farmer Rick'),
    ('Pineapple', 'Tropical fruit', 'Morty Vegan');

INSERT INTO 
    Encargos (fruit_name, farmer_name) 
VALUES 
    ('Apple', 'Farmer Rick'),
    ('Pineapple','Morty Vegan');