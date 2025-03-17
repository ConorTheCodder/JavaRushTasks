-- Write your code here:
select department, position, count(department, position) as 'total'
from employee
group by department, position
having department = 'backend developer'
   and total = 1
;