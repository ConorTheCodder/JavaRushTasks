-- Write your code here:
select YEAR(date_of_birth) as 'year', MONTH(date_of_birth) as 'month'
from employee
group by year, month
;