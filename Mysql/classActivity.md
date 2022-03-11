### 8.3.2022 Class activity

### Creating a table called user

```
CREATE TABLE user(id int PRIMARY KEY auto_increment, Name varchar(100) NOT NULL);
```

### Creating a table called batch

```
CREATE TABLE batch(id int PRIMARY KEY auto_increment, Name varchar(100) NOT NULL);
```

### Creating a table called course

```
CREATE TABLE courses(id int PRIMARY KEY auto_increment, Name varchar(100) NOT NULL);
```

### Insert data into the tables

#### Table 1

```
insert into user(name) values("Annamalai"),("Riyas");
```

```
select  * from user;
```


| id | Name      |
|:---|:----------|
|  1 | Annamalai |
|  2 | Riyas     |

###### 2 rows in set (0.00 sec)

#### Table 2 

```
insert into batch(name) values('Batch1'),('Batch1');
```

```
select  * from batch;
```

| id | Name   |
|:---|--------|
|  1 | Batch1 |

###### 2 rows in set (0.00 sec)

#### Table 3

```
insert into courses(name) values('HTML'),("HTML");
```

```
select  * from courses;
```

| id | Name |
|:----|:----|
|  1 | HTML |

###### 2 rows in set (0.00 sec)
****

### creating tables batchUsers and batchCourses

```
CREATE TABLE batch_user(Id int PRIMARY KEY AUTO_INCREMENT,Batch_id int,User_id int, FOREIGN KEY(Batch_id) REFERENCES batch(id),FOREIGN KEY(User_id) REFERENCES user(id));
```

```
desc batch_user;
```

| Field    | Type | Null | Key | Default | Extra          |
|:---------|:-----|:-----|:----|:--------|:---------------|
| Id       | int  | NO   | PRI | NULL    | auto_increment |
| Batch_id | int  | YES  | MUL | NULL    |                |
| User_id  | int  | YES  | MUL | NULL    |                |

###### 3 rows in set (0.02 sec)

```
CREATE TABLE batch_courses(Id int PRIMARY KEY AUTO_INCREMENT,Batch_id int,Course_id int, FOREIGN KEY(Batch_id) REFERENCES batch(id),FOREIGN KEY(Course_id) REFERENCES user(id));
```

```
desc batch_courses;
```


| Field     | Type | Null | Key | Default | Extra          |
|:----------|:-----|:-----|:----|:--------|:---------------|
| Id        | int  | NO   | PRI | NULL    | auto_increment |
| Batch_id  | int  | YES  | MUL | NULL    |                |
| Course_id | int  | YES  | MUL | NULL    |                |

###### 3 rows in set (0.00 sec)

### insert values into the tables;

```
insert into batch_user(batch_id,User_id) values(1,1),(1,2);
```

```
select  * from batch_user;
```


| Id | Batch_id | User_id |
|:---|:---------|:--------|
|  1 |        1 |       1 |
|  2 |        1 |       2 |

###### 2 rows in set (0.00 sec)


```
insert into batch_courses(batch_id,Course_id) values(1,1);
```

```
select  * from batch_courses;
```

| Id | Batch_id | Course_id |
|:---|:---------|:----------|
|  1 |        1 |         1 |

###### 1 row in set (0.00 sec)

### Question 1

```
select user.name,user.id,batch.name from user join batch;
```

| name      | id | name   |
|:----------|:---|:-------|
| Riyas     |  2 | Batch1 |
| Annamalai |  1 | Batch1 |

###### 2 rows in set (0.03 sec)

### Question 2 

```
select user.id, user.name,batch.id,batch.name,courses.id,courses.Name from user,batch,courses where courses.Name='HTML';
```

| id | name      | id | name   | id | Name |
|:---|:----------|:---|:-------|:---|:-----|
|  2 | Riyas     |  1 | Batch1 |  1 | HTML |
|  1 | Annamalai |  1 | Batch1 |  1 | HTML |

###### 2 rows in set (0.01 sec)
