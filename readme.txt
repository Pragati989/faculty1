1)Start Tomcat server.
2)The welcome page in web.xml is index.html.(faculty login)
3)Enter the username and password in Faculty login page.
 sample data:
 mysql> select * from Faculty;
 +-----+-----+---------+----------+---------+
 | id  | age | name    | password | uname   |
 +-----+-----+---------+----------+---------+
 | 123 |  22 | pragati | pragati  | pragati |
 +-----+-----+---------+----------+---------+

 mysql> select * from Course;
 +------+--------+
 | c_Id | c_name |
 +------+--------+
 |    1 | ALGO   |
 |    2 | ML     |
 +------+--------+

mysql> select * from Course_Faculty;
+-------------+--------+
| course_c_Id | fac_id |
+-------------+--------+
|           1 |    123 |
|           2 |    123 |
+-------------+--------+
2 rows in set (0.00 sec)

 use username:pragati
     password:pragati
     it will redirect to the page which will show the courses corresponding to this faculty.



