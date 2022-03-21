```SYNTAX
CREATE DATABASE Pubg_Tournament_App;
```
###### Query OK, 1 row affected (0.01 sec)
###### 
```SYNTAX
SHOW DATABASES;
```

| Database            |
|:--------------------|
| Pubg_Tournament_App |
| constraints         |
| games               |
| information_schema  |
| institution         |
| mysql               |
| mysql_test          |
| performance_schema  |
| school              |
| shops               |
| student_information |
| sys                 |
| test                |

###### 13 rows in set (0.00 sec)

```SYNTAX
USE Pubg_Tournament_App;
```
Database changed

```SYNTAX
CREATE TABLE Registered_Users (S_no INT AUTO_INCREMENT PRIMARY KEY, Email_ID VARCHAR(50) , User_ID INT(8) , Password VARCHAR(20) );
```

###### Query OK, 0 rows affected, 1 warning (0.05 sec)

```SYNTAX
SHOW TABLES;
```

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Registered_Users              |

###### 1 rows in set (0.01 sec)

```SYNTAX
DESC Registered_Users;
```


| Field    | Type        | Null | Key | Default | Extra          |
|:---------|:------------|:-----|:----|:--------|:---------------|
| S_no     | int         | NO   | PRI | NULL    | auto_increment |
| Email_ID | varchar(50) | YES  |     | NULL    |                |
| User_ID  | int         | YES  |     | NULL    |                |
| Password | varchar(20) | YES  |     | NULL    |                |

###### 4 rows in set (0.01 sec)

```SYNTAX
INSERT INTO Registered_Users VALUES (1,'rishijeeva13@gmail.com',75849574,'Soul@pubg');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registered_Users VALUES (2,'tt134@gmail.com',78263876,'ttz@pubg');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registered_Users VALUES (3,'ddfrever@gmail.com',32487234,'dds1122@pubg');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registered_Users VALUES (5,'rgeesports@gmail.com',87346843,'rgekillerz@pubg');
```

###### Query OK, 1 row affected (0.02 sec)

```SYNTAX
UPDATE Registered_Users SET S_no = 4 WHERE S_no = 5;
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
INSERT INTO Registered_Users VALUES (5,'blindesports@gmail.com',98346598,'blindesp@pubg');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SELECT * FROM Registered_Users;
```
| S_no | Email_ID               | User_ID  | Password        |
|:-----|:-----------------------|:---------|:----------------|
|    1 | rishijeeva13@gmail.com | 75849574 | Soul@pubg       |
|    2 | tt134@gmail.com        | 78263876 | ttz@pubg        |
|    3 | ddfrever@gmail.com     | 32487234 | dds1122@pubg    |
|    4 | rgeesports@gmail.com   | 87346843 | rgekillerz@pubg |
|    5 | blindesports@gmail.com | 98346598 | blindesp@pubg   |

```SYNTAX
CREATE TABLE UC_Purchased (S_no INT , User_ID INT(8) , NO_OF_UC_Purchased INT ,FOREIGN KEY (S_no) REFERENCES Registered_Users(S_no));\\
```
SHOW TABLES;

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Registered_Users              |
| UC_Purchased                  |

###### 11 rows in set (0.01 sec)


```SYNTAX
DESC UC_Purchased;
```

| Field              | Type | Null | Key | Default | Extra |
|:-------------------|:-----|:-----|:----|:--------|:------|
| S_no               | int  | YES  | MUL | NULL    |       |
| User_ID            | int  | YES  |     | NULL    |       |
| NO_OF_UC_Purchased | int  | YES  |     | NULL    |       |

###### 3 rows in set (0.01 sec)

```SYNTAX
SELECT * FROM UC_Purchased;
```

| S_no | User_ID  | NO_OF_UC_Purchased |
|:-----|:---------|:-------------------|
|    1 | 73832675 |                 60 |
|    2 | 98248954 |                 60 |
|    3 | 86249823 |               1800 |
|    4 | 82364968 |               3500 |
|    5 | 98739847 |                300 |

###### 5 rows in set (0.00 sec)



```SYNTAX
CREATE TABLE Registration_Form
    -> (Email_ID VARCHAR(50),
    -> Clan_Name VARCHAR(50) PRIMARY KEY ,
    -> Team_Name VARCHAR(50),
    -> Player_1_IGN VARCHAR(40) , Player_1_Character_ID INT(8) ,
    -> Player_2_IGN VARCHAR(40) , Player_2_Character_ID INT(8) ,
    -> Player_3_IGN VARCHAR(40) , Player_3_Character_ID INT(8) ,
    -> Player_4_IGN VARCHAR(40) , Player_4_Character_ID INT(8),
    -> Player_5_IGN VARCHAR(40) , Player_5_Character_ID INT(8) );
```

###### Query OK, 0 rows affected, 5 warnings (0.04 sec)
###### 
```SYNTAX
SHOW TABLES;
```

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Registration_Form             |
| UC_Purchased                  |
| Registered_Users              |



```SYNTAX
DESC Registration_Form;
```


| Field                 | Type        | Null | Key | Default | Extra |
|:----------------------|:------------|:-----|:----|:--------|:------|
| Email_ID              | varchar(50) | YES  | UNI | NULL    |       |
| Clan_Name             | varchar(50) | NO   | PRI | NULL    |       |
| Team_Name             | varchar(50) | YES  | UNI | NULL    |       |
| Player_1_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_1_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_2_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_2_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_3_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_3_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_4_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_4_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_5_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_5_Character_ID | int         | YES  | UNI | NULL    |       |

