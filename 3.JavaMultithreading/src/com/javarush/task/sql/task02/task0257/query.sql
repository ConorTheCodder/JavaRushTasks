-- Write your code here:
select name, avg(price) as avg, sum(price)
from cars
group by name
having avg > 100000
;