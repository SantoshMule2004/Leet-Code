# Write your MySQL query statement below
select p.product_id, IFNULL(ROUND(SUM(p.price*s.units) / SUM(s.units), 2), 0) AS average_price
from Prices p
Left join UnitsSold s
on p.product_id = s.product_id
and s.purchase_date between p.start_date and p.end_date
group by p.product_id