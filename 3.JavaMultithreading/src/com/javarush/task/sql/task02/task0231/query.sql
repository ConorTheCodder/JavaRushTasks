-- Write your code here:
select employee.department as department_name, count(*) as count
from employee
where position = 'frontend developer'
   or position = 'backend developer'
group by employee.department
;