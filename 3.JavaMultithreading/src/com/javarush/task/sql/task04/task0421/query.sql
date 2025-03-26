-- Write your code here:
SELECT CURDATE(),
       DATE_ADD(NOW(), INTERVAL 3 DAY),
       DATE_SUB(NOW(), INTERVAL 3 DAY)
;