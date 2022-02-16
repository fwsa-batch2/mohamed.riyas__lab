# MySQL- QUERIES
### SHOW DATABASES:
#### To list all databases:
```syntax
SHOW DATABASES;
```
| Database           |
|:-------------------|
| batch_students     |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

###### 5 rows in set (0.01 sec)
****

### CREATE DATABASE:
#### To Create a database:
```syntax
CREATE DATABASE mobel_furnitures;
```
###### Query OK, 1 row affected (0.02 sec) 
****

### USE DATABASE:
#### To Access a database:
```syntax
use mobel_furnitures;
```
###### Database changed
****

### CREATE TABLE:
#### To Create a table;
```syntax
CREATE TABLE products (Product_id int(5) primary key, Product_Name varchar(255), Product_type varchar(30)); 
```
###### Query OK, 0 rows affected, 1 warning (0.07 sec)
****

### SHOW TABLES:
#### To List all the tables in a database:
```syntax
SHOW TABLES;
```
|Tables_in_mobel_furnitures |
|:--------------------------|
| products                  |

###### 1 row in set (0.01 sec)
****

### DESCRIBE TABLE;
#### To display the structure of the table:
```syntax
desc products;
```
| Field        | Type         | Null | Key | Default | Extra |
|:-------------|:-------------|:-----|:----|:--------|:------|
| Product_id   | int          | NO   | PRI | NULL    |       |
| Product_Name | varchar(255) | YES  |     | NULL    |       |
| Product_type | varchar(30)  | YES  |     | NULL    |       |

###### 3 rows in set (0.01 sec|
****

### INSERT INTO:
#### To add new data into a table:
```syntax
INSERT INTO products (Product_id,Product_Name,Product_type) VALUES(1,"Orange Bar Chair", "Chair"),(2,"Rapid Long Sofa","Sofa");
```

###### Query OK, 1 row affected (0.01 sec)
****

### SELECT:
#### To retrieve all values from all columns in a table:
```syntax
SELECT * from products;
```

| Product_id | Product_Name     | Product_type |
|:-----------|:-----------------|:-------------|
|          1 | Orange Bar Chair | Chair        |
|          2 | Rapid Long Sofa  | Sofa         |

###### 1 row in set (0.00 sec)
****

### ALTER TABLE:
#### To modify a table:
```syntax
ALTER TABLE products add Price int(7);
```

###### Query OK, 0 rows affected, 1 warning (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```syntax
DESCRIBE products;
```
| Field        | Type         | Null | Key | Default | Extra |
|:-------------|:-------------|:-----|:----|:--------|:------|
| Product_id   | int          | NO   | PRI | NULL    |       |
| Product_Name | varchar(255) | YES  |     | NULL    |       |
| Product_type | varchar(30)  | YES  |     | NULL    |       |
| Price        | int          | YES  |     | NULL    |       |

###### rows in set (0.00 sec)

```syntax
SELECT * from products;
```
| Product_id | Product_Name     | Product_type | Price |
|:-----------|:-----------------|:-------------|:------|
|          1 | Orange Bar Chair | Chair        |  NULL |
|          2 | Rapid Long Sofa  | Sofa         |  NULL |

###### 2 rows in set (0.01 sec)
****

### WHERE Clause:
#### To extract filtered data;
```
SELECT * from products WHERE product_type = "Chair";
```

| Product_id | Product_Name     | Product_type | Price |
|:-----------|:-----------------|:-------------|:------|
|          1 | Orange Bar Chair | Chair        |  NULL |

###### 1 row in set (0.01 sec)
****

### UPDATE TABLE:
#### To add a data in a table:
```syntax
UPDATE products SET Price = 2000 WHERE Product_id = 1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```syntax
SELECT * from products;
```
| Product_id | Product_Name     | Product_type | Price |
|:-----------|:-----------------|:-------------|:------|
|          1 | Orange Bar Chair | Chair        |  2000 |
|          2 | Rapid Long Sofa  | Sofa         |  NULL |

###### 2 rows in set (0.00 sec)
****

### DELETE:
#### To delete an existing records in a table:
```syntax
DELETE from products where Product_id = 1;
```
###### Query OK, 1 row affected (0.01 sec)

```syntax
select * from products;
```
| Product_id | Product_Name    | Product_type | Price |
|------------|-----------------|--------------|-------|
|          2 | Rapid Long Sofa | Sofa         | 10000 |
###### 1 row in set (0.00 sec)
****
