
mysql> show databases;
| Database            |
| constraints         |
| games               |
| information_schema  |
| mysql               |
| mysql_test          |
| performance_schema  |
| pubg_tournament_app |
| school              |
| student_information |
| sys                 |
| test                |
11 rows in set (0.00 sec)

mysql> use student_information;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_student_information |
|:------------------------------|
| student_class                 |
| students                      |

2 rows in set (0.01 sec)

mysql> desc students;

| Field        | Type         | Null | Key | Default           | Extra             |
|:-------------|:-------------|:-----|:----|:------------------|:------------------|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.00 sec)

mysql> desc student_class;

| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.01 sec)

### 1. STUDENT REGISTRATION

mysql> select * from students;

| id | name      | email                    | mobile_no  | password    | gender | dob        | created_date        |
|:---|-----------|:-------------------------|:-----------|:------------|:-------|:-----------|:--------------------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi123    | m      | 2002-08-13 | 2021-11-23 00:00:00 |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123  | m      | 2003-04-06 | 2021-11-23 00:00:00 |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123    | m      | 2002-05-16 | 2021-12-03 00:00:00 |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123   | m      | 2001-03-19 | 2021-09-11 00:00:00 |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mithun123   | m      | 2004-02-22 | 2021-06-07 00:00:00 |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123   | m      | 2004-07-13 | 2021-12-02 00:00:00 |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123    | m      | 2005-04-22 | 2022-01-13 00:00:00 |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123   | f      | 2001-05-11 | 2021-08-11 00:00:00 |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123      | f      | 2000-02-14 | 2020-12-03 00:00:00 |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123    | f      | 1999-05-17 | 2020-05-15 00:00:00 |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123    | f      | 1994-05-04 | 2020-01-11 00:00:00 |
| 12 | srisanth  | srisanthsri@gmail.com    | 7484928974 | srisanth123 | m      | 2004-05-26 | 2022-01-18 00:00:00 |

12 rows in set (0.00 sec)

### 2. LIST ALL STUDENTS

mysql> select (name) from students;

| name      |
|:|---------|
| Rishi     |
| Parthiv   |
| Viswa     |
| Naveen    |
| Mithun    |
| Pranav    |
| Jeeva     |
| Kamali    |
| Abi       |
| Soundarya |
| latha     |
| srisanth  |

12 rows in set (0.00 sec)'

### 3. LOGIN WITH EMAIL AND PASSWORD

mysql> select * from students;

| id | name      | email                    | mobile_no  | password   | gender | dob        | created_date        |
|----|:----------|:-------------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi12345 | m      | NULL       | 2021-11-23 00:00:00 |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123 | m      | 2003-04-06 | 2021-11-23 00:00:00 |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123   | m      | NULL       | 2021-12-03 00:00:00 |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123  | m      | NULL       | 2021-09-11 00:00:00 |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mits1234   | m      | NULL       | 2021-06-07 00:00:00 |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123  | m      | NULL       | 2021-12-02 00:00:00 |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123   | m      | 2005-04-22 | 2022-01-13 00:00:00 |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123  | f      | NULL       | 2021-08-11 00:00:00 |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123     | f      | NULL       | 2020-12-03 00:00:00 |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123   | f      | NULL       | 2020-05-15 00:00:00 |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123   | f      | 1994-05-04 | 2020-01-11 00:00:00 |

11 rows in set (0.00 sec)

mysql> select name from students where email = 'rishijeeva13@gmail.com' and password = 'rishi12345';

| name  |
|:------|
| Rishi |

1 row in set (0.00 sec)

mysql> select name from students where email = 'parthivactor@gmail.com' and password = 'parthiv123';

| name    |
|:--------|
| Parthiv |

1 row in set (0.00 sec)

### 4. UPDATE PASSWORD

mysql> update students set password = 'rishi12345' where id = 1;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0


mysql> update students set password = 'mits1234' where id = 5;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

### 5. ENROLL STUDENTS INTO CLASS

mysql> select st.name , sc.class from students st inner join student_class sc on st.id = sc.student_id;

| name      | class |
|:----------|:------|
| Rishi     |    12 |
| Parthiv   |    11 |
| Viswa     |    10 |
| Naveen    |    10 |
| Mithun    |    10 |
| Pranav    |     9 |
| Jeeva     |    12 |
| Kamali    |    10 |
| Abi       |     8 |
| Soundarya |    12 |
| latha     |     9 |
| srisanth  |    11 |

