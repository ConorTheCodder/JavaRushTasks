-- Write your code here:
SELECT DAYNAME(date), COUNT(type)
FROM event
WHERE type = 'REGISTRATION'
GROUP BY date
ORDER BY COUNT(*) DESC
LIMIT 1
;