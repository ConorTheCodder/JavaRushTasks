-- Write your code here:

SELECT city
FROM cities
ORDER BY CHAR_LENGTH(city) DESC
LIMIT 3;

/* Сделал с помощью Чата. Сам сначала думал считать как-то
   через AVG() и COUNT(), потом забросил попытки.
 */