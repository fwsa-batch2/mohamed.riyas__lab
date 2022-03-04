# School management task 
### Creating a students table :
```
create table student(stud_id int(5) PRIMARY KEY auto_increment, name varchar(255) not null, email varchar(100) not null, mobile_no bigint(10) not null, password varchar(100) not null,gender varchar(10) not null, dob date,created_date timestamp not null default current_timestamp,unique (email),check ( gender in ('M','F')));
```

###### Query OK, 0 rows affected, 2 warnings (0.05 sec)

```
desc students;
```


| Field        | Type         | Null | Key | Default           | Extra             |
|:-------------|:-------------|:-----|:----|:------------------|:------------------|
| stud_id      | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(255) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | varchar(10)  | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

###### 8 rows in set (0.01 sec)
****

### creating student's class information :

```
create table student_class(id int primary key auto_increment,class int not null,status varchar(20) not null,stud_id int(5) not null,foreign key (stud_id) references student(stud_id),check(class>= 1 and class <=12),check (status in ('ACTIVE','INACTIVE')));
```

###### Query OK, 0 rows affected, 1 warning (0.08 sec)

```
desc student_class;
```

| Field   | Type        | Null | Key | Default | Extra          |
|:--------|:------------|:-----|:----|:--------|:---------------|
| id      | int         | NO   | PRI | NULL    | auto_increment |
| class   | int         | NO   |     | NULL    |                |
| status  | varchar(20) | NO   |     | NULL    |                |
| stud_id | int         | NO   | MUL | NULL    |                |

###### 4 rows in set (0.01 sec)
****

### Feature 1: Student Registration

```
insert into student (name,email,mobile_no,password,gender,dob) values ("Ramya","ramya@gmail.com",880929053,"ramya@2022","F",'2007-07-12');
```

```
select * from student;
```

| stud_id | name  | email           | mobile_no | password   | gender | dob        | created_date        |
|:--------|:------|:----------------|:----------|:-----------|:-------|:-----------|:--------------------|
|       1 | Ramya | ramya@gmail.com | 880929053 | ramya@2022 | F      | 2007-07-12 | 2022-03-02 14:55:06 |

###### 1 row in set (0.00 sec)
****

### Feature 2 : List All Students

```
select * from student;
```

| stud_id | name   | email            | mobile_no  | password    | gender | dob        | created_date        |
|:--------|:-------|:-----------------|:-----------|:------------|:-------|:-----------|:--------------------|
|       1 | Ramya  | ramya@gmail.com  |  880929053 | ramya@2022  | F      | 2007-07-12 | 2022-03-02 14:55:06 |
|       7 | Aswath | aswath@gmail.com | 8468392751 | aswath@2022 | M      | 2007-05-06 | 2022-03-02 15:17:33 |
|       8 | Rahul  | rahul@gmail.com  | 9645327698 | rahul@2022  | M      | 2006-12-29 | 2022-03-02 15:19:33 |

###### 3 rows in set (0.00 sec)
****

### Feature 3: Login with email and password

```
select * from student where email = 'rahul@gmail.com' and password = "rahul@2022";
```


| stud_id | name  | email           | mobile_no  | password   | gender | dob        | created_date        |
|:--------|:------|:----------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|       8 | Rahul | rahul@gmail.com | 9645327698 | rahul@2022 | M      | 2003-02-21 | 2022-03-02 15:19:33 |

###### row in set (0.01 sec)

****

### Feature 4: Update Password

```
select * from student;
```

| stud_id | name   | email            | mobile_no  | password    | gender | dob        | created_date        |
|:--------|:-------|:-----------------|:-----------|:------------|:-------|:-----------|:--------------------|
|       1 | Ramya  | ramya@gmail.com  |  880929053 | ramya@2022  | F      | 2007-07-12 | 2022-03-02 14:55:06 |
|       7 | Aswath | aswath@gmail.com | 8468392751 | NULL        | M      | 2007-05-06 | 2022-03-02 15:17:33 |
|       8 | Rahul  | rahul@gmail.com  | 9645327698 | rahul@2022  | M      | 2006-12-29 | 2022-03-02 15:19:33 |

##### 3 rows in set (0.00 sec)

```
update student SET password = 'aswath@2022' where stud_id = 7;
```

###### Query OK, 1 row affected (0.01 sec)
****

### Feature 5: Enroll Student into Class.

```
insert into student_class(class,status,stud_id) values(12,"ACTIVE",1);
```
### Query OK, 1 row affected (0.01 sec)

```
select * from student_class;
```

| id | class | status | stud_id |
|:---|:------|:-------|:--------|
|  1 |    12 | ACTIVE |       1 |

### 1 row in set (0.00 sec)
****

### Feature 6: Find Students who are studying in 12th standard

```
 select student_class.class,student_class.status,student.name from student_class LEFT JOIN student on student_class.id = student.stud_id where class = 12;
```

