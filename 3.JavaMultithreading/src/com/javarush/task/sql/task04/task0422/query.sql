-- Write your code here:
SELECT NOW(),
       DATE_ADD(NOW(), INTERVAL NULL SECOND),
       DATE_ADD(NOW(), INTERVAL 33 SECOND)
;