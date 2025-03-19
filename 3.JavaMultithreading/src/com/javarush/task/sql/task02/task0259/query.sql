-- Write your code here:
select position, group_concat(name separator ', ')
from employee
group by position
having position like '%developer%'
;
