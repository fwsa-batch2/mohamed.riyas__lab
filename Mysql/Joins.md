# JOINS

### INNER JOIN 
#### The INNER JOIN keyword selects records that have matching values in both tables.

```
SELECT orders.order_id,products.product_name from orders INNER JOIN products ON products.product_id = orders.order_id;
```
| order_id | product_name           |
|:---------|:-----------------------|
|        1 | Rapid Orange Bar Chair |
|        2 | Swivel Bar Chair       |

###### 2cd  rows in set (0.00 sec)
****

### LEFT JOIN
#### The LEFT JOIN keyword returns all records from the left table (table1), and the matching records from the right table (table2).

```
SELECT users.id,users.name,products.product_name from users LEFT JOIN products on users.id = products.product_id;
```
| id | name   | product_name        |
|:---|:-------|:--------------------|
|  1 | aswath | Orange bar Chair    |
|  2 | haiden | Sivel bar Chair     |
|  3 | riyas  | spiderweb bar Chair |
|  4 | rishi  | NULL                |

###### 4 rows in set (0.00 sec)

### RIGHT JOIN
#### The RIGHT JOIN keyword returns all records from the right table (table2), and the matching records from the left table (table1).

```
SELECT users.id,users.name,products.product_name from users RIGHT JOIN products on users.id = products.product_id;
```
| id   | name   | product_name        |
|:-----|:-------|:--------------------|
|    1 | aswath | Orange bar Chair    |
|    2 | haiden | Sivel bar Chair     |
|    3 | riyas  | spiderweb bar Chair |

###### 3 rows in set (0.00 sec)

### CROSS JOIN 
#### The CROSS JOIN keyword returns all records from both tables (table1 and table2)

```
select * from users CROSS JOIN products;
```

| id | name   | email            | product_id | product_name        | product_type | price |
|:---|:-------|:-----------------|:----------|:---------------------|:-------------|:------|
|  1 | aswath | aswath@gmail.com |          3 | spiderweb bar Chair | chair        |  4000 |
|  1 | aswath | aswath@gmail.com |          2 | Sivel bar Chair     | chair        |  2000 |
|  1 | aswath | aswath@gmail.com |          1 | Orange bar Chair    | chair        | 10000 |
|  2 | haiden | haiden@gmail.com |          3 | spiderweb bar Chair | chair        |  4000 |
|  2 | haiden | haiden@gmail.com |          2 | Sivel bar Chair     | chair        |  2000 |
|  2 | haiden | haiden@gmail.com |          1 | Orange bar Chair    | chair        | 10000 |
|  3 | riyas  | riyas@gmail.com  |          3 | spiderweb bar Chair | chair        |  4000 |
|  3 | riyas  | riyas@gmail.com  |          2 | Sivel bar Chair     | chair        |  2000 |
|  3 | riyas  | riyas@gmail.com  |          1 | Orange bar Chair    | chair        | 10000 |
|  4 | rishi  | rishi@gmail.com  |          3 | spiderweb bar Chair | chair        |  4000 |
|  4 | rishi  | rishi@gmail.com  |          2 | Sivel bar Chair     | chair        |  2000 |
|  4 | rishi  | rishi@gmail.com  |          1 | Orange bar Chair    | chair        | 10000 |

###### 12 rows in set (0.00 sec)