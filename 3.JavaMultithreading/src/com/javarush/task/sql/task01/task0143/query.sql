-- Write your code here:
select id, identifier, required, description
from parts
order by identifier asc, required desc, description desc
limit 7
;