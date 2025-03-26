-- Write your code here:
SELECT *
FROM films
         JOIN (SELECT film_directors.year_born, test.film_directors.id
               FROM film_directors
               WHERE film_directors.year_born < 1940) AS director
              ON director.id = films.director_id
WHERE genre = 'sci-fi'
;

-- проверено