-- Write your code here:
select name, sum(price), avg(price)
from cars
group by name
;