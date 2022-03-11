## SUB QUERIES

```
select * from products;
```


| product_id | product_name                | product_type | price |
|:-----------|:----------------------------|:-------------|:------|
|          1 | mobel leatherette bar chair | Chair        |  2000 |
|          2 | Rapid orange bar chair      | Chair        |  2100 |
|          3 | Swivel bar chair            | Chair        |  2000 |

###### 3 rows in set (0.00 sec)

```
select * from orders;
```

| order_id | order_name | product_id |
|:---------|:-----------|:-----------|
|        1 | chithu     |          1 |
|        2 | ismail     |          2 |
|        3 | hasan      |          3 |

###### 3 rows in set (0.00 sec)

```
select * from products where price > 2000;
```


| product_id | product_name           | product_type | price |
+------------+------------------------+--------------+-------+
|          2 | Rapid orange bar chair | Chair        |  2100 |

###### 1 row in set (0.00 sec)

```
select avg(no_of_products) from orders;
```

| avg(no_of_products) |
|:--------------------|
|              2.0000 |

###### 1 row in set (0.00 sec)

```
select * from orders where no_of_products < (select avg(no_of_products) from orders);
```

| order_id | order_name | product_id | no_of_products |
|:---------|:-----------|:-----------|:---------------|
|        3 | hasan      |          3 |              1 |

###### 1 row in set (0.00 sec)
