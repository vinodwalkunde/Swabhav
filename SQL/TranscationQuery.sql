create table Foo(
id int primary key,
description int
);

select * from Foo;

insert into Foo values(101,101);
insert into Foo values(102,102);

BEGIN TRAN
	select * from Foo;
	INSERT INTO Foo VALUES (103,103);
	INSERT INTO Foo VALUES (104,104);
	select * from Foo;
ROLLBACK;
	select * from Foo;
	