| class | status | name   |
|:------|:-------|:-------|
|    12 | ACTIVE | Ramya  |
|    12 | ACTIVE | Aswath |

###### 2 rows in set (0.00 sec)
****

### Feature 7: Update Student Class information

```
select * from student_class;
```


| id | class | status   | stud_id |
|:---|:------|:---------|:--------|
|  1 |    12 | ACTIVE   |       1 |
|  7 |    12 | INACTIVE |       2 |


###### 2 rows in set (0.00 sec)

```
insert into student_class (id,class,status,stud_id) values(5,10,"ACTIVE",5);
```

| id | class | status | stud_id |
|:---|-------|:-------|:--------|
|  1 |    12 | ACTIVE |       1 |
|  2 |    12 | ACTIVE |       2 |
|  5 |    10 | ACTIVE |       5 |

###### 2 rows in set (0.01 sec)
****

### Feature 8: Student withdrawn from a Class

```
select * from student_class;
```
| id | class | status | stud_id |
|:---|:------|:-------|:--------|
|  1 |    12 | ACTIVE |       1 |
|  2 |    12 | ACTIVE |       2 |

###### 2 rows in set (0.00 sec)

```
delete from student_class where id = 2;
```

###### Query OK, 1 row affected (0.01 sec)

```
select * from student_class;
```

| id | class | status | stud_id |
|:---|:------|:-------|:--------|
|  1 |    12 | ACTIVE |       1 |

###### 1 row in set (0.01 sec)
****

### Feature 9: Find student details who have not updated their Date Of Birth.

```
select * from student;
```

| stud_id | name      | email               | mobile_no  | password       | gender | dob        | created_date        |
|:--------|:----------|:--------------------|:-----------|:---------------|:-------|:-----------|:--------------------|
|       1 | Ramya     | ramya@gmail.com     |  880929053 | ramya@2022     | F      | 2004-11-15 | 2022-03-02 14:55:06 |
|       2 | Aswath    | aswath@gmail.com    | 8468392751 | aswath@2022    | M      | 2003-09-07 | 2022-03-02 15:17:33 |
|       3 | jerusheya | jerusheya@gmail.com | 8645219865 | jerusheya@2022 | F      | NULL       | 2022-03-03 11:52:49 |
|       8 | Rahul     | rahul@gmail.com     | 9645327698 | rahul@2022     | M      | 2003-02-21 | 2022-03-02 15:19:33 |

###### 4 rows in set (0.01 sec)

```
 select name from student where dob is NULL;
```

| name      |
|:----------|
| jerusheya |

###### 1 row in set (0.00 sec)
****

### Feature 10: Find Total no of students actively studying in this school.

```
select * from student_class;
```

| id | class | status   | stud_id |
|:---|:------|:---------|:--------|
|  1 |    12 | ACTIVE   |       1 |
|  2 |    12 | INACTIVE |       2 |
|  3 |    12 | ACTIVE   |       3 |
|  4 |    12 | INACTIVE |       8 |

###### 4 rows in set (0.00 sec)

```
select count(*) from student_class where status = "ACTIVE";
```

| count(*) |
|:---------|
|        2 |
****

### Feature 11: Find Total no of students actively studying in each class.

```
select * from student_class;
```

| id | class | status   | stud_id |
|:---|:------|:---------|:--------|
|  1 |    12 | ACTIVE   |       1 |
|  2 |    12 | INACTIVE |       2 |
|  3 |    12 | ACTIVE   |       3 |
|  4 |    10 | INACTIVE |       4 |
|  5 |    10 | ACTIVE   |       5 |
|  8 |    12 | INACTIVE |       8 |

###### 6 rows in set (0.00 sec)

```
select COUNT(class),class from student_class where status = "ACTIVE" GROUP BY class;
```

| COUNT(class) | class |
|:-------------|:------|
|            2 |    12 |
|            1 |    10 |

###### 2 rows in set (0.00 sec)
**** 

### Feature 12: Find Total no of students actively studying each class which has less than 5 students.

```
select * from student_class;
```

| id | class | status   | stud_id |
|:---|:------|:---------|:--------|
|  1 |    12 | ACTIVE   |       1 |
|  2 |    12 | INACTIVE |       2 |
|  3 |    12 | ACTIVE   |       3 |
|  4 |    10 | INACTIVE |       4 |
|  5 |    10 | ACTIVE   |       5 |
|  8 |    12 | INACTIVE |       8 |

###### 6 rows in set (0.00 sec)

```
select COUNT(class),class from student_class GROUP BY class HAVING COUNT(class) < 5;
```

| COUNT(class) | class |
|:-------------|:------|
|            4 |    12 |
|            2 |    10 |

###### 2 rows in set (0.00 sec)
****

### Feature 13: Display student and class details

```
select student.stud_id,student.name,student.email,student.mobile_no,student.password,student.gender,student.dob,student.created_date,student_class.class,student_class.status from student inner join student_class on student.stud_id = student_class.id;
```

