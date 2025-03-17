-- Write your code here:
select name, count(name) as car_count
from cars
group by name
having car_count < 3
;