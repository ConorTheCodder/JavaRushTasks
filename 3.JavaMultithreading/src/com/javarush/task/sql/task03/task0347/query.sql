-- Write your code here:
select film_directors.*
from film_directors
         right join (select films.title, films.director_id
                     from films
                     where films.year_released > 1990) as film
                    on film_directors.id = film.director_id
where film_directors.country = 'USA'
limit 5
;






/*SELECT film_directors.*, film.title
FROM film_directors
RIGHT JOIN (
    SELECT title, director_id
    FROM films
    WHERE year_released > 1990
) AS film
ON film_directors.id = film.director_id
WHERE film_directors.country = 'USA'
LIMIT 5;*/