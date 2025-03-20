-- Write your code here:
select g.id, g.name, c.name, c.email
from gyms g,
     customers c
;
-- почему-то нормально и без AS работает