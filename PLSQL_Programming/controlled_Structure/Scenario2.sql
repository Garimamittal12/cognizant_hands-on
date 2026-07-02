-----------------------------------------------------
-- Scenario 2
-- Promote customers to VIP
-----------------------------------------------------

DECLARE
    CURSOR vip_cursor IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN

    FOR rec IN vip_cursor LOOP

        UPDATE Customers
        SET IsVIP='TRUE'
        WHERE CustomerID=rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Customer '
            || rec.CustomerID
            || ' promoted to VIP.'
        );

    END LOOP;

    COMMIT;

END;
/
