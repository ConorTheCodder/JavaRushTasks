-- Write your code here:
select department, count(position) as different_positions
from employee
group by department
;