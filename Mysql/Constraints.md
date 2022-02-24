## CONSTRAINTS
### PRIMARY KEY
#### The PRIMARY KEY constraint uniquely identifies each record in a table.
```syntax
create table products(product_id int(5) PRIMARY KEY);
```

##### Query OK, 0 rows affected, 1 warning (0.03 sec)

### UNIQUE
#### The UNIQUE constraint ensures that all values in a column are different.
```syntax
create table students(Name varchar(20) UNIQUE);
```

###### Query OK, 0 rows affected (0.03 sec)

### NOT NULL 
#### The NOT NULL constraint forces a column to not accept NULL values.
```
create table students(Name varchar(20) NOT NULL);
```
Query OK, 0 rows affected (0.08 sec)