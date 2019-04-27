DROP TABLE EMP;
DROP TABLE DEPT;

CREATE TABLE DEPT (
 DEPTNO              integer NOT NULL,
 DNAME               varchar(14),
 LOC                 varchar(13),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE EMP (
 EMPNO               integer NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer CONSTRAINT EMP_SELF_KEY REFERENCES EMP (EMPNO),
 HIREDATE            DATEtime,
 SAL                 money,
 COMM                money,
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'17-NOV-81',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1-MAY-81',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'9-JUN-81',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'2-APR-81',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'20-FEB-81',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'8-SEP-81',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'3-DEC-81',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'22-FEB-81',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'3-DEC-81',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'17-DEC-80',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'09-DEC-82',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'12-JAN-83',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'23-JAN-82',1300,NULL,10);

select * from EMP;

select * from DEPT;

--Display EMP Name--

select ENAME from EMP;

--Display Emp Name in Lower Case--

select LOWER(ENAME) From EMP;

--Display Emp Name in ascending--

select ENAME from EMP
Order By ENAME asc;

--Display Emp Name in descanding--

select Ename from EMP
Order By ENAME desc;

--Display DeptNo from EMP--

select Deptno from EMP;

--Display Unique deptno from EMP--

select DISTINCT Deptno from EMP;

--Display Ename,salary of king--

select Ename,sal from EMP
where ENAME='KING';

--Display empname in dept 10--

select Ename from EMP
where DEPTNO=10;

--Display All emp whose name start with S--

select Ename from EMP
where ENAME Like 's%';

--Display All emp whose name ends with N--

select Ename from EMP
where ENAME Like '%N';

--Display All employee commision null--

select Ename from EMP
where COMM is null;

--Display employee whose are dept 10 and 20--

select * from EMP
where DEPTNO =10 Or deptno=20;

--Display salary commssion,ctc of all employee--

select sal,COMM,(SAL+COMM)as CTC from EMP

--Display all emp whose are clerk--

select * from EMP
where JOB='CLERK';

--Display Current Date--

select GETDATE();
SELECT CURRENT_TIMESTAMP;

--Display employee who are 'Analyst'&'Manager'--

select * from EMP
where JOB in ('Analyst','Manager');

--Display Joingdate and expri--

select DATEDIFF(year, hiredate, CURRENT_TIMESTAMP) AS exper from EMP; 

--employee whose work in same deptment of smith--

select * from EMP
where DEPTNO=(
select DEPTNO from EMP 
where ENAME='smith');

--employee whose has same salary of scott--

select * from EMP
where SAL=(
select SAL from EMP
where ENAME='scott'
);

--employee who has same designation of bleak--

select * from EMP
where JOB=(
select JOB from EMP
where ENAME='Blake'
);

--Display sum,count and avg of salary--

select AVG(sal)as Average,SUM(sal)as Sum,Count(EMPNO)as Count from EMP;

--departmentwise count--

select DEPTNO,COUNT(EMPNO)as count from EMP
group by DEPTNO;

--jobwise number of employee count--

select JOB,COUNT(EMPNO)as count from EMP
group by JOB;

-- which depatrment has maximun no of employee--

select Top(1)COUNT(deptno)as DeptmentCount from EMP
group by DEPTNO
order by DeptmentCount desc;

--select top three salary emp--

select Top(3)SAL from EMP
order by SAL desc;

--departmnet count greater than 3--

select COUNT(deptno)as DeptmentCount from EMP
group by DEPTNO
having COUNT(deptno)>3;

--inner Join--

select emp.ENAME,dept.DNAME from EMP 
inner join DEPT on EMP.DEPTNO=DEPT.deptno;

--Deptname wise count--

select Dname,COUNT(EMPNO)as Count from EMP
inner join DEPT on EMP.DEPTNO=DEPT.deptno
group by DNAME;

--display name and bossname--

select x.ename as Name,y.ename as Boss from EMP as x
inner join EMP as y on x.MGR=y.EMPNO;

--join 3 table--

select x.ename as Name,y.ename as Boss ,dname as DepartmentName from EMP as x
inner join EMP as y on x.MGR=y.EMPNO
inner join DEPT on x.DEPTNO=DEPT.DEPTNO;

--display deptname and emp name--

select DEPT.DNAME,EMP.ENAME from emp
left join dept on dept.DEPTNO=EMP.DEPTNO;


--display deptname and empname having null value--

select DEPT.DNAME,EMP.ENAME from emp
right join dept on dept.DEPTNO=EMP.DEPTNO
where ENAME is null;
