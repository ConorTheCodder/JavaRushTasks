-- Write your code here:
SELECT *
FROM authors
WHERE author_id IN (
    SELECT author_id
    FROM books
    WHERE genre = 'fantasy'
);