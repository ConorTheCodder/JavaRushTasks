-- Write your code here:
select if(age <= 12, 'child', if(age >= 20, 'adult', 'teenager')) as theirAges
from customers
limit 5
;