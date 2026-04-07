# Write your MySQL query statement below
with cte as (
    select stock_name, operation, sum(price) as total
    from Stocks
    group by stock_name, operation
)select stock_name, SUM(
        CASE 
            WHEN operation = 'Buy' THEN -total
            ELSE total
        END
    ) as capital_gain_loss from cte group by stock_name;