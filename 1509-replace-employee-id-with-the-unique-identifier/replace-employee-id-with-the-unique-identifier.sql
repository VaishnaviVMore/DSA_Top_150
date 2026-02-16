# Write your MySQL query statement below
SELECT emu.unique_id , em.name
FROM Employees em
LEFT JOIN EmployeeUNI emu
ON em.id=emu.id;