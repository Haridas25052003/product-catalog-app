create database db_mart;
use db_mart;

show tables;
desc category;
desc product;

drop table category;
drop table product;

INSERT INTO category (category_id, category_name) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Books'),
(4, 'Home Appliances');

INSERT INTO product (product_id, product_name, product_price, category_id) VALUES
(1, 'Mobile Phone', 15000, 1),
(2, 'Laptop', 65000, 1),
(3, 'T-Shirt', 799, 2),
(4, 'Jeans', 1999, 2),
(5, 'Java Programming Book', 499, 3),
(6, 'Spring Boot Guide', 699, 3),
(7, 'Washing Machine', 32000, 4),
(8, 'Refrigerator', 28000, 4);
