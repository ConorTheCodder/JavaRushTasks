-- Write your code here:
select department, position, count(*) as total
from employee
group by department, position
having total = 1
;

-- как здесь работает count() с двумя параметрами?