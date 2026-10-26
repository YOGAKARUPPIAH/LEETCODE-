# Write your MySQL query statement below
SELECT PLAYER_ID, min(EVENT_DATE) AS FIRST_LOGIN
FROM ACTIVITY
group by player_id