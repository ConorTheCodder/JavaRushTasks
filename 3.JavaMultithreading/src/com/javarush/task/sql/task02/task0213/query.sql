-- Write your code here:
select case students.is_full_time
           when 1 then 'true'
           when 0 then 'false'
           end
from students
;