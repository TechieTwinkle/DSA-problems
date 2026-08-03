-- Last updated: 04/08/2026, 01:36:28
# Write your MySQL query statement below
select name from customer where referee_id is null or referee_id not in (2) ;