-- Write your code here:
select ip2country.ip_from, ip2country.ip_to, ip2country.country_name
from ip2country
order by ip_to desc
limit 1 offset 74
;
