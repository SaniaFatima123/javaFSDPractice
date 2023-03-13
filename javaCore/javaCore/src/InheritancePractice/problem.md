inheritance task
base package com.traningapps.employeems
subpackages :
employeems
departmentms
ui

employeems
Employee{
id: long
name:String,
age:int,
country:String
salary:double
Department: department

}


TechnicalEmployee extends Employee{

language: String

codingExperienceInYrs :int

}


NonTechnicalEmployee extends Employee{

skill: String

experienceWithSkillInYrs: int

}


EmployeeStorage{

//keep Employees array here

+addTechnicalEmployee(*) : void

+addNonTechnicalEmployee(*) :void

+findEmployeeByeById(*) :Employee

+findEmployeeByDepartmentType(*) : Employee[]

+findAll(*) : Employee[];


}
departmentms
Department{

id: String
name: String,
noOfEmployee:int


}                  
Features
Add employees
find employee by id
find employees by type
Please Note
Fields should be private
Use getters setters