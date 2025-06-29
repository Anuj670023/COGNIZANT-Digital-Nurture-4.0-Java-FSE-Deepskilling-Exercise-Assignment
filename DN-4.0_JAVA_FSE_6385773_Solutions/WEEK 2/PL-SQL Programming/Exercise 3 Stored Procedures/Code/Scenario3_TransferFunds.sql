CREATE OR REPLACE PROCEDURE TransferFunds (
    source_acc_id IN NUMBER,
    dest_acc_id IN NUMBER,
    transfer_amount IN NUMBER
) AS
    v_source_balance NUMBER;
BEGIN
    SELECT Balance INTO v_source_balance
    FROM Accounts
    WHERE AccountID = source_acc_id;

    IF v_source_balance < transfer_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
        RETURN;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - transfer_amount,
        LastModified = SYSDATE
    WHERE AccountID = source_acc_id;

    UPDATE Accounts
    SET Balance = Balance + transfer_amount,
        LastModified = SYSDATE
    WHERE AccountID = dest_acc_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Invalid account ID.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

--for execution of the procedure and the transfer of funds
EXEC TransferFunds(1, 2, 500);