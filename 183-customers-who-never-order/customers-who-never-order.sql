# Write your MySQL query statement below
Select c.name AS Customers
From Customers As c
LEFT JOIN Orders As o
ON c.id=o.customerId
Where o.id IS NULL;