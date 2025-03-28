-- Write your code here:
SELECT full_name, COUNT(title) AS books_count
FROM book
         JOIN author ON book.author_id = author.id
GROUP BY author.full_name
HAVING books_count > 1
;