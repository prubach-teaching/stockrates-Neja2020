# CP_2020_HW3

1. Please download CSV files containing the stock history of some companies, for example:
http://finance.yahoo.com/q/hp?s=GOOG
http://finance.yahoo.com/q/hp?s=IBM
http://finance.yahoo.com/q/hp?s=MSFT

Code that automatically downloads these files into the ``data_in`` folder is already provided.

2. Write a program that for every one of those CSV files with stock rates in the ``data_in`` does:

3. Calculates the percentage change between Close and Open price and adds these values as a new column thus creating
 a new CSV file with the same name as the original one and saving it to the ``data_out`` folder

Change = (Close-Open)/Open)
