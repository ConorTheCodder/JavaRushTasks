-- Write your code here:
SELECT name, SUM(price) as sum
FROM cars
group by name
having sum > 200000
;

-- была бы разница с having вместо where?