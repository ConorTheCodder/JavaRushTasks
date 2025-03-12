-- Write your code here:
select cars.prod_year, count(*)
from cars
where name = 'Blue Car'
group by prod_year
;