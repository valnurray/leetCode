# Write your MySQL query statement below
SELECT empl.name AS employee
FROM Employee empl
JOIN Employee mng ON empl.managerId = mng.id
WHERE empl.salary > mng.salary;