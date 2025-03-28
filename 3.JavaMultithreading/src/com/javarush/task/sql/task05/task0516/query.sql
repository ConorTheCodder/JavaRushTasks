-- Write your code here:
SELECT name
FROM part
/*WHERE (LENGTH(name) - LENGTH(REPLACE(name, 'Slope', ''))) / LENGTH('Slope') >= 2
   OR (LENGTH(name) - LENGTH(REPLACE(name, 'Clip', ''))) / LENGTH('Clip') >= 2; */

WHERE name NOT LIKE '%Slope%Slope%'
   OR name NOT LIKE '%Clip%Clip%'
;

-- Не сообразил без помощи Чата