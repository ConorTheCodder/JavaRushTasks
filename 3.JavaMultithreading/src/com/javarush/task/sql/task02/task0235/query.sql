-- Write your code here:
select year(employee.date_of_birth) as year_of_birth, count(*) as count
from employee
where position like '%developer%'
group by year_of_birth
order by year_of_birth
;