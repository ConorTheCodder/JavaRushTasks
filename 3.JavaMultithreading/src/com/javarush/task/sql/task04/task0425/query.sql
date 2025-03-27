-- Write your code here:
SELECT YEAR(date_of_birth)  AS year,
       MONTH(date_of_birth) AS month,
       COUNT(*)
FROM employee
GROUP BY year, month
;

-- почему он воспринял alias, если он в select'е?