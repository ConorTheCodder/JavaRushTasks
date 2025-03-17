-- Write your code here:
select department, position, count(name) as total
from employee
group by department, position
having position = 'frontend developer'
   and total > 1
;