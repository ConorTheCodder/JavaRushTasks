-- Write your code here:
select -- if(euro is null, 'good', 'bad')
case when euro is null then 'good'
else 'bad'
end
from cars
;