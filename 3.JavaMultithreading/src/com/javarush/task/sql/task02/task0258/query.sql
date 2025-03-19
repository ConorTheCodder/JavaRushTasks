-- Write your code here:
select position as positions, group_concat(name separator ', ') as names
from employee
group by position
;
