-- Write your code here:
select cars.prod_year, count(*) as car_count
from cars
group by prod_year
;