###### 13 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE Registration_Form MODIFY Email_ID VARCHAR(50) UNIQUE;
```
###### Query OK, 0 rows affected (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Team_Name VARCHAR(50) UNIQUE;
```
###### Query OK, 0 rows affected (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY  Player_1_IGN VARCHAR(40) UNIQUE;
```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_1_Character_ID INT(8) UNIQUE;
```

###### Query OK, 0 rows affected, 1 warning (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_2_IGN VARCHAR(40) UNIQUE;
```

###### Query OK, 0 rows affected (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_2_Character_ID INT(8) UNIQUE;
```

###### Query OK, 0 rows affected, 1 warning (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_3_IGN VARCHAR(40) UNIQUE;
```

###### Query OK, 0 rows affected (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_3_Character_ID INT(8) UNIQUE;
```

###### Query OK, 0 rows affected, 1 warning (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_4_IGN VARCHAR(40) UNIQUE;
```

###### Query OK, 0 rows affected (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_4_Character_ID INT(8) UNIQUE;
```

###### Query OK, 0 rows affected, 1 warning (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_5_IGN VARCHAR(40) UNIQUE;
```

###### Query OK, 0 rows affected (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 0


```SYNTAX
ALTER TABLE Registration_Form MODIFY Player_5_Character_ID INT(8) UNIQUE;
```

###### Query OK, 0 rows affected, 1 warning (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
INSERT INTO Registration_Form VALUES
    -> ('rishijeeva13@gmail.com', 
    -> 'Soul',
    -> 'Rising_soul',
    -> 'Soul_mortal',75849574,
    -> 'Soul_viper' ,64738297,
    -> 'Soul_ronak' ,73829374,
    -> 'Soul_owais', 64738294,
    -> 'Soul_regaltos',74839276) ;
```    

###### Query OK, 1 row affected (0.01 sec)


```SYNTAX
INSERT INTO Registration_Form VALUES
    -> ('tt134@gmail.com', 
    -> 'Tamilanz',
    -> 'OG_Tamilanz',
    -> 'Tamil_brainy',78263876,
    -> 'Tamil_macan' ,97239723,
    -> 'Tamil_nandha' ,89273892,
    -> 'Tamil_aakash', 87459827,
    -> 'Soul_viper',92374983 );
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registration_Form VALUES
    -> ('ddfrever@gmail.com', 
    -> 'Dead_Elites',
    -> 'Dead_Elites_Real',
    -> 'DD_Daxter',32487234,
    -> 'DD_Aceop' ,98475897,
    -> 'DD_Maddyftw' ,98237474,
    -> 'DD_Tomtodp', 582378344,
    -> 'DD_Srinath',69270872 );
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registration_Form VALUES
    -> ('rgeesports@gmail.com', 
    -> 'Recokning_esports',
    -> 'Team_RGE',
    -> 'RGE_Abrar',87346843,
    -> 'RGE_Maxy' ,98475874,
    -> 'RGE_Spray' , 34876237,
    -> 'RGE_BeardBaba', 98724987,
    -> 'RGE_EvilSurya',98347859 );
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Registration_Form VALUES
    -> ('blindesports@gmail.com', 
    -> 'Blind_esports',
    -> 'Team_blind',
    -> 'Blind_psycho',98346598,
    -> 'Blind_nivin' ,92790724,
    -> 'Blind_denver' , 83745485,
    -> 'Blind_Frink', 98273843,
    -> 'Blind_SpyOP',98437587 );
```

###### Query OK, 1 row affected (0.01 sec)


```SYNTAX
SELECT * FROM Registration_Form;
```


| Email_ID               | Clan_Name         | Team_Name        | Player_1_IGN | Player_1_Character_ID | Player_2_IGN | Player_2_Character_ID | Player_3_IGN | Player_3_Character_ID | Player_4_IGN  | Player_4_Character_ID | Player_5_IGN  | Player_5_Character_ID |
|:-----------------------|:------------------|:-----------------|:-------------|:----------------------|:-------------|:----------------------|:-------------|:----------------------|:--------------|:----------------------|:--------------|:----------------------|
| blindesports@gmail.com | Blind_esports     | Team_blind       | Blind_psycho |              98346598 | Blind_nivin  |              92790724 | Blind_denver |              83745485 | Blind_Frink   |              98273843 | Blind_SpyOP   |              98437587 |
| ddfrever@gmail.com     | Dead_Elites       | Dead_Elites_Real | DD_Daxter    |              32487234 | DD_Aceop     |              98475897 | DD_Maddyftw  |              98237474 | DD_Tomtodp    |             582378344 | DD_Srinath    |              69270872 |
| rgeesports@gmail.com   | Recokning_esports | Team_RGE         | RGE_Abrar    |              87346843 | RGE_Maxy     |              98475874 | RGE_Spray    |              34876237 | RGE_BeardBaba |              98724987 | RGE_EvilSurya |              98347859 |
| rishijeeva13@gmail.com | Soul              | Rising_soul      | Soul_mortal  |              75849574 | Soul_viper   |              64738297 | Soul_ronak   |              73829374 | Soul_owais    |              64738294 | Soul_regaltos |              74839276 |
| tt134@gmail.com        | Tamilanz          | OG_Tamilanz      | Tamil_brainy |              78263876 | Tamil_macan  |              97239723 | Tamil_nandha |              89273892 | Tamil_aakash  |              87459827 | Soul_viper    |              92374983 |

