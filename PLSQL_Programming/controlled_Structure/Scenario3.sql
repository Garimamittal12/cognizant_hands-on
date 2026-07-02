-----------------------------------------------------
-- Scenario 3
-- Loan Reminder
-----------------------------------------------------

DECLARE

CURSOR loan_cursor IS

SELECT c.Name,
       l.DueDate

FROM Customers c

JOIN Loans l

ON c.CustomerID=l.CustomerID

WHERE l.DueDate BETWEEN SYSDATE
AND SYSDATE+30;

BEGIN

FOR rec IN loan_cursor LOOP

DBMS_OUTPUT.PUT_LINE(

'Reminder: '

||rec.Name||

' Loan Due on '

||TO_CHAR(rec.DueDate,'DD-MON-YYYY')

);

END LOOP;

END;
/