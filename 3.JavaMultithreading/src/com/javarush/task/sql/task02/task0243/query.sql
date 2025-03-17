-- Write your code here:
select year(prod_date) as prod_year, month(prod_date) as prod_month, count(id)
from cars
group by prod_year, prod_month
;

/* не понял, выражение "Группировку сделай по алиасам"
именно написанное мной подразумевает или что-то другое? */