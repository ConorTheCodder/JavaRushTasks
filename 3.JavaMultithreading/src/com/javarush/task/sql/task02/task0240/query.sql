-- Write your code here:
select case year(date_of_birth)
           when year(date_of_birth) < 2000 then 'yes'
           when year(date_of_birth) >= 2000 then 'no'
           end              as 'experienced',
       month(date_of_birth) as 'month_of_birth'
from employee
;