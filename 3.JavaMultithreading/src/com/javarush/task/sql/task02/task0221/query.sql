-- Write your code here:
select cars.prod_year, count(*)
from cars
group by cars.prod_year
;