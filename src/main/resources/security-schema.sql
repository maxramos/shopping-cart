create table users(
username varchar_ignorecase(50) not null primary key,
password varchar_ignorecase(64) not null,
enabled boolean not null);
 
create table authorities(
username varchar_ignorecase(50) not null primary key,
authority varchar_ignorecase(50) not null,
constraint fk_authorities_users
foreign key(username) references users(username));
 
create table groups(
id bigint not null primary key,
group_name varchar_ignorecase(50) not null);
 
create table group_members(
group_id bigint not null,
username varchar_ignorecase(50) not null);
 
create table group_authorities(
group_id bigint not null,
authority varchar_ignorecase(50) not null); 