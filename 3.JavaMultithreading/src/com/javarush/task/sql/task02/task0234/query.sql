-- Write your code here:
select year(date_of_birth) as year_of_birth, count(*)
from employee
group by date_of_birth
order by year_of_birth
;