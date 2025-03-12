-- Write your code here:
select case is_full_time
           when 0 then 'заочник'
           when 1 then 'очник' end as is_full_time,
       count(*) as count
from students
where is_full_time < 2
group by is_full_time
;