###### 5 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE Registration_Form ADD COLUMN S_no INT(50) AFTER Email_ID;
```

######  Query OK, 0 rows affected, 1 warning (0.31 sec)
Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Registration_Form MODIFY Email_ID VARCHAR(50)  AFTER S_no;
```

######  Query OK, 0 rows affected (0.29 sec)
######  Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
SELECT * FROM Registration_Form;
```


| S_no | Email_ID               | Clan_Name         | Team_Name        | Player_1_IGN | Player_1_Character_ID | Player_2_IGN | Player_2_Character_ID | Player_3_IGN | Player_3_Character_ID | Player_4_IGN  | Player_4_Character_ID | Player_5_IGN  | Player_5_Character_ID |
|:-----|:-----------------------|:------------------|:-----------------|:-------------|:----------------------|:-------------|:----------------------|:-------------|:----------------------|:--------------|:----------------------|:--------------|:----------------------|
| NULL | blindesports@gmail.com | Blind_esports     | Team_blind       | Blind_psycho |              98346598 | Blind_nivin  |              92790724 | Blind_denver |              83745485 | Blind_Frink   |              98273843 | Blind_SpyOP   |              98437587 |
| NULL | ddfrever@gmail.com     | Dead_Elites       | Dead_Elites_Real | DD_Daxter    |              32487234 | DD_Aceop     |              98475897 | DD_Maddyftw  |              98237474 | DD_Tomtodp    |             582378344 | DD_Srinath    |              69270872 |
| NULL | rgeesports@gmail.com   | Recokning_esports | Team_RGE         | RGE_Abrar    |              87346843 | RGE_Maxy     |              98475874 | RGE_Spray    |              34876237 | RGE_BeardBaba |              98724987 | RGE_EvilSurya |              98347859 |
| NULL | rishijeeva13@gmail.com | Soul              | Rising_soul      | Soul_mortal  |              75849574 | Soul_viper   |              64738297 | Soul_ronak   |              73829374 | Soul_owais    |              64738294 | Soul_regaltos |              74839276 |
| NULL | tt134@gmail.com        | Tamilanz          | OG_Tamilanz      | Tamil_brainy |              78263876 | Tamil_macan  |              97239723 | Tamil_nandha |              89273892 | Tamil_aakash  |              87459827 | Soul_viper    |              92374983 |

5 rows in set (0.00 sec)

```SYNTAX
UPDATE Registration_Form SET S_no = 1 WHERE Clan_Name = 'Blind_esports';
```

######  Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Registration_Form SET S_no = 2 WHERE Clan_Name = 'Dead_Elites';
```

######  Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Registration_Form SET S_no = 3 WHERE Clan_Name = 'Recokning_esports';
```

######  Query OK, 1 row affected (0.01 sec)
######  Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Registration_Form SET S_no = 4 WHERE Clan_Name = 'Soul';
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Registration_Form SET S_no = 5 WHERE Clan_Name = 'Tamilanz';
```

