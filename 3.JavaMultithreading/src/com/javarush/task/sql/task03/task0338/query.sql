-- Write your code here:
SELECT *
FROM authors
WHERE authors.full_name NOT LIKE (
    SELECT CONCAT(first_name, ' ', last_name)
    FROM authors
    WHERE last_name = 'Shakespeare'
);