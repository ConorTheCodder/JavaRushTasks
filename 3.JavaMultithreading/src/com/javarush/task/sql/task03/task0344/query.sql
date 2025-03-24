-- Write your code here:
SELECT films.title
FROM films
         LEFT JOIN (SELECT director.last_name, director.id
                    FROM film_directors AS director
                    WHERE director.last_name = 'Spielberg') AS director
                   ON films.director_id = director.id
;