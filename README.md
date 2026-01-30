# Product & Category Backend – Spring Boot
-------------------------------------------------------------------------------------------------------------------------------------
Simple REST backend using Spring Boot and JPA.

It manages:
- Categories
- Products (each product belongs to one category)
-------------------------------------------------------------------------------------------------------------------------------------
## Relationship

One Category → Many Products  
Many Products → One Category

In Product entity:

```java
@ManyToOne
@JoinColumn(name="categoryid", nullable=false)
private Category category;
This creates a foreign key categoryid in the product table.
-------------------------------------------------------------------------------------------------------------------------------------
Project Structure
product-backend/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/demo/
│   │   │       ├── controller/
│   │   │       │   └── ProductController.java
│   │   │       │   └── CategoryController.java
│   │   │       │
│   │   │       ├── service/
│   │   │       │   ├── ProductService.java
│   │   │       │   ├── ProductServiceImpl.java
│   │   │       │   ├── CategoryService.java
│   │   │       │   └── CategoryServiceImpl.java
│   │   │       │
│   │   │       ├── dao/
│   │   │       │   ├── ProductDao.java
│   │   │       │   └── CategoryDao.java
│   │   │       │
│   │   │       ├── model/
│   │   │       │   ├── Product.java
│   │   │       │   └── Category.java
│   │   │       │
│   │   │       └── SpringbootApi09Application.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql   <-- add your SQL file here
│   │
│   └── test/
│
├── pom.xml
└── README.md
Where to put SQL file?
Create this file:

src/main/resources/data.sql
Spring Boot will automatically run this file on startup.
-------------------------------------------------------------------------------------------------------------------------------------
Example data.sql:

INSERT INTO category(categoryid, categoryname) VALUES (1, 'Electronics');
INSERT INTO category(categoryid, categoryname) VALUES (2, 'Books');

INSERT INTO product(productid, productname, productprice, categoryid)
VALUES (1, 'Mobile Phone', 15000, 1);

INSERT INTO product(productid, productname, productprice, categoryid)
VALUES (2, 'Java Book', 500, 2);
Database Config
Edit src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Run the Project
From project root (where pom.xml exists):
-------------------------------------------------------------------------------------------------------------------------------------
mvn spring-boot:run
App runs on:

http://localhost:8080
Sample API
Get product by id
-------------------------------------------------------------------------------------------------------------------------------------
GET /req1/1
Returns product with its category.
