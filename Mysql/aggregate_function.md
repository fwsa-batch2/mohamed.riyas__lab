# AGGREGATE FUNCTIONS
### COUNT
#### The COUNT() function returns the number of rows that matches a specified condition.

```
select count(*) from products;
```
| count(*) |
|:---------|
|        3 |

###### 1 row in set (0.01 sec)
****

### AVG
#### The AVG() function returns the average value of a numeric column.

```
select AVG(price) from products where price > 2000;
```

| AVG(price) |
|:-----------|
|  7000.0000 |

###### 1 row in set (0.01 sec)
****

### SUM
#### The SUM() function returns the total sum of a numeric column.

```
select SUM(price) from products;
```
| SUM(price) |
|:-----------|
|      16000 |

###### 1 row in set (0.00 sec)
****

### MIN
#### The MIN() function returns the smallest value of the selected column.

```
select MIN(price) from products;
```

| MIN(price) |
|:-----------|
|       2000 |

###### 1 row in set (0.01 sec)
****

### MAX
#### The MAX() function returns the largest value of the selected column.

```
select MAX(price) from products;
```
| MAX(price) |
|:-----------|
|      10000 |

###### 1 row in set (0.00 sec)