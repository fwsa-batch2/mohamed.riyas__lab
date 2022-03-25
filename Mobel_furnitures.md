## Mobel Furnitures 

![Mobel ER Diagram](https://user-images.githubusercontent.com/93571049/159455328-744ef2f4-0ede-4633-9197-5f3078811d8e.png)

![image](https://user-images.githubusercontent.com/93571049/159635530-c16c6dff-a581-4682-a858-1d7a3b60265b.png)

### Creating database

```
CREATE DATABASE mobel_furnitures;
```

## Creating Tables

#### Users table

```
CREATE TABLE users(user_id int(5) PRIMARY KEY auto_increment,user_name varchar(50) NOT NULL,email_id varchar(30) NOT NULL,phone_number bigint(10) NOT NULL,password varchar(10) NOT NULL);
```

```
DESC users;
```


| Field        | Type        | Null | Key | Default | Extra          |
|:-------------|:------------|:-----|:----|:--------|:---------------|
| user_id      | int         | NO   | PRI | NULL    | auto_increment |
| user_name    | varchar(50) | NO   |     | NULL    |                |
| email_id     | varchar(30) | NO   |     | NULL    |                |
| phone_number | bigint      | NO   | UNI | NULL    |                |
| password     | varchar(10) | NO   |     | NULL    |                |

###### 5 rows in set (0.01 sec)

#### Products Table

```
CREATE TABLE products (product_id int(5) PRIMARY KEY auto_increment,product_name varchar(255) UNIQUE, product_type varchar(20) NOT NULL,Category_id int(5),Price int(5) NOT NULL, warranty varchar(20) NOT NULL,Footrest varchar(30) NOT NULL, Armrest varchar(30) NOT NULL, Wheels varchar(30) NOT NULL, foreign key(Category_id) references category(Category_id));
```

###### Query OK, 0 rows affected, 2 warnings (0.04 sec)

```
DESC products;
```


| Field        | Type         | Null | Key | Default | Extra          |
|:-------------|:-------------|:-----|:----|:--------|:---------------|
| product_id   | int          | NO   | PRI | NULL    | auto_increment |
| product_name | varchar(255) | YES  | UNI | NULL    |                |
| product_type | varchar(20)  | NO   |     | NULL    |                |
| category_id  | int          | YES  | MUL | NULL    |                |
| Price        | int          | NO   |     | NULL    |                |
| warranty     | varchar(20)  | NO   |     | NULL    |                |
| Footrest     | varchar(30)  | NO   |     | NULL    |                |
| Armrest      | varchar(30)  | NO   |     | NULL    |                |
| Wheels       | varchar(30)  | NO   |     | NULL    |                |

###### 8 rows in set (0.02 sec)

#### Category Table

```
create table category(category_id int(5) primary key auto_increment,Category_name varchar(30) UNIQUE);
```

```
desc category;
```

| Field         | Type        | Null | Key | Default | Extra          |
|:--------------|:------------|:-----|:----|:--------|:---------------|
| category_id   | int         | NO   | PRI | NULL    | auto_increment |
| Category_name | varchar(30) | YES  | UNI | NULL    |                |

###### 2 rows in set (0.00 sec)

#### Orders Table

```
CREATE TABLE orders(order_id int(5) PRIMARY KEY auto_increment,user_id int(5),product_id int(5),order_date timestamp not null default current_timestamp, FOREIGN KEY(user_id) references users(user_id),FOREIGN KEY(product_id) references products(product_id));
```

```
desc orders;
```


| Field      | Type      | Null | Key | Default           | Extra             |
|:-----------|:----------|:-----|:----|:------------------|:------------------|
| order_id   | int       | NO   | PRI | NULL              | auto_increment    |
| user_id    | int       | YES  | MUL | NULL              |                   |
| product_id | int       | YES  | MUL | NULL              |                   |
| order_date | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

###### 4 rows in set (0.02 sec)

#### Payment Table

```
create table payment(payment_id int(5) PRIMARY KEY auto_increment, order_id int(5),payment_type varchar(20) NOT NULL,payment_status,delivery_status varchar(20) NOT NULL,foreign key(order_id) references orders(order_id));
```

```
desc payment;
```

| Field           | Type        | Null | Key | Default | Extra |
|:----------------|:------------|:-----|:----|:--------|:------|
| payment_id      | int         | NO   | PRI | NULL    |       |
| order_id        | int         | YES  | MUL | NULL    |       |
| payment_type    | varchar(20) | NO   |     | NULL    |       |
| delivery_status | varchar(20) | NO   |     | NULL    |       |
| payment_status  | varchar(20) | YES  |     | NULL    |       |

###### 5 rows in set (0.01 sec)

```
show tables;
```


| Tables_in_mobel_furnitures |
|:---------------------------|
| category                   |
| orders                     |
| payment                    |
| products                   |
| users                      |

###### 5 rows in set (0.00 sec)

****

## Inserting values into the tables

#### Inserting values into Users

```
INSERT INTO users(user_name,email_id,phone_number,password) values('Rohit sharma','rohitsharmacricketer@gmail.com','9455867092','Rohit@264');
```

```
INSERT INTO users(user_name,email_id,phone_number,password) values('Virat Kholi','virat@gmail.com',8662134860,'virat@43');
```

```
INSERT INTO users(user_name,email_id,phone_number,password) values('MS Dhoni','msdhoni@gmail.com',9087634860,'MSD@183');
```

```
insert into users(user_name,email_id,phone_number,password) values ('Hardik Pandya','hpandya@gmail.com',7892583343,'Pandya@100');
```

```
insert into users(user_name,email_id,phone_number,password) values ('Krunal Pandya','kpandya@gmail.com',9702583343,'Krunal@200');
```

```
select * from users;
```

| user_id | user_name     | email_id                       | phone_number | password   |
|:--------|:--------------|:-------------------------------|:-------------|:-----------|
|       1 | Rohit sharma  | rohitsharmacricketer@gmail.com |   9455867092 | Rohit@264  |
|       2 | Virat Kholi   | virat@gmail.com                |   8662134860 | virat@43   |
|       3 | MS Dhoni      | msdhoni@gmail.com              |   9087634860 | MSD@183    |
|       4 | Hardik Pandya | hpandya@gmail.com              |   7892583343 | Pandya@100 |
|       5 | Krunal Pandya | kpandya@gmail.com              |   9702583343 | Krunal@200 |

###### 5 rows in set (0.01 sec)

#### Inserting values into category

```
INSERT INTO category(category_name) values('Bar Chair')('Office chair'),('Designer Chair');
```

```
insert into category(category_name) values ('Single Seater Sofa');
```

```
insert into category(category_name) values ('Two Seater Sofa'),('Three Seater Sofa');
```

```
select * from category;
```


| category_id | Category_name      |
|:------------|:-------------------|
|           1 | Bar Chair          |
|           3 | Designer Chair     |
|           2 | Office chair       |
|           4 | Single Seater Sofa |
|           6 | Three Seater SOfa  |
|           5 | Two Seater Sofa    |

###### 6 rows in set (0.00 sec)

#### Inserting values into products

```
insert into products(product_id,product_name,product_type,category_id,Price,warranty,Footrest,Armrest,Wheels) values (1,'Rapid Orange Natural Fiber Bar Chair','Chair',1,2000,'3 Years','Yes','No','No');
```

```
insert into products(product_id,product_name,product_type,category_id,Price,warranty,Footrest,Armrest,Wheels) values (2,'Swivel Bar Chair','Chair',1,2200,'3 Years','Yes','No','No');
```

```
insert into products(product_id,product_name,product_type,category_id,Price,warranty,Footrest,Armrest,Wheels) values (3,'Leatherette Office Executive Chair','Chair',2,5200,'5 Years','No','Yes','Yes');
```

```
insert into products(product_id,product_name,product_type,category_id,Price,warranty,Footrest,Armrest,Wheels) values (4,'Tulip Fabric 3 Seater Sofa','Sofa',6,25000,'5 Years','No','Yes','No');
```

```
insert into products(product_id,product_name,product_type,category_id,Price,warranty,Footrest,Armrest,Wheels) values (5,'Solid Wood Sofa','Sofa',6,50000,'8 Years','No','Yes','No');
```

```
select * from products;
```

| product_id | product_name                         | product_type | category_id | Price | warranty | Footrest | Armrest | Wheels |
|:-----------|:-------------------------------------|:-------------|:------------|:------|:---------|:---------|:--------|:-------|
|          1 | Rapid Orange Natural Fiber Bar Chair | Chair        |           1 |  2000 | 3 Years  | Yes      | No      | No     |
|          2 | Swivel Bar Chair                     | Chair        |           1 |  2200 | 3 Years  | Yes      | No      | No     |
|          3 | Leatherette Office Executive Chair   | Chair        |           2 |  5200 | 5 Years  | No       | Yes     | Yes    |
|          4 | Tulip Fabric 3 Seater Sofa           | Sofa         |           6 | 25000 | 5 Years  | No       | Yes     | No     |
|          5 | Solid Wood Sofa                      | Sofa         |           6 | 50000 | 8 Years  | No       | Yes     | No     |

###### 5 rows in set (0.00 sec)


#### Inserting values into orders

```
insert into orders(user_id,product_id) values(2,3),(2,1);
```

```
select * from orders;
```


| order_id | user_id | product_id | order_date          |
|:---------|:--------|:-----------|:--------------------|
|        1 |       2 |          3 | 2022-03-21 12:37:11 |
|        2 |       2 |          1 | 2022-03-21 12:44:52 |

###### 2 rows in set (0.01 sec)

#### Inserting values into payment

```
insert into payment(payment_id,order_id,payment_type,delivery_status,payment_status) values (79852,2,'Debit card','Delivered','Received');
```

```
insert into payment(payment_id,order_id,payment_type,delivery_status,payment_status) values (79547,1,'Debit card','Delivered','Received');
```

```
select * from payment;
```

| payment_id | order_id | payment_type | delivery_status | payment_status |
|:-----------|:---------|:-------------|:----------------|:---------------|
|      79547 |        1 | Debit card   | Delivered       | Received       |
|      79852 |        2 | Debit card   | Delivered       | Received       |

###### 2 rows in set (0.00 sec)

****