-- Write your code here:
select year_born
from authors
where authors.year_born <= (select max(books.date_released) from books)
;

-- задача выполнена