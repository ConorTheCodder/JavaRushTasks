-- Write your code here:
select department, salary, name from employee
where salary > 2000 AND NOT department = 'qa'
;