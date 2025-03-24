-- Write your code here:
WITH tempTable(averageDOB) AS (select AVG(year_born)
                               from film_directors)
select film_directors.id,
       film_directors.full_name,
       film_directors.year_born
from film_directors,
     tempTable
where film_directors.year_born < tempTable.averageDOB
;