-- Write your code here:
select *
from parts
where parts.description is not null
   or parts.identifier is null;