12 rows in set (0.01 sec)

### 6.  FIND STUDENTS WHO ARE STUDYING IN 5TH STANDARD.

mysql> select st.name , sc.class from students st inner join student_class sc on st.id = sc.student_id where sc.class = 5;

| name   | class |
|:-------|:------|
| Viswa  |     5 |
| Naveen |     5 |
| Mithun |     5 |
| Kamali |     5 |

4 rows in set (0.00 sec)

mysql> 

### 7. UPDATE STUDENT CLASS INFORMATION 5 TO 6

mysql> select * from student_class;

| id | student_id | class | status   |
|:---|------------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |    10 | ACTIVE   |
|  4 |          4 |    10 | INACTIVE |
|  5 |          5 |    10 | INACTIVE |
|  6 |          6 |     9 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
|  8 |          8 |    10 | INACTIVE |
|  9 |          9 |     8 | ACTIVE   |
| 10 |         10 |    12 | ACTIVE   |
| 11 |         11 |     9 | ACTIVE   |
| 12 |         12 |    11 | ACTIVE   |

12 rows in set (0.00 sec)

mysql> update student_class set class = 6 where class = 5;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

mysql> update student_class set class = 6 where class = 10;
Query OK, 4 rows affected (0.01 sec)
Rows matched: 4  Changed: 4  Warnings: 0

mysql> select * from student_class;

| id | student_id | class | status   |
|:---|:-----------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |     6 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
|  5 |          5 |     6 | INACTIVE |
|  6 |          6 |     9 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
|  8 |          8 |     6 | INACTIVE |
|  9 |          9 |     8 | ACTIVE   |
| 10 |         10 |    12 | ACTIVE   |
| 11 |         11 |     9 | ACTIVE   |
| 12 |         12 |    11 | ACTIVE   |

12 rows in set (0.00 sec)

### 8. STUDENT WITHDRAWN FROM A CLASS

mysql> delete from students where id = 12;
Query OK, 1 row affected (0.01 sec)

mysql> select * from students;

| id | name      | email                    | mobile_no  | password   | gender | dob        | created_date        |
|:---|:----------|:-------------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi12345 | m      | 2002-08-13 | 2021-11-23 00:00:00 |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123 | m      | 2003-04-06 | 2021-11-23 00:00:00 |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123   | m      | 2002-05-16 | 2021-12-03 00:00:00 |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123  | m      | 2001-03-19 | 2021-09-11 00:00:00 |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mits1234   | m      | 2004-02-22 | 2021-06-07 00:00:00 |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123  | m      | 2004-07-13 | 2021-12-02 00:00:00 |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123   | m      | 2005-04-22 | 2022-01-13 00:00:00 |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123  | f      | 2001-05-11 | 2021-08-11 00:00:00 |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123     | f      | 2000-02-14 | 2020-12-03 00:00:00 |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123   | f      | 1999-05-17 | 2020-05-15 00:00:00 |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123   | f      | 1994-05-04 | 2020-01-11 00:00:00 |

11 rows in set (0.00 sec)

### 9. STUDENT DETAILS WHO HAVE NOT UPDATED THEIR DATE OF BIRTH


mysql> select * from students;

| id | name      | email                    | mobile_no  | password   | gender | dob        | created_date        |
|:---|:----------|:-------------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi12345 | m      | 2002-08-13 | 2021-11-23 00:00:00 |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123 | m      | 2003-04-06 | 2021-11-23 00:00:00 |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123   | m      | NULL       | 2021-12-03 00:00:00 |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123  | m      | NULL       | 2021-09-11 00:00:00 |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mits1234   | m      | NULL       | 2021-06-07 00:00:00 |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123  | m      | NULL       | 2021-12-02 00:00:00 |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123   | m      | 2005-04-22 | 2022-01-13 00:00:00 |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123  | f      | 2001-05-11 | 2021-08-11 00:00:00 |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123     | f      | 2000-02-14 | 2020-12-03 00:00:00 |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123   | f      | 1999-05-17 | 2020-05-15 00:00:00 |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123   | f      | 1994-05-04 | 2020-01-11 00:00:00 |

11 rows in set (0.00 sec)


mysql> select name from students where dob is NULL;

| name   |
|:-------|
| Viswa  |
| Naveen |
| Mithun |
| Pranav |

4 rows in set (0.00 sec)

### 10. TOTAL NO OF STUDENTS ACTIVELY STUDYING IN THE SCHOOL

