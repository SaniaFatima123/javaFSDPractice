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


abstract BaseStudentService{
//keep students array here

+addStudent(Student student) : void

+findStudentById(*) : Student

+findStudentsByName(*) : Student[]

+findAll(*) : Student[]
}

CseStudentService extends BaseStudentService{

+addStudent(Student student) : void

+findStudentById(*) : CseStudent

+findStudentsByName(*) : CseStudent[]


}

EceStudentService extends BaseStudentService{

+addStudent(Student student) : void

+findStudentById(*) : EceStudent

+findStudentsByName(*) : EceStudent[]

}
departmentms
Department{

id: String

name: String


}                  
Features
Add student
find student by id
change department
Please Note
Fields should be private
Use getters setters