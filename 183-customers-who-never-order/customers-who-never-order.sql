# Write your MySQL query statement below
SELECT NAME as Customers FROM customers
where id NOT IN (
    select customerid from orders
);