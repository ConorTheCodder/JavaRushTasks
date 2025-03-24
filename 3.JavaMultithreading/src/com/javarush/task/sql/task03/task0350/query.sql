-- Write your code here:
WITH tempTable(averageGrossed) AS (SELECT AVG(films.grossed)
                                   FROM films),
     tempTable2(average_year_released) AS (SELECT AVG(year_released)
                                           FROM films)
SELECT films.title,
       films.genre,
       films.year_released,
       films.grossed
FROM films,
     tempTable,
     tempTable2
WHERE films.grossed > tempTable.averageGrossed
  AND films.year_released > tempTable2.average_year_released
GROUP BY films.title,
         films.genre,
         films.year_released,
         films.grossed
;

-- в четвертом условии задания: там же нет этих колонок в tt и tt2