| stud_id | name      | email               | mobile_no  | password       | gender | dob        | created_date        | class | status   |
|:--------|:----------|:--------------------|:-----------|:---------------|:-------|:-----------|:--------------------|:------|:---------|
|       1 | Ramya     | ramya@gmail.com     |  880929053 | ramya@2022     | F      | 2004-11-15 | 2022-03-02 14:55:06 |    12 | ACTIVE   |
|       2 | Aswath    | aswath@gmail.com    | 8468392751 | aswath@2022    | M      | 2003-09-07 | 2022-03-02 15:17:33 |    12 | INACTIVE |
|       3 | jerusheya | jerusheya@gmail.com | 8645219865 | jerusheya@2022 | F      | 2003-07-16 | 2022-03-03 11:52:49 |    12 | ACTIVE   |
|       4 | SWETHA    | swetha@gmail.com    | 9987321085 | swetha@2022    | F      | 2005-11-18 | 2022-03-03 12:22:38 |    10 | INACTIVE |
|       5 | Haiden    | Haiden@gmail.com    | 9887439620 | haiden@2022    | M      | 2005-08-11 | 2022-03-03 12:24:47 |    10 | ACTIVE   |
|       8 | Rahul     | rahul@gmail.com     | 9645327698 | rahul@2022     | M      | 2003-02-21 | 2022-03-02 15:19:33 |    12 | INACTIVE |

###### 6 rows in set (0.00 sec)
****

### Feature 14: Display Student Details for the given input class.
## class = 12th standard.

```
select student.stud_id,student.name,student.email,student.mobile_no,student.password,student.gender,student.dob,student.created_date,student_class.class,student_class.status from student inner join student_class on student.stud_id = student_class.id where class = 12;
```


| stud_id | name      | email               | mobile_no  | password       | gender | dob        | created_date        | class | status   |
|:--------|:----------|:--------------------|:-----------|:---------------|:-------|:-----------|:--------------------|:------|:---------|
|       1 | Ramya     | ramya@gmail.com     |  880929053 | ramya@2022     | F      | 2004-11-15 | 2022-03-02 14:55:06 |    12 | ACTIVE   |
|       2 | Aswath    | aswath@gmail.com    | 8468392751 | aswath@2022    | M      | 2003-09-07 | 2022-03-02 15:17:33 |    12 | INACTIVE |
|       3 | jerusheya | jerusheya@gmail.com | 8645219865 | jerusheya@2022 | F      | 2003-07-16 | 2022-03-03 11:52:49 |    12 | ACTIVE   |
|       8 | Rahul     | rahul@gmail.com     | 9645327698 | rahul@2022     | M      | 2003-02-21 | 2022-03-02 15:19:33 |    12 | INACTIVE |

###### 4 rows in set (0.00 sec)
****

### Feature 15: Find Class for the given student email id.
## Email: aswath@gmail.com

```
select student.stud_id,student.name,student.email,student_class.class from student inner join student_class on student.stud_id = student_class.id where email = 'aswath@gmail.com';
```

| stud_id | name   | email            | class |
|:--------|:-------|:-----------------|:------|
|       2 | Aswath | aswath@gmail.com |    12 |
### 1 row in set (0.00 sec)
****

### Feature 16: Find Students who has not enrolled in a class.

```
select student.stud_id,student.name,student_class.class,student_class.status from student left join student_class on student.stud_id = student_class.id;
```

| stud_id | name      | class | status   |
|:--------|:----------|:------|:---------|
|       1 | Ramya     |    12 | ACTIVE   |
|       2 | Aswath    |    12 | INACTIVE |
|       3 | jerusheya |    12 | ACTIVE   |
|       4 | SWETHA    |    10 | INACTIVE |
|       5 | Haiden    |    10 | ACTIVE   |
|       8 | Rahul     |  NULL | NULL     |

###### 6 rows in set (0.00 sec)

```
select student.stud_id,student.name,student_class.class,student_class.status from student left join student_class on student.stud_id = student_class.id where class is NULL;
```

| stud_id | name  | class | status |
|:--------|:------|:------|:-------|
|       8 | Rahul |  NULL | NULL   |
###### 1 row in set (0.00 sec)
****

### Feature 17: Display all students name with class - include both enrolled and not enrolled #
#### Using Joins ( Left outer join)
```
select student.stud_id,student.name,student_class.class,student_class.status from student left join student_class on student.stud_id = student_class.id;
```

| stud_id | name      | class | status   |
|:--------|:----------|:------|:---------|
|       1 | Ramya     |    12 | ACTIVE   |
|       2 | Aswath    |    12 | INACTIVE |
|       3 | jerusheya |    12 | ACTIVE   |
|       4 | SWETHA    |    10 | INACTIVE |
|       5 | Haiden    |  NULL | NULL     |
|       8 | Rahul     |  NULL | NULL     |

###### 6 rows in set (0.00 sec)