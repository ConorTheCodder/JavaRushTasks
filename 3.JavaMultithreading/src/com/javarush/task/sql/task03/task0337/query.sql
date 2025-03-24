-- Write your code here:
SELECT authors.*
FROM authors
WHERE authors.author_id <> (SELECT books.author_id
                            FROM books
                            WHERE author_id = 7
                              AND title = 'War and Peace')
