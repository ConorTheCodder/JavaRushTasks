-- Write your code here:
select employee.department, count(*) as number_of_employees
from employee
group by department
;