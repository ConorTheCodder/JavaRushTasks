-- Write your code here:
SELECT CONCAT(city, ' - ', CHAR_LENGTH(city))
FROM cities
ORDER BY CHAR_LENGTH(city)
LIMIT 3;