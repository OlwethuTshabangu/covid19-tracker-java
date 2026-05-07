USE master
GO
 
CREATE DATABASE CovidStats 
ON PRIMARY
 (
      NAME = 'CovidStats_data',
      FILENAME = 'C:\sql2023\CovidStats_data.mdf',
      SIZE = 5MB,
      FILEGROWTH = 10%
)
LOG ON
(
      NAME = 'CovidStats_log',
      FILENAME = 'C:\sql2023\CovidStats_log.ldf',
      SIZE = 5MB,
      FILEGROWTH = 10%
)
GO