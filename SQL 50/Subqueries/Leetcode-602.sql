# Write your MySQL query statement below
WITH all_users AS (
    SELECT requester_id AS user_id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS user_id FROM RequestAccepted
)

SELECT user_id AS id, COUNT(user_id) AS num 
FROM all_users
GROUP BY user_id
ORDER BY num DESC
LIMIT 1