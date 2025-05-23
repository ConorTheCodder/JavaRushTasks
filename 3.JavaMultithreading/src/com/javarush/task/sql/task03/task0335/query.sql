-- Write your code here:
select author.country      as author_country,
       count(book.book_id) as book_count
from authors as author
         join books as book
              on author.author_id = book.author_id
where book.genre = 'novel'
group by author.country
having book_count < 2
;