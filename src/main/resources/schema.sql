
DROP TABLE IF EXISTS product;

CREATE TABLE product (
   id BIGINT  PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   price decimal,
   condition VARCHAR(50)

);