mysql> select st.id,st.name,sc.status from students st left join student_class  sc on st.id = sc.student_id where status = 'ACTIVE';

| id | name      | status |
|:---|:----------|:-------|
|  1 | Rishi     | ACTIVE |
|  2 | Parthiv   | ACTIVE |
|  3 | Viswa     | ACTIVE |
|  7 | Jeeva     | ACTIVE |
|  9 | Abi       | ACTIVE |
| 10 | Soundarya | ACTIVE |
| 11 | latha     | ACTIVE |

7 rows in set (0.00 sec)

### 11.  FIND TOTAL NO OF STUDENTS ACTIVELY STUDYING IN EACH CLASS

mysql> select count(*),class from student_class where status="ACTIVE" group by class;

| count(*) | class |
|:---------|:------|
|        3 |    12 |
|        1 |    11 |
|        1 |     5 |
|        1 |     8 |
|        1 |     9 |

5 rows in set (0.00 sec)

### 12.  FIND TOTAL NO OF STUDENTS ACTIVELY STUDYING EACH CLASS WHICH HAS LESS THAN 5 STUDENTS.


mysql> select count(*),class from student_class where status="ACTIVE" group by class having count(*) < 5  ;

| count(*) | class |
|:---------|:------|
|        3 |    12 |
|        1 |    11 |
|        1 |     5 |
|        1 |     8 |
|        1 |     9 |

5 rows in set (0.00 sec)

mysql> select count(*),class from student_class where status="ACTIVE" group by class having count(*) < 2;

| count(*) | class |
|:---------|:------|
|        1 |    11 |
|        1 |     5 |
|        1 |     8 |
|        1 |     9 |

4 rows in set (0.00 sec)


### 13. DISPLAY STUDENT AND CLASS DETAILS


mysql> select * from students st inner join student_class sc on st.id = sc.student_id;

| id | name      | email                    | mobile_no  | password   | gender | dob        | created_date        | id | student_id | class | status   |
|:---|:----------|:-------------------------|:-----------|:-----------|:-------|:-----------|:--------------------|:---|:-----------|:------|:---------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi12345 | m      | 2002-08-13 | 2021-11-23 00:00:00 |  1 |          1 |    12 | ACTIVE   |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123 | m      | 2003-04-06 | 2021-11-23 00:00:00 |  2 |          2 |    11 | ACTIVE   |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123   | m      | NULL       | 2021-12-03 00:00:00 |  3 |          3 |     5 | ACTIVE   |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123  | m      | NULL       | 2021-09-11 00:00:00 |  4 |          4 |     5 | INACTIVE |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mits1234   | m      | NULL       | 2021-06-07 00:00:00 |  5 |          5 |     5 | INACTIVE |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123  | m      | NULL       | 2021-12-02 00:00:00 |  6 |          6 |     9 | INACTIVE |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123   | m      | 2005-04-22 | 2022-01-13 00:00:00 |  7 |          7 |    12 | ACTIVE   |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123  | f      | 2001-05-11 | 2021-08-11 00:00:00 |  8 |          8 |     5 | INACTIVE |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123     | f      | 2000-02-14 | 2020-12-03 00:00:00 |  9 |          9 |     8 | ACTIVE   |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123   | f      | 1999-05-17 | 2020-05-15 00:00:00 | 10 |         10 |    12 | ACTIVE   |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123   | f      | 1994-05-04 | 2020-01-11 00:00:00 | 11 |         11 |     9 | ACTIVE   |
-
11 rows in set (0.00 sec)


### 14. DISPLAY STUDENT DETAILS FOR THE GIVEN INPUT CLASS (5)

mysql> select st.name , st.email , st.mobile_no , st.password , st.gender , st.dob , st.created_date , sc.class from students st inner join student_class sc on st.id = sc.id where sc.class = 5;

| name   | email                    | mobile_no  | password  | gender | dob        | created_date        | class |
|:-------|:-------------------------|:-----------|:----------|:-------|:-----------|:--------------------|:------|
| Viswa  | viswaviswa@gmail.com     | 9994092126 | viswa123  | m      | NULL       | 2021-12-03 00:00:00 |     5 |
| Naveen | Naveenlawrence@gmail.com | 6547839280 | naveen123 | m      | NULL       | 2021-09-11 00:00:00 |     5 |
| Mithun | mithunmits@gmail.com     | 9841451326 | mits1234  | m      | NULL       | 2021-06-07 00:00:00 |     5 |
| Kamali | kamali2001@gmail.com     | 8754251565 | kamali123 | f      | 2001-05-11 | 2021-08-11 00:00:00 |     5 |

