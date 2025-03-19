-- Write your code here:
select rating, group_concat(name separator ', ')
from employee
where rating > 2
group by rating
order by rating
;