###### Query OK, 1 row affected (0.00 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
 SELECT * FROM Registration_Form;
 ```


| S_no | Email_ID               | Clan_Name         | Team_Name        | Player_1_IGN | Player_1_Character_ID | Player_2_IGN | Player_2_Character_ID | Player_3_IGN | Player_3_Character_ID | Player_4_IGN  | Player_4_Character_ID | Player_5_IGN  | Player_5_Character_ID |
|:-----|:-----------------------|:------------------|:-----------------|:-------------|:----------------------|:-------------|:----------------------|:-------------|:----------------------|:--------------|:----------------------|:--------------|:----------------------|
|    1 | blindesports@gmail.com | Blind_esports     | Team_blind       | Blind_psycho |              98346598 | Blind_nivin  |              92790724 | Blind_denver |              83745485 | Blind_Frink   |              98273843 | Blind_SpyOP   |              98437587 |
|    2 | ddfrever@gmail.com     | Dead_Elites       | Dead_Elites_Real | DD_Daxter    |              32487234 | DD_Aceop     |              98475897 | DD_Maddyftw  |              98237474 | DD_Tomtodp    |             582378344 | DD_Srinath    |              69270872 |
|    3 | rgeesports@gmail.com   | Recokning_esports | Team_RGE         | RGE_Abrar    |              87346843 | RGE_Maxy     |              98475874 | RGE_Spray    |              34876237 | RGE_BeardBaba |              98724987 | RGE_EvilSurya |              98347859 |
|    4 | rishijeeva13@gmail.com | Soul              | Rising_soul      | Soul_mortal  |              75849574 | Soul_viper   |              64738297 | Soul_ronak   |              73829374 | Soul_owais    |              64738294 | Soul_regaltos |              74839276 |
|    5 | tt134@gmail.com        | Tamilanz          | OG_Tamilanz      | Tamil_brainy |              78263876 | Tamil_macan  |              97239723 | Tamil_nandha |              89273892 | Tamil_aakash  |              87459827 | Soul_viper    |              92374983 |

###### 5 rows in set (0.00 sec)



```SYNTAX
CREATE TABLE List_OF_Queries (S_no INT PRIMARY KEY, QUERIES VARCHAR(200));
```

###### Query OK, 0 rows affected (0.04 sec)
```SYNTAX
SHOW TABLES;
```

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| List_OF_Queries               |
| Registration_Form             |
| Registered_Users              |
| UC_Purchased                  |


###### 3 rows in set (0.01 sec)

```SYNTAX
DESC List_OF_Queries;
```


| Field   | Type         | Null | Key | Default | Extra |
|:--------|:-------------|:-----|:----|:--------|:------|
| S_no    | int          | NO   | PRI | NULL    |       |
| QUERIES | varchar(200) | YES  |     | NULL    |       |

###### 2 rows in set (0.00 sec)

```SYNTAX
INSERT INTO List_OF_Queries VALUES (1,'Can you say which maps will be played in qualifiers');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO List_OF_Queries VALUES (2,'Is there a wild card entry for any teams?');
```

###### Query OK, 1 row affected (0.02 sec)

```SYNTAX
INSERT INTO List_OF_Queries VALUES (3,'Can we use triggers in tournament ?');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO List_OF_Queries VALUES (4,'Which Phone will be provided on Finals? Please give us
IPhone for finals');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO List_OF_Queries VALUES (5,'Will you provide headphones in finals?');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SELECT * FROM List_OF_Queries;
```


| S_no | QUERIES                                                                  |
|:-----|:-------------------------------------------------------------------------|
|    1 | Can you say which maps will be played in qualifiers                      |
|    2 | Is there a wild card entry for any teams?                                |
|    3 | Can we use triggers in tournament ?                                      |
|    4 | Which Phone will be provided on Finals? Please give us IPhone for finals |
|    5 | Will you provide headphones in finals?                                   |

###### 5 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE List_OF_Queries ADD Email_ID VARCHAR(50);
```

Query OK, 0 rows affected (0.04 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE List_OF_Queries ADD FOREIGN KEY (Email_ID) REFERENCES Registered_Users(Email_ID);
```

###### Query OK, 5 rows affected (0.13 sec)
###### Records: 5  Duplicates: 0  Warnings: 0


```SYNTAX
DESC List_OF_Queries;
```


| Field    | Type         | Null | Key | Default | Extra |
|:---------|:-------------|:-----|:----|:--------|:------|
| S_no     | int          | NO   | PRI | NULL    |       |
| QUERIES  | varchar(200) | YES  |     | NULL    |       |
| Email_ID | varchar(50)  | YES  | MUL | NULL    |       |

3 rows in set (0.01 sec)

```SYNTAX
ALTER TABLE List_OF_Queries MODIFY QUERIES varchar(200) AFTER Email_ID;
``` 

###### Query OK, 0 rows affected (0.11 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
DESC List_OF_Queries;
```


| Field    | Type         | Null | Key | Default | Extra |
|:---------|:-------------|:-----|:----|:--------|:------|
| S_no     | int          | NO   | PRI | NULL    |       |
| Email_ID | varchar(50)  | YES  | MUL | NULL    |       |
| QUERIES  | varchar(200) | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```SYNTAX
SELECT * FROM List_OF_Queries;
```


| S_no | Email_ID | QUERIES                                                                  |
|:-----|:---------|:-------------------------------------------------------------------------|
|    1 | NULL     | Can you say which maps will be played in qualifiers                      |
|    2 | NULL     | Is there a wild card entry for any teams?                                |
|    3 | NULL     | Can we use triggers in tournament ?                                      |
|    4 | NULL     | Which Phone will be provided on Finals? Please give us IPhone for finals |
|    5 | NULL     | Will you provide headphones in finals?                                   |

###### 5 rows in set (0.00 sec)

```SYNTAX
UPDATE List_OF_Queries SET Email_ID = 'rishijeeva13@gmail.com' WHERE S_no = 1;
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE List_OF_Queries SET Email_ID = 'tt134@gmail.com' WHERE S_no = 2;
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE List_OF_Queries SET Email_ID = 'ddfrever@gmail.com' WHERE S_no = 3;
```

###### Query OK, 1 row affected (0.00 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE List_OF_Queries SET Email_ID = 'rgeesports@gmail.com' WHERE S_no = 4;
```

###### Query OK, 1 row affected (0.02 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE List_OF_Queries SET Email_ID = 'blindesports@gmail.com' WHERE S_no = 5;
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
SELECT * FROM List_OF_Queries;
```

| S_no | Email_ID               | QUERIES                                                                  |
|:-----|:-----------------------|:-------------------------------------------------------------------------|
|    1 | rishijeeva13@gmail.com | Can you say which maps will be played in qualifiers                      |
|    2 | tt134@gmail.com        | Is there a wild card entry for any teams?                                |
|    3 | ddfrever@gmail.com     | Can we use triggers in tournament ?                                      |
|    4 | rgeesports@gmail.com   | Which Phone will be provided on Finals? Please give us IPhone for finals |
|    5 | blindesports@gmail.com | Will you provide headphones in finals?                                   |

###### 5 rows in set (0.00 sec)


```SYNTAX
CREATE TABLE Add_Highlights (S_no INT PRIMARY KEY , Video_URL VARCHAR(100) , Description TEXT(500) );
```

###### Query OK, 0 rows affected (0.05 sec)

```SYNTAX
SHOW TABLES;
```

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Add_Highlights                |
| List_OF_Queries               |
| Registration_Form             |
| Registered_Users              |
| UC_Purchased                  |

###### 4 rows in set (0.00 sec)

```SYNTAX
DESC Add_Highlights;
```


| Field       | Type         | Null | Key | Default | Extra |
|:------------|:-------------|:-----|:----|:--------|:------|
| S_no        | int          | NO   | PRI | NULL    |       |
| Video_URL   | varchar(100) | YES  |     | NULL    |       |
| Description | text         | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```SYNTAX
INSERT INTO Add_Highlights VALUES (1,'https://www.youtube.com/embed/xyyAiRkABpk',' An 18 year under dog player from tamilnadu improving his skills by grinding.');
```

###### Query OK, 1 row affected (0.00 sec)

```SYNTAX
INSERT INTO Add_Highlights VALUES (2,'https://www.youtube.com/embed/SIaVTMDcFB0','17 Year Old Indian Playing For Skill Improvement And Not For K.D OR Tier');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Add_Highlights VALUES (3,'https://www.youtube.com/embed/IdOhr85-Gg0','Jonathan Amaral is an Indian professional E-sports athlete, PUBG Mobile player, streamer, gaming content creator,
and social media influencer from Pune, Maharastra, India. Currently, he is popularly known as his online stage name Jonathan Gaming');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Add_Highlights VALUES (4,'https://www.youtube.com/embed/tlL1mSg2Wfg','');
```
###### query OK, 1 row affected (0.01 sec)

```SYNTAX
UPDATE Add_Highlights SET Description = 'Snax gaming is also known as Raj Varma is a professional E-Sports player and is well known for his amazing DP-28 spray and the brilliant performance in the T1 scrims or the official PUBG or BGMI tournaments. He is currently in the team IND which is performing very well in the battlegrounds mobile India official launch party.' WHERE S_no = 4;
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
SELECT * FROM Add_Highlights;
```


| S_no | Video_URL                                 | Description                                                                                                                                                                                                                                                                                                                            |
|:-----|:------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|    1 | https://www.youtube.com/embed/xyyAiRkABpk |  An 18 year under dog player from tamilnadu improving his skills by grinding.                                                                                                                                                                                                                                                          |
|    2 | https://www.youtube.com/embed/SIaVTMDcFB0 | 17 Year Old Indian Playing For Skill Improvement And Not For  KD                                                                                                                                                                                                                                                                       |
|    3 | https://www.youtube.com/embed/IdOhr85-Gg0 | Jonathan Amaral is an Indian professional E-sports athlete, PUBG Mobile player, streamer, gaming content creator, and social media influencer from Pune, Maharastra, India.                                                                                                                                                            |
|    4 | https://www.youtube.com/embed/tlL1mSg2Wfg | Snax gaming is also known as Raj Varma is a professional E-Sports player and is well known for his amazing DP-28 spray                                                                                                                                                                                                                 |

###### 4 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE Add_Highlights RENAME TO Added_Highlights;
```

###### Query OK, 0 rows affected (0.03 sec)


```SYNTAX
CREATE TABLE Contact_US (Name VARCHAR(50) , Email_ID VARCHAR(50) , Contact_NO INT(10) , Messages TEXT);
```

###### Query OK, 0 rows affected, 1 warning (0.05 sec)

```SYNTAX
SHOW TABLES;
```


| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Add_Highlights                |
| Contact_US                    |
| List_OF_Queries               |
| Registration_Form             |
| Registered_Users              |
| UC_Purchased                  |


###### 5 rows in set (0.01 sec)

```SYNTAX
DESC Contact_US;
```


| Field      | Type        | Null | Key | Default | Extra |
|:-----------|:------------|:-----|:----|:--------|:------|
| Name       | varchar(50) | YES  |     | NULL    |       |
| Email_ID   | varchar(50) | YES  |     | NULL    |       |
| Contact_NO | int         | YES  |     | NULL    |       |
| Messages   | text        | YES  |     | NULL    |       |

###### 4 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE Contact_US MODIFY Name VARCHAR(50) NOT NULL;
```

###### Query OK, 0 rows affected (0.08 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Contact_US MODIFY Email_ID VARCHAR(50) NOT NULL;
```

###### Query OK, 0 rows affected (0.08 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Contact_US MODIFY Contact_NO INT(10) NOT NULL;
```

###### Query OK, 0 rows affected, 1 warning (0.06 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
ALTER TABLE Contact_US MODIFY Messages TEXT NOT NULL;
```

###### Query OK, 0 rows affected (0.07 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Contact_US MODIFY Contact_NO BIGINT(10) NOT NULL;
```

###### Query OK, 0 rows affected, 1 warning (0.11 sec)
###### Records: 0  Duplicates: 0  Warnings: 1

```SYNTAX
INSERT INTO Contact_US VALUES ('Rishi','rishijeeva13@gmail.com',6381950080,'This website is really good and i particularly loved that esports page but i expecting more in that like images and videos');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Contact_US VALUES ('kasi','antokasi@gmail.com',8682072886,'I really like this website but i couldnt find any review page can you update it too');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Contact_US VALUES ('Ismail','smile12@gmail.com',6473829433,'Some videos are not playing in the highlights page can you please fix that issues');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Contact_US VALUES ('Santhanu','sanboi1999@gmail.com',7647648733,'The news are old
can you please update day to day news');
```

###### Query OK, 1 row affected (0.00 sec)

```SYNTAX
INSERT INTO Contact_US VALUES ('Chithraj','spideyboy55@gmail.com',8765475786,'Shoot the teddy
game was really good can you please update more games like this? thank you!!');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SELECT * FROM Contact_US;
```


| Name     | Email_ID               | Contact_NO | Messages                                                                                                                   |
|:---------|:-----------------------|:-----------|:---------------------------------------------------------------------------------------------------------------------------|
| Rishi    | rishijeeva13@gmail.com | 6381950080 | This website is really good and i particularly loved that esports page but i expecting more in that like images and videos |
| kasi     | antokasi@gmail.com     | 8682072886 | I really like this website but i couldnt find any review page can you update it too                                        |
| Ismail   | smile12@gmail.com      | 6473829433 | Some videos are not playing in the highlights page can you please fix that issues                                          |
| Santhanu | sanboi1999@gmail.com   | 7647648733 | The news are old can you please update day to day news                                                                     |
| Chithraj | spideyboy55@gmail.com  | 8765475786 | Shoot the teddy game was really good can you please update more games like this? thank you!!                               |

###### 5 rows in set (0.01 sec)


```SYNTAX
CREATE TABLE NEWS (ID VARCHAR(50) PRIMARY KEY , TOPICS VARCHAR(50)NOT NULL );
```

###### Query OK, 0 rows affected (0.04 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('N1','Notice');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('N2','Notice');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('N3','Notice');
```
###### Query OK, 1 row affected (0.00 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('A1','Achievement');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('A2','Achievement');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('A3','Achievement');
```
###### Query OK, 1 row affected (0.00 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('E1','Event');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('E2','Event');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO NEWS VALUES ('E3','Event');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SHOW TABLES;
```


| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Added_Highlights              |
| Contact_US                    |
| List_OF_Queries               |
| NEWS                          |                       
| Registered_Users              |
| Registration_Form             |
| UC_Purchased                  |

###### 8 rows in set (0.00 sec)

```SYNTAX
DESC NEWS;
```


| Field  | Type        | Null | Key | Default | Extra |
|:-------|:------------|:-----|:----|:--------|:------|
| ID     | varchar(50) | NO   | PRI | NULL    |       |
| TOPICS | varchar(50) | NO   |     | NULL    |       |

###### 2 rows in set (0.00 sec)

```SYNTAX
SELECT * FROM NEWS;
```


| ID | TOPICS      |
|:---|:------------|
| A1 | Achievement |
| A2 | Achievement |
| A3 | Achievement |
| E1 | Event       |
| E2 | Event       |
| E3 | Event       |
| N1 | Notice      |
| N2 | Notice      |
| N3 | Notice      |


###### 9 rows in set (0.00 sec)

```SYNTAX
CREATE TABLE Notices (ID VARCHAR(50) PRIMARY KEY , Heading VARCHAR(100) NOT NULL , Description VARCHAR(500), FOREIGN KEY(ID) REFERENCES NEWS(ID));
```

###### Query OK, 0 rows affected (0.05 sec)

```SYNTAX
SHOW TABLES;
```

| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Added_Highlights              |
| Contact_US                    |
| List_OF_Queries               |
| NEWS                          |
| Notices                       |
| Registered_Users              |
| Registration_Form             |
| UC_Purchased                  |


###### 8 rows in set (0.00 sec)

```SYNTAX
DESC Notices;
```

| Field       | Type         | Null | Key | Default | Extra |
|:------------|:-------------|:-----|:----|:--------|:------|
| ID          | varchar(50)  | NO   | PRI | NULL    |       |
| Heading     | varchar(100) | NO   |     | NULL    |       |
| Description | varchar(500) | YES  |     | NULL    |       |

###### 3 rows in set (0.00 sec)

```SYNTAX
INSERT INTO Notices VALUES ('N1','Virus Infection Mode Taken Down','UPDATED : Dec 9, 15:17PM] Virus Infection Mode has been taken down temporarily. Dear BATTLEGROUNDS MOBILE INDIA fansWe have identified an issue when playing Virus Infection Mode, and will take down the mode temporarily at Dec 9, 14:50 PM');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Notices VALUES ('N2','November Update Schedule','We are truly excited to bring the Mirror World Theme to you in the upcoming update. We like to inform you the schedule for the distribution of November update version on November 19th.');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Notices VALUES ('N3','Data Transfer Closeout','In order to ensure a more smooth gameplay for players who had used PUBG MOBILE Normdic Map: Livik ("Prior App") before, BATTLEGROUNDS MOBILE INDIA ("New App") will transfer some of the data from the Prior App account to the New App.');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SELECT * FROM Notices;
```


| ID | Heading                         | Description                                                                                                                                                                                                                                   |
|:---|:--------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| N1 | Virus Infection Mode Taken Down | UPDATED : Dec 9, 15:17PM] Virus Infection Mode has been taken down temporarily. Dear BATTLEGROUNDS MOBILE INDIA fansWe have identified an issue when playing Virus Infection Mode, and will take down the mode temporarily at Dec 9, 14:50 PM |
| N2 | November Update Schedule        | We are truly excited to bring the Mirror World Theme to you in the upcoming update. We like to inform you the schedule for the distribution of November update version on November 19th.                                                      |
| N3 | Data Transfer Closeout          | In order to ensure a more smooth gameplay for players who had used PUBG MOBILE Normdic Map: Livik ("Prior App") before, BATTLEGROUNDS MOBILE INDIA ("New App") will transfer some of the data from the Prior App account to the New App.      |

###### 3 rows in set (0.00 sec)

```SYNTAX
CREATE TABLE Achievements (ID VARCHAR(50) PRIMARY KEY , Heading VARCHAR(50) NOT NULL , Image_URL VARCHAR(100) NOT NULL , Description VARCHAR(500) NOT NULL , FOREIGN KEY (ID) REFERENCES NEWS(ID));
```
```SYNTAX
SHOW TABLES;
```


| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Achievements                  |
| Added_Highlights              |
| Contact_US                    |                  
| List_OF_Queries               |
| NEWS                          |
| Notices                       |
| Registered_Users              |
| Registration_Form             |
| UC_Purchased                  |


###### 9 rows in set (0.00 sec)

```SYNTAX
DESC Achievements;
```

| Field       | Type         | Null | Key | Default | Extra |
|:------------|:-------------|:-----|:----|:--------|:------|
| ID          | varchar(50)  | NO   | PRI | NULL    |       |
| Heading     | varchar(50)  | NO   |     | NULL    |       |
| Image_URL   | varchar(100) | NO   |     | NULL    |       |
| Description | varchar(500) | NO   |     | NULL    |       |

###### 4 rows in set (0.00 sec)

```SYNTAX
INSERT INTO Achievements VALUES ('A1','RIVALS TOURNAMENT','http://127.0.0.1:5500/assets/images/rivals_top3.jpg','PUBG Mobile Rivals Cup is a new inter-country tournament announced by the officials which will feature teams from Korea and Japan. This will be the final leg for the qualification of Tencent PUBG Mobile Global Championship 2021 scheduled to commence from 30th November,2021.');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Achievements VALUES ('A2','THE FALL SEASON - FACE OFF','THE FALL SEASON - FACE OFF','BattleGrounds Mobile India on the occasion of the release of the 1.7.0 update of BGMI, present a fun tournament named The Fall Season Face-Off. The tournament features 18 invited teams who will compete for a prize pool of ₹4,50,000 INR.');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Achievements VALUES ('A3','ONESHOT TOURNAMENT','http://127.0.0.1:5500/assets/images/oneshot_champ.jpg','Oneshot eSports in association with Caribbean Decor present the second season of
OneShot Showdown a BGMI invitational tournament calle
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
UPDATE Achievements SET Image_URL = 'http://127.0.0.1:5500/assets/images/fall_top3.jpg' WHERE ID = 'A2';
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
SELECT * FROM Achievements;
```
| ID | Heading                    | Image_URL                                             | Description                                                                                                                                                                                                                                                                                
|:---|:---------------------------|:------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A1 | RIVALS TOURNAMENT          | http://127.0.0.1:5500/assets/images/rivals_top3.jpg   | PUBG Mobile Rivals Cup is a new inter-country tournament announced by the officials which will feature teams from Korea and Japan. This will be the final leg for the qualification of Tencent PUBG Mobile Global Championship 2021 scheduled to commence from 30th November,2021.         |
| A2 | THE FALL SEASON - FACE OFF | http://127.0.0.1:5500/assets/images/fall_top3.jpg     | BattleGrounds Mobile India on the occasion of the release of the 1.7.0 update of BGMI, present a fun tournament named The Fall Season Face-Off. The tournament features 18 invited teams who will compete for a prize pool of ₹4,50,000 INR.                                               |
| A3 | ONESHOT TOURNAMENT         | http://127.0.0.1:5500/assets/images/oneshot_champ.jpg | Oneshot eSports in association with Caribbean Decor present the second season of OneShot Showdown a BGMI invitational tournament called the OneShot Showdown Season 2 with a prize pool of ₹10,00,000 INR. The Grand Finals of the tournament features a prize pool of ₹10,00,000 INR.     |

###### 3 rows in set (0.00 sec)

```SYNTAX
CREATE TABLE Events (ID VARCHAR(50) PRIMARY KEY , Image_URL VARCHAR(100) NOT NULL , Event_Name VARCHAR(30) NOT NULL, FOREIGN KEY (ID) REFERENCES NEWS (ID)) ;
```

```SYNTAX
DESC Events;
```


| Field      | Type         | Null | Key | Default | Extra |
|:-----------|:-------------|:-----|:----|:--------|:------|
| ID         | varchar(50)  | NO   | PRI | NULL    |       |
| Image_URL  | varchar(100) | NO   |     | NULL    |       |
| Event_Name | varchar(30)  | NO   |     | NULL    |       |

###### 3 rows in set (0.01 sec)

###### Query OK, 0 rows affected (0.05 sec)

```SYNTAX
INSERT INTO Events VALUES('E1','http://127.0.0.1:5500/assets/images/pmco.jpg','PMCO');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Events VALUES('E2','http://127.0.0.1:5500/assets/images/battlegrounds-.png','PMIT');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Events VALUES('E3','http://127.0.0.1:5500/assets/images/app.png','BGIS');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
UPDATE Events SET Event_Name = 'PMCO - PUBG MOBILE CLUB OPENS' WHERE ID = 'E1';
```

###### Query OK, 1 row affected (0.00 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Events SET Event_Name = 'PMIT - PUBG MOBILE INDIA TOUR' WHERE ID = 'E2';
```

###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
UPDATE Events SET Event_Name = 'BGIS-BATTLEGROUND INDIA SERIES' WHERE ID = 'E3';
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0

```SYNTAX
 SELECT * FROM Events;
```

| ID | Image_URL                                              | Event_Name                     |
|:---|:-------------------------------------------------------|:-------------------------------|
| E1 | http://127.0.0.1:5500/assets/images/pmco.jpg           | PMCO - PUBG MOBILE CLUB OPENS  |
| E2 | http://127.0.0.1:5500/assets/images/battlegrounds-.png | PMIT - PUBG MOBILE INDIA TOUR  |
| E3 | http://127.0.0.1:5500/assets/images/app.png            | BGIS-BATTLEGROUND INDIA SERIES |


###### 3 rows in set (0.00 sec)

```SYNTAX
DESC Registration_Form;
```


| Field                 | Type        | Null | Key | Default | Extra |
|:----------------------|:------------|:-----|:----|:--------|:------|
| Email_ID              | varchar(50) | YES  | UNI | NULL    |       |
| Clan_Name             | varchar(50) | NO   | PRI | NULL    |       |
| Team_Name             | varchar(50) | YES  | UNI | NULL    |       |
| Player_1_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_1_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_2_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_2_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_3_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_3_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_4_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_4_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_5_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_5_Character_ID | int         | YES  | UNI | NULL    |       |

###### 13 rows in set (0.00 sec)

```SYNTAX
ALTER TABLE Registration_Form DROP PRIMARY KEY;
```

Query OK, 5 rows affected (0.34 sec)
######  Records: 5  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form MODIFY Clan_Name VARCHAR(50) NOT NULL;
```
######  Query OK, 0 rows affected (0.03 sec)
######  Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
DESC Registration_Form;
```


| Field                 | Type        | Null | Key | Default | Extra |
|:----------------------|:------------|:-----|:----|:--------|:------|
| Email_ID              | varchar(50) | NO   | PRI | NULL    |       |
| Clan_Name             | varchar(50) | NO   |     | NULL    |       |
| Team_Name             | varchar(50) | YES  | UNI | NULL    |       |
| Player_1_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_1_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_2_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_2_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_3_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_3_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_4_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_4_Character_ID | int         | YES  | UNI | NULL    |       |
| Player_5_IGN          | varchar(40) | YES  | UNI | NULL    |       |
| Player_5_Character_ID | int         | YES  | UNI | NULL    |       |

###### 13 rows in set (0.00 sec)

``SYNTAX
ALTER TABLE  Registered_Users MODIFY Email_ID VARCHAR(50) UNIQUE;
```
###### Query OK, 0 rows affected (0.05 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

```SYNTAX
ALTER TABLE Registration_Form ADD FOREIGN KEY (Email_ID) REFERENCES Registered_Users(Email_ID);
```
###### Query OK, 5 rows affected (0.20 sec)
###### Records: 5  Duplicates: 0  Warnings: 0

```SYNTAX
DESC Registered_Users;
```


| Field    | Type        | Null | Key | Default | Extra          |
|:---------|:------------|:-----|:----|:--------|:---------------|
| S_no     | int         | NO   | PRI | NULL    | auto_increment |
| Email_ID | varchar(50) | YES  | UNI | NULL    |                |
| User_ID  | int         | YES  |     | NULL    |                |
| Password | varchar(20) | YES  |     | NULL    |                |

###### 4 rows in set (0.01 sec)

```SYNTAX
CREATE TABLE Review (S_no INT , User_ID INT(8) PRIMARY KEY , Email_ID VARCHAR(50) UNIQUE , Feedbacks VARCHAR(50) NOT NULL );
```
###### Query OK, 0 rows affected, 1 warning (0.05 sec)

```SYNTAX
SHOW TABLES;
```


| Tables_in_Pubg_Tournament_App |
|:------------------------------|
| Achievements                  |
| Added_Highlights              |
| Contact_US                    |
| Events                        |
| List_OF_Queries               |
| NEWS                          |
| Notices                       |
| Registered_Users              |
| Registration_Form             |
| Review                        |
| UC_Purchased                  |

###### 11 rows in set (0.01 sec)

```SYNTAX
DESC Review;
```


| Field     | Type        | Null | Key | Default | Extra |
|:----------|:------------|:-----|:----|:--------|:------|
| S_no      | int         | YES  |     | NULL    |       |
| User_ID   | int         | NO   | PRI | NULL    |       |
| Email_ID  | varchar(50) | YES  | UNI | NULL    |       |
| Feedbacks | varchar(50) | NO   |     | NULL    |       |

###### 4 rows in set (0.01 sec)

```SYNTAX
INSERT INTO Review VALUES (1,75849574,'rishijeeva13@gmail.com','I like this game very much');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
ALTER TABLE Review RENAME TO Reviews;
```

###### Query OK, 0 rows affected (0.03 sec)

```SYNTAX
ALTER TABLE Reviews MODIFY Feedbacks VARCHAR(500) ;
```

###### Query OK, 1 row affected (0.12 sec)
###### Records: 1  Duplicates: 0  Warnings: 0

```SYNTAX
INSERT INTO Reviews VALUES (2,78263876,'tt134@gmail.com','Can you add timer in this game it will be more intresting');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Reviews VALUES (3,32487234,'ddfrever@gmail.com','Can you increase the teddy bear moving speed');
```

###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
INSERT INTO Reviews VALUES (4,87346843,'rgeesports@gmail.com','Graphics is really good i litrally loved this game');
```

###### Query OK, 1 row affected (0.00 sec)

```SYNTAX
INSERT INTO Reviews VALUES (5,98346598,'blindesports@gmail.com','NO comments its good');
```
###### Query OK, 1 row affected (0.01 sec)

```SYNTAX
SELECT * FROM Reviews;
```

| S_no | User_ID  | Email_ID               | Feedbacks                                                 |
|:-----|:---------|:-----------------------|:----------------------------------------------------------|
|    3 | 32487234 | ddfrever@gmail.com     | Can you increase the teddy bear moving speed              |
|    1 | 75849574 | rishijeeva13@gmail.com | I like this game very much                                |
|    2 | 78263876 | tt134@gmail.com        | Can you add timer in this game it will be more intresting |
|    4 | 87346843 | rgeesports@gmail.com   | Graphics is really good i litrally loved this game        |
|    5 | 98346598 | blindesports@gmail.com | NO comments its good                                      |

###### 5 rows in set (0.00 sec)




