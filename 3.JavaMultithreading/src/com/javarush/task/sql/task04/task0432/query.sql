-- Write your code here:
SELECT MONTHNAME(date), COUNT(*)
FROM event
WHERE status = 'ERROR'
   OR status = 'FAILED'
GROUP BY date
ORDER BY COUNT(*) DESC
LIMIT 1
;

-- ???