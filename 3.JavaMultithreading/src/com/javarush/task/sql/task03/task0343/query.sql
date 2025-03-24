-- Write your code here:
select film_directors.full_name
from film_directors
          left join (select title, director_id
                    from films
                    where genre = 'comedy') as f
                   on film_directors.id = f.director_id
;


#   SELECT fd.full_name, f.title
# FROM film_directors fd
# LEFT JOIN (
#     SELECT title, director_id
#     FROM films
#     WHERE genre = 'comedy'
# ) f ON fd.id = f.director_id;
