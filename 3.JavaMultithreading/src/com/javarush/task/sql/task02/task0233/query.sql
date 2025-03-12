-- Write your code here:
select year(date_of_birth) as year_of_joining, count(*)
from employee
group by year_of_joining
order by year_of_joining
;
-- error