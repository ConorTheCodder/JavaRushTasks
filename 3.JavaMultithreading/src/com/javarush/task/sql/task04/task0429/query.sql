-- Write your code here:
SELECT *
FROM event
WHERE date_time BETWEEN CURDATE() AND
          DATE_SUB(CURDATE(), INTERVAL 2 WEEK)
;