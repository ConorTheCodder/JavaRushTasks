-- Write your code here:
select top_retailers.ret_name, top_retailers.ret_revenue
from top_retailers
         join suppliers
              on top_retailers.ret_revenue = suppliers.sup_revenue
;