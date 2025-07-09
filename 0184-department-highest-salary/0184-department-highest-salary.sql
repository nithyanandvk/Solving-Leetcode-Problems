# Write your MySQL query statement below
-- select department.name as Department, Employee.name as Employee, Employee.salary as Salary
-- from department,employee where employee.departmentId=department.id and salary in(select max(salary) from employee group by departmentId) ;

SELECT 
    d.name AS Department, 
    e.name AS Employee, 
    e.salary AS Salary
FROM 
    employee e
JOIN 
    department d ON e.departmentId = d.id
WHERE 
    e.salary = (
        SELECT MAX(salary)
        FROM employee
        WHERE departmentId = e.departmentId
    );
