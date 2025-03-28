-- Write your code here:
SELECT a.full_name, COUNT(DISTINCT p.name)
FROM book b
         RIGHT JOIN author a ON b.author_id = a.id
         RIGHT JOIN publisher p ON b.publisher_id = p.id
GROUP BY a.full_name
;

/*
 SELECT
    a.full_name,
    COUNT(DISTINCT b.publisher_id) AS publishers
FROM
    author a
LEFT JOIN
    book b ON a.id = b.author_id
GROUP BY
    a.id, a.full_name
ORDER BY
    publishers DESC, a.full_name;
 */