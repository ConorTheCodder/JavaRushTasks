-- Write your code here:
UPDATE author
SET full_name = 'Clive Staples Lewis'
WHERE full_name = 'C. S. Lewis';

UPDATE author
SET full_name = 'John Ronald Reuel Tolkien'
WHERE full_name = 'J.R.R. Tolkien';

UPDATE author
SET full_name = 'Friedrich Wilhelm Nietzsche'
WHERE full_name = 'Friedrich Nietzsche';

UPDATE author
SET full_name = 'Stephen Edwin King'
WHERE full_name = 'Stephen King';

UPDATE author
SET full_name = 'Aldous Leonard Huxley'
WHERE full_name = 'Aldous Huxley';

/*
 UPDATE author
SET full_name = CASE
    WHEN full_name = 'C. S. Lewis' THEN 'Clive Staples Lewis'
    WHEN full_name = 'J.R.R. Tolkien' THEN 'John Ronald Reuel Tolkien'
    WHEN full_name = 'Friedrich Nietzsche' THEN 'Friedrich Wilhelm Nietzsche'
    WHEN full_name = 'Stephen King' THEN 'Stephen Edwin King'
    WHEN full_name = 'Aldous Huxley' THEN 'Aldous Leonard Huxley'
END
WHERE full_name IN ('C. S. Lewis', 'J.R.R. Tolkien',
 'Friedrich Nietzsche', 'Stephen King', 'Aldous Huxley');
 */