4 rows in set (0.00 sec)

### 15. FIND CLASS FOR THE GIVEN STUDENT EMAIL ID EMAIL: n@gmail.com


mysql> select * from students;

| id | name      | email                    | mobile_no  | password   | gender | dob        | created_date        |
|:---|:----------|:-------------------------|:-----------|:-----------|:-------|:-----------|:--------------------|
|  1 | Rishi     | rishijeeva13@gmail.com   | 6381950080 | rishi12345 | m      | NULL       | 2021-11-23 00:00:00 |
|  2 | Parthiv   | parthivactor@gmail.com   | 9843510199 | parthiv123 | m      | 2003-04-06 | 2021-11-23 00:00:00 |
|  3 | Viswa     | viswaviswa@gmail.com     | 9994092126 | viswa123   | m      | NULL       | 2021-12-03 00:00:00 |
|  4 | Naveen    | Naveenlawrence@gmail.com | 6547839280 | naveen123  | m      | NULL       | 2021-09-11 00:00:00 |
|  5 | Mithun    | mithunmits@gmail.com     | 9841451326 | mits1234   | m      | NULL       | 2021-06-07 00:00:00 |
|  6 | Pranav    | pranavss@gmail.com       | 8838563539 | pranav123  | m      | NULL       | 2021-12-02 00:00:00 |
|  7 | Jeeva     | kuttyjeeva@gmail.com     | 8012288838 | jeeva123   | m      | 2005-04-22 | 2022-01-13 00:00:00 |
|  8 | Kamali    | kamali2001@gmail.com     | 8754251565 | kamali123  | f      | NULL       | 2021-08-11 00:00:00 |
|  9 | Abi       | abiharishma@gmail.com    | 7687898718 | abi123     | f      | NULL       | 2020-12-03 00:00:00 |
| 10 | Soundarya | Soundarysowmi@gmail.com  | 6472838392 | sowmi123   | f      | NULL       | 2020-05-15 00:00:00 |
| 11 | latha     | lathaatgondan@gmail.com  | 9445783301 | latha123   | f      | 1994-05-04 | 2020-01-11 00:00:00 |
| 12 | haiden    | haiden11@gmailcom        | 6381950080 | haiden@123 | m      | 2002-08-13 | 2020-08-12 00:00:00 |



mysql> select st.name,st.email,sc.class from students st right join student_class sc on st.id = sc.student_id where email like('%n@gmail.com');

| name  | email                   | class |
|:------|:------------------------|:------|
| latha | lathaatgondan@gmail.com |     9 |

1 row in set (0.00 sec)

mysql> 


### 16. FIND STUDENTS WHO HAS NOT ENROLLED IN A CLASS

mysql> select * from student_class;

| id | student_id | class | status   |
|----|:-----------|:------|:---------|
|  1 |          1 |    12 | ACTIVE   |
|  2 |          2 |    11 | ACTIVE   |
|  3 |          3 |     5 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
|  5 |          5 |     5 | INACTIVE |
|  6 |          6 |     9 | INACTIVE |
|  7 |          7 |    12 | ACTIVE   |
|  8 |          8 |     5 | INACTIVE |
|  9 |          9 |     8 | ACTIVE   |
| 10 |         10 |    12 | ACTIVE   |
| 11 |         11 |     9 | ACTIVE   |

11 rows in set (0.00 sec)

mysql> select st.name from students st inner join student_class sc on st.id=sc.student_id where class=ALL(select class from student_class where class is not null);
Empty set (0.01 sec)


### 17. DISPLAY ALL STUDENTS NAME WITH CLASS - INCLUDE BOTH ENROLLED AND NOT ENROLLED

mysql> select st.name,sc.class from students st left join student_class sc on st.id = sc.student_id where class=ALL (select class from student_class where class is null and not null);

| name      | class |
|:----------|:------|
| Rishi     |    12 |
| Parthiv   |    11 |
| Viswa     |     5 |
| Naveen    |     6 |
| Mithun    |     5 |
| Pranav    |     9 |
| Jeeva     |    12 |
| Kamali    |     5 |
| Abi       |     8 |
| Soundarya |    12 |
| latha     |     9 |
| haiden    |  NULL |

12 rows in set (0.00 sec)


