-- Write your code here:
select parts.description
from parts
order by required desc , identifier desc , description desc
limit 1 offset 23
;