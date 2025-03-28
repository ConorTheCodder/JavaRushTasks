-- Write your code here:
INSERT INTO object(name, type, discoverer, discovery_date)
VALUES ( '2020 XL5', 'asteroid', 'Pan-STARRS 1', '2020-12-12'),
       ( 'Moon', 'satellite', NULL, NULL),
       ( 'Jupiter', 'planet', NULL, NULL),
       ( 'C/1910 A1', 'asteroid', 'Robert T.A. Innes', '1910-01-17');

SELECT *
FROM object;