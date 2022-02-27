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