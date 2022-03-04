# INDEXES
### CLUSTERED INDEX

In MySQL, We don't have create clustered index.If we have primary key in the table , It will create clustered index.
****

### NON - CLUSTERED INDEX

```
create index non_Cix on products(product_name);
```
###### Query OK, 0 rows affected (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
****

### UNIQUE INDEX
```
create unique index un_ix on products(price);
```

###### Query OK, 0 rows affected (0.03 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
****

### Show index:
```
show index from products;
```


| Table    | Non_unique | Key_name | Seq_in_index | Column_name  | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:---------|:-----------|:---------|:-------------|:-------------|:----------|:------------|:---------|:-------|:-----|:-----------|:-------|:--------------|:--------|:-----------|
| products |          0 | PRIMARY  |            1 | product_id   | A         |           0 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| products |          1 | non_Cix  |            1 | product_name | A         |           0 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| products |          1 | non_Cix  |            1 | product_name | A         |           0 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |

###### 2 rows in set (0.02 sec)