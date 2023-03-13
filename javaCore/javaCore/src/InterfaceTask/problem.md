base package com.traningapps.studentapp
subpackages :
studentms
departmentms
ui

studentms
Student{

id: long

name: String

department: Department

}


CseStudent extends Student{

language: String

codingExperienceInYrs :int

}


EceStudent extends Student{

deviceUsed: String

experienceWithDeviceInYrs: int

}


interface IStudentService{

findById(id) : Student


findAll(): Student[]


}

interface ICseStudentService{

addJob(id, type, language, experience ) : CseStudent

findById(id): CseStudent

findAll():CseStudent[]

}



interface IEceStudentService {

addJob(id, type, device, experience ) : EceStudent

findById(id): EceStudent

findAll(): EceStudent[]

}


abstract class  AbstractStudentService{
// Student array

addStudent(Student)

findStudentById(id)

findAll(): Student[]


}
Concrete implementation classes
CseStudentServiceImpl extends AbstractStudentService  implements ICseStudentService{
....
}
EceStudentServiceImpl extends AbstractStudentService  implements IEceStudentService{
..
}
departmentms
Department{

id: String

name: String


}                  
Features
Add student
find student by id
change student type
Please Note
Fields should be private
Use getters setters