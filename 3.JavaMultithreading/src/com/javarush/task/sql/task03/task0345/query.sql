-- Write your code here:
select film_directors.last_name, film.grossed
from film_directors
         left join (select films.grossed, films.director_id
                    from films
                    where grossed > 100) as film
                   on film_directors.id = film.director_id
where film_directors.country = 'UK'
;