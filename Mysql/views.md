# views

## creating tables for views

```
create table employee(id int(5) primary key auto_increment, name varchar(255) NOT NULL,salary int(10) NOT NULL);
```

```
show tables;
```

| Tables_in_rough |
+-----------------+
| employee        |
| highest_salary  |

###### 2 rows in set (0.01 sec)

### inserting values into the tables

```
insert into employee (name,salary) values ("Suguram",20000),("Riyas",23000),("Haiden",24000),("Santhanu",19000);
```
```
select * from employee;
```

| id | name     | salary |
|:---|:---------|:-------|
|  1 | Suguram  |  20000 |
|  2 | Riyas    |  23000 |
|  3 | Haiden   |  24000 |
|  4 | Santhanu |  19000 |

###### 4 rows in set (0.00 sec)
****

## Creating views

```
create view highest_salary AS select name,salary from employee where salary > 20000;
```

#### show views

```
select * from highest_salary;
```

| name   | salary |
|:-------|:-------|
| Riyas  |  23000 |
| Haiden |  24000 |

###### 2 rows in set (0.01 sec)
****

## Modifying view

```
select * from highest_salary;
```


| name   | salary |
|:-------|:-------|
| Riyas  |  23000 |
| Haiden |  24000 |
| ram    |  25000 |

###### 3 rows in set (0.00 sec)

### modifying view using create or replace statement.

```
create or replace view highest_salary as select name,salary from employee where salary >= 20000;
```

```
select * from highest_salary;
```


| name    | salary |
|:--------|:-------|
| Suguram |  20000 |
| Riyas   |  23000 |
| Haiden  |  24000 |
| ram     |  25000 |

###### 4 rows in set (0.00 sec)
****

## Rename a view

```
RENAME TABLE highest_salary TO highest_paid_employees;
```

```
select * from highest_paid_employees;
```

| name    | salary |
|:--------|:-------|
| Suguram |  20000 |
| Riyas   |  23000 |
| Haiden  |  24000 |
| ram     |  25000 |

###### 4 rows in set (0.01 sec)
**** 

## inserting into a views

```
insert into highest_paid_employees(name,salary) values("Ismail",24500);
```

```
select * from highest_paid_employees;
```


| name    | salary |
|:--------|:-------|
| Suguram |  20000 |
| Riyas   |  23000 |
| Haiden  |  24000 |
| ram     |  25000 |
| Ismail  |  24500 |

###### 5 rows in set (0.00 sec)
****

## Deleting a row in view

```
delete from highest_paid_employees where salary = 25000;
```

```
select * from highest_paid_employees;
```


| name    | salary |
|:--------|:-------|
| Suguram |  20000 |
| Riyas   |  23000 |
| Haiden  |  24000 |
| Ismail  |  24500 |

###### 4 rows in set (0.00 sec)
****

## Droping a view

```
drop view highest_paid_employees;
```

```
show tables;
```

| Tables_in_rough |
|:----------------|
| employee        |

###### 1 row in set (0.01 sec)
****