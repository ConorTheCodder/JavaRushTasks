-- Write your code here:
select name, min(price), max(price) as max
from cars
group by name
having max < 200000
;

