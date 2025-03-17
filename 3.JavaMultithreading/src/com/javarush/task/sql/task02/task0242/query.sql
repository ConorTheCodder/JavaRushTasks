-- Write your code here:
select year(date_of_birth), month(date_of_birth), count(id)
from employee
group by year(date_of_birth), month(date_of_birth)
;

-- не понял, что от меня хотят в задании. Не уверен, правильно ли выполнил