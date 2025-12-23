# Write your MySQL query statement below
select r.contest_id, ROUND(COUNT(r.contest_id) * 100 / (select COUNT(user_id) from Users), 2) as percentage
from Users u
right join Register r
on u.user_id = r.user_id
group by r.contest_id
order by percentage desc, r.contest_id