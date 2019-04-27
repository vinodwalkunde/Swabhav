CREATE TABLE Customer(
CID Int NOT NULL Primary Key,
Balance INT NOT NULL,
Name VARCHAR(20) NOT NULL
);

select * from Customer;

CREATE TABLE Merchant(
MID Int NOT NULL Primary Key,
Balance INT NOT NULL,
Name VARCHAR(20) NOT NULL
);

select * from Merchant;

INSERT INTO Customer Values(101,1000,'Vinod'
);
INSERT INTO Customer Values(102,5000,'Ajay'
);
INSERT INTO Merchant Values(201,10000,'Kuntan'
);
INSERT INTO Merchant Values(202,1000,'Prachit'
);

Update Customer 
set Balance=Balance+500
where CID=101;