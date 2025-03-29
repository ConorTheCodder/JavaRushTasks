-- Write your code here:
update employee
set salary = salary + 1000

WHERE id IN (
    SELECT DISTINCT employee_id
    FROM task
    WHERE exp_date > '2022-10-01'
);

