-----------------------------------------------------
-- Scenario 1
-- Apply 1% discount on loan interest for customers
-- above 60 years
-----------------------------------------------------

DECLARE
    CURSOR cust_cursor IS
        SELECT c.CustomerID, l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE c.Age > 60;
BEGIN
    FOR rec IN cust_cursor LOOP

        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE(
            'Interest updated for Customer ID: '
            || rec.CustomerID
        );

    END LOOP;

    COMMIT;
END;
/
