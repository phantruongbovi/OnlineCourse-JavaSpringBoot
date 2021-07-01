# OnlineCourse-JavaSpringBoot

1. How to install postgres and create new database
  - Install postgresql:
    https://phoenixnap.com/kb/how-to-install-postgresql-on-ubuntu
  - Create new database:
  Open postgres cmd: 
  ```
  sudo su - postgres
  psql
  ```
  Create new database:
  ```
  \l \\check list of databases
  CREATE DATABASE $name (ex: name = student)
  GRANT ALL PROVOLEGES ON DATABASE "student" TO postgres;
  \c student //connecting to database student
  ALTER USER postgres PASSWORD '123456';
  ```
