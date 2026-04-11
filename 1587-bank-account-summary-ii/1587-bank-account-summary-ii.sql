# Write your MySQL query statement below
with total as(
    select u.name, sum(t.amount) as balance
    from Users as u join 
    Transactions as t
    on u.account=t.account
    group by u.account, u.name
)
select * from total where balance > 10000;