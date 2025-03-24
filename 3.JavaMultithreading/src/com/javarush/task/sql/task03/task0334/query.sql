-- Write your code here:
select author.last_name as author,
       author.country   as author_country,
       book.genre       as book_genre
from test.authors as author
         left join test.books book
                   on author.author_id = book.author_id
where book.genre = 'fantasy'
group by author, author_country, book.genre
order by author_country ASC
limit 5
;