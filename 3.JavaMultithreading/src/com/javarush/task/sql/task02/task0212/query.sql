-- Write your code here:
select
    if(position like 'manager', if(salary > 10000, 'good', 'bad'), if(salary > 5000, 'good', 'bad'))
    -- if(position like 'manager' and salary > 10000 or position not like 'manager' and salary > 5000, 'good', 'bad')
from employee
where city like 'London'
;
