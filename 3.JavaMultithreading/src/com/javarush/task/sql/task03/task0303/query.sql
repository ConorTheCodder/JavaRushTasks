-- Write your code here:
select *
from gyms,
     customers
where gyms.name = customers.name
;

-- результат какой-то неправильный выдаёт