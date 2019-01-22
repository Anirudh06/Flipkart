# Flipkart

## Database Tables
1. Table Name : BUYER_INFORMATION
   Description : Contains User Informations entered by user during registration.
   Columns:  1. SKEY (Surrogate Key)(INT-10): Primary Key, Not Null, Unsigned, Auto Increment
             2. USER_NAME(VARCHAR-45): Primary Key, Not Null, Unique
             3. NAME(VARCHAR-45): Not Null
             4. EMAIL(VARCHAR-45): Not Null, Unique
             5. PASSWORD(VARCHAR-45): Not Null
             6. DOB(DATE): Not Null
             
             
## Variable Names to be used in parameter for registration and login
  userName,name,email,password,dOB
  
## Status Returned in Registration
  status = 0 :: success
  status = 1 :: User name already exist
  status = 2 :: Email Id already exist
  status = 3 :: Server side error
  
## Status Returned in Login
  res = JSON object(User Information)
  res = 1 :: Password not matching.
  res = 2 :: User name not present in the database.
  res = 3 :: Server side Error.
          
