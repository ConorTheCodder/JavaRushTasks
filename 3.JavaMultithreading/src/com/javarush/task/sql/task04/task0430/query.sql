-- Write your code here:
SELECT YEAR(date_time),
       MONTH(date_time),
       DAY(date_time),
       COUNT(*)
FROM event
GROUP BY date_time, date_time, date_time
HAVING COUNT(*) > 5
;

-- в таблице нет поля date
-- не знаю как делать