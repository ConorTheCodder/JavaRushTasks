-- Write your code here:
SELECT name, position
FROM employee
WHERE DAYNAME(date_of_birth) = 'MONDAY'
;

/*
You should write 'Monday' (title case) to match the output
of DAYNAME(). In MySQL, DAYNAME() consistently returns day
names in title case (e.g., 'Monday', 'Tuesday'), not all
uppercase ('MONDAY') or all lowercase ('monday'). However,
MySQL’s string comparisons in WHERE clauses are case-insensitive
by default (unless the column or server is configured
otherwise), so 'MONDAY', 'Monday', or 'monday' will all
work functionally.

To be precise and match the function’s output convention,
use 'Monday'. Based on your data, this query would return
employees born on a Monday, like Tom ('1985-10-05') and
Mohamed ('1992-06-28'), since those dates are Mondays.
*/