## CONSTRAINTS
### PRIMARY KEY
#### The PRIMARY KEY constraint uniquely identifies each record in a table.
```
create table products(product_id int(5) PRIMARY KEY AUTO_INCREMENT, product_name varchar(255));
```

##### Query OK, 0 rows affected, 1 warning (0.03 sec)

### UNIQUE
#### The UNIQUE constraint ensures that all values in a column are different.
```
create table students(student_id int(5) AUTO_INCREMENT, Name varchar(20) UNIQUE);
```

###### Query OK, 0 rows affected (0.03 sec)

### NOT NULL 
#### The NOT NULL constraint forces a column to not accept NULL values.
```
create table students(student_id int(5) AUTO_INCREMENT, Name varchar(20) NOT NULL);
```

###### Query OK, 0 rows affected (0.08 sec)

### DEFAULT
#### DEFAULT Constraint set a default value to a column.
```
create table students(student_id int(5) PRIMARY KEY AUTO_INCREMENT, Name varchar(20), language varchar(20) DEFAULT 'Tamil');
```

### Query OK, 0 rows affected, 1 warning (0.04 sec)

### CHECK
#### CHECK Constraint ensures the condition given to the column. 

```
create table voters (vote_id int(5), voter_name varchar(20), age int(2), CHECK (age > 18));
```
###### Query OK, 0 rows affected, 2 warnings (0.07 sec)