-- Write your code here:
select cars.name, count(*)
from cars
group by cars.name
;