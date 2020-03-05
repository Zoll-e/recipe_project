
set up mysql server inside docker for the project:
  (in unix based operating systems)

  $ docker run --name mysql -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=YES -d mysql (create mysql server)

  $ docker exec -it mysql bash (jump into to the running mysql instance)

  (create the user)
  mysql> CREATE USER 'sfg_dev_user'@'localhost' IDENTIFIED BY 'deze';
  mysql> GRANT ALL PRIVILEGES ON *.* TO 'sfg_dev_user'@'localhost';

  (create the database)

  mysql> create table category (id bigint not null auto_increment, description varchar(255), primary key (id)) engine=InnoDB;
  mysql> create table ingredient (id bigint not null auto_increment, amount decimal(19,2), description varchar(255), recipe_id      bigint, unit_of_measure_id bigint, primary key (id)) engine=InnoDB;
  mysql> create table notes (id bigint not null auto_increment, recipe_notes longtext, recipe_id bigint, primary key (id))          engine=InnoDB;
  mysql> create table recipe (id bigint not null auto_increment, cook_time integer, description varchar(255), difficulty            varchar(255), directions longtext, image longblob, prep_time integer, servings integer, source varchar(255), url              varchar(255), notes_id bigint, primary key (id)) engine=InnoDB;
  mysql> create table recipe_category (recipe_id bigint not null, category_id bigint not null, primary key (recipe_id,                category_id)) engine=InnoDB;
  mysql> create table unit_of_measure (id bigint not null auto_increment, description varchar(255), primary key (id))               engine=InnoDB;
  mysql> alter table ingredient add constraint FKj0s4ywmqqqw4h5iommigh5yja foreign key (recipe_id) references recipe (id);
  mysql> alter table ingredient add constraint FK15ttfoaomqy1bbpo251fuidxw foreign key (unit_of_measure_id) references              unit_of_measure (id);
  mysql> alter table notes add constraint FKdbfsiv21ocsbt63sd6fg0t3c8 foreign key (recipe_id) references recipe (id);
  mysql> alter table recipe add constraint FK37al6kcbdasgfnut9xokktie9 foreign key (notes_id) references notes (id);
  mysql> alter table recipe_category add constraint FKqsi87i8d4qqdehlv2eiwvpwb foreign key (category_id) references category          (id);
  mysql> alter table recipe_category add constraint FKcqlqnvfyarhieewfeayk3v25v foreign key (recipe_id) references recipe           (id);


_________________________________________________________________________________________________________


cd into project folder 

$ mvn spring-boot:start -Dspring-boot.run.profiles=dev



