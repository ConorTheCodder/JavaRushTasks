-- Write your code here:
select c.customer_id,
       c.email,
       o.order_id,
       o.order_status
from customers as c
         join orders as o
              on c.customer_id = o.customer_id
where o.order_status like '%PAID%'
   or o.order_status like '%PROCESSING%'
;