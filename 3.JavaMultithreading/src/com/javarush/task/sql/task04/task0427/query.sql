-- Write your code here:
SELECT *
FROM event
WHERE DATEDIFF(CURDATE(), date_time) <= 20
;