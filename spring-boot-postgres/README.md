
mvn clean package -DskipTests





		
  docker run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=users -d -p 5432:5432 postgres
	docker run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=users -d --network host postgres
	
	
	docker run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=users -d -p 5432:5432 --mount type=bind,target=/var/lib/postgresql/data,source=C:\Users\angelfidelino.lopez\Documents\Fidelino\Myvolume postgres
	
	docker run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=users -d -p 5432:5432 -v \C\Users\angelfidelino.lopez\Documents\Fidelino\Myvolume:/var/lib/postgresql/data postgres
	
	docker run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=users -d -p 5432:5432 --mount type=bind,source=postgres_volume,target=/var/lib/postgresql/data postgres
  
  docker exec -it 05b3a3471f6f bash
	psql -U postgres
	psql -h localhost -U postgres
  
  
  docker run -p 8080:8080 --link postgres:postgres demo
  docker run -p 8080:8080 --link postgres:postgres demo
  
  mvn clean package -DskipTests
  
  CREATE DATABASE aflr
  USE aflr
  
  
  USE aflr
  
  \dn
  

  CREATE TABLE users (
   user_id INT NOT NULL,
   first_name VARCHAR(45) NOT NULL,
   last_name VARCHAR(45) NOT NULL,
   age INT NOT NULL,
   PRIMARY KEY (user_id));
   
  ======
  CREATE SCHEMA aflr;
  CREATE TABLE aflr.users (
   user_id INT NOT NULL,
   first_name VARCHAR(45) NOT NULL,
   last_name VARCHAR(45) NOT NULL,
   age INT NOT NULL,
   PRIMARY KEY (user_id));