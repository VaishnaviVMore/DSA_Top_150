# Write your MySQL query statement below
SELECT worker.name AS Employee 
FROM Employee AS worker
INNER JOIN Employee AS manager
ON (worker.managerId=manager.Id)
WHERE worker.salary>manager.salary;