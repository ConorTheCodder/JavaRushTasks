-- Write your code here:
select employee.department as department_name, count(*) as count
from employee
where position = 'frontend developer'
group by department
;