-- Write your code here:
USE test;
DROP TABLE IF EXISTS users2;
CREATE TABLE users2
(
    user_id    int          NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL,
    last_name  varchar(255) NOT NULL,
    date       date         NULL DEFAULT (CURRENT_DATE),
    weight     float(10)    NULL,
    PRIMARY KEY (user_id)
)
;
