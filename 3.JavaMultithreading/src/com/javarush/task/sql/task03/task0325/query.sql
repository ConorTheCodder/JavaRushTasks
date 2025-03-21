-- Write your code here:
select c.zip_code, o.order_id
from customers as c
         left join test.orders o
                   on c.customer_id = o.customer_id
where o.shipped_date is not null
  and o.store_id = 27
;