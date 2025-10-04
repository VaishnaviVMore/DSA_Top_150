# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee 
Where salary NOT IN (SELECT MAX(salary) FROM Employee);
