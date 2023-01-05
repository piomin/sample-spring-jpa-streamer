-- Organization
insert into organization(name) values('Org1');
insert into organization(name) values('Org2');
-- Department
insert into department(name, organization_id) values('ddd', 1);
insert into department(name, organization_id) values('ccc', 1);
insert into department(name, organization_id) values('bbb', 2);
insert into department(name, organization_id) values('aaa', 2);
-- Employee
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test1', 'Developer', 10000, 25, 1, 1);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test2', 'Developer', 18000, 35, 2, 1);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test3', 'Tester', 10000, 25, 3, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test4', 'Developer', 25000, 45, 1, 1);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test5', 'Architect', 30000, 40, 3, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test6', 'Manager', 20000, 40, 3, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test7', 'Manager', 30000, 40, 4, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test8', 'Architect', 25000, 40, 1, 1);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test9', 'Developer', 30000, 40, 3, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test10', 'Tester', 11000, 40, 3, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test11', 'Developer', 13000, 40, 4, 2);
insert into employee(name, position, salary, age, department_id, organization_id) values ('Test12', 'Tester', 7000, 40, 4, 2);