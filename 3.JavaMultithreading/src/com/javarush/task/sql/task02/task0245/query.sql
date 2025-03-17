-- Write your code here:
select name, count(*) as count
from cars
group by name
having count > 1
;

/* верно ли я указал параметр count? Не нужно ли там написать
звёздочку? */