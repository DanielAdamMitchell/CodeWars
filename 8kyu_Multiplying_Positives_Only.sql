/*
TASK
Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

Example:
n= 5, m=5: 25
n=-5, m=5:  0
*/

SELECT  n, m, 
CASE 
  WHEN n < 0 THEN 0
  WHEN m < 0 THEN 0
  ELSE (n*m) 
END
AS res
FROM paperwork;

--Realise i can put and OR statment

SELECT  n, m, 
CASE 
  WHEN n < 0 OR m < 0 THEN 0
  ELSE (n*m) 
END
AS res
FROM paperwork;

--Another interesting way i then learned

SELECT n, m, GREATEST(n, 0) * GREATEST(m, 0) AS res 
FROM paperwork;