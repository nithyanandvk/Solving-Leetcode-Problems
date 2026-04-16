# Write your MySQL query statement below
with cte as (
    select *, count(*) over(partition by employee_id) as freq from Employee
)select employee_id, department_id from cte where freq=1 or (primary_flag='Y' and freq > 1);
