SET SERVEROUTPUT ON;

DECLARE
    v_age NUMBER;
BEGIN
    FOR rec IN (
        SELECT c.CustomerID, l.LoanID, l.InterestRate,
            TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) AS Age
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    ) LOOP
        v_age := rec.Age;
        
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Interest rate updated for Customer ID ' || rec.CustomerID);
        END IF;
    END LOOP;
END;
/