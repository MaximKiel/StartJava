  SELECT *
    FROM jaegers;

  SELECT *
    FROM jaegers
   WHERE status = 'Existing';

  SELECT *
    FROM jaegers
   WHERE mark = 'Mark-4'
      OR mark = 'Mark-6';

  SELECT *
    FROM jaegers
ORDER BY mark;

  SELECT *
    FROM jaegers
   WHERE launch = (SELECT min(launch) FROM jaegers);

  SELECT *
    FROM jaegers
   WHERE kaijuKill = (SELECT max(kaijuKill) FROM jaegers);

  SELECT *
    FROM jaegers
   WHERE kaijuKill = (SELECT min(kaijuKill) FROM jaegers);

  SELECT avg(weight)
    FROM jaegers;

  UPDATE jaegers
     SET kaijuKill = kaijuKill + 1
   WHERE status = 'Existing';

  DELETE
    FROM jaegers
   WHERE status = 'Destroyed';