insert into users values('admin','8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918',true);
insert into groups values(1,'GROUP_ADMIN');
insert into group_members values(1,'admin');
insert into group_authorities values(1,'ROLE_ADMIN');

insert into users values('user','04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb',true);
insert into groups values(2,'GROUP_USER');
insert into group_members values(2,'user');
insert into group_authorities values(2,'ROLE_USER');

commit;