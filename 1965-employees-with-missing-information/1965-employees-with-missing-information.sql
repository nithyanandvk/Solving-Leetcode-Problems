# Write your MySQL query statement below

select employee_id
from
(
    select e.employee_id as employee_id,
           e.name,
           s.salary
    from Employees e
    left join Salaries s
    on e.employee_id = s.employee_id

    union

    select s.employee_id as employee_id,
           e.name,
           s.salary
    from Employees e
    right join Salaries s
    on e.employee_id = s.employee_id
) as full_joined
where name is null or salary is null
order by employee_id;