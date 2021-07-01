# OnlineCourse-JavaSpringBoot

1. How to install postgres and create new database
1.1 Install postgresql
  https://phoenixnap.com/kb/how-to-install-postgresql-on-ubuntu
1.2 Create new database
  Open postgres cmd: 
  '''
  sudo su - postgres
  psql
  '''
  Create new database
  '''
  \l \\check list of databases
  CREATE DATABASE $name (ex: name = student)
  GRANT ALL PROVOLEGES ON DATABASE "student" TO postgres;
  \c student //connecting to database student
  '''
