-- Write your code here:
select case months.number_of_season
           when 1 then 'winter'
           when 2 then 'spring'
           when 3 then 'summer'
           when 4 then 'autumn'
           end
from months
;