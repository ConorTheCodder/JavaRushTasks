-- Write your code here:
select employee.id, if(salary > 1000, 'yes', 'no')
from employee
where id < 5
;

/* id | salary_check
-----------------
1  | yes
2  | no
3  | yes
4  | no
*/