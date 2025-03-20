-- Write your code here:
select retailer.name        as retailer,
       retailer.hq_location as retailer_hq,
       suppliers.country    as supplier_country
from top_retailers as retailer,
     suppliers
;

-- что значит "временно"?