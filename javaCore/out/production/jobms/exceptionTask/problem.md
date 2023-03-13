base package com.traningapps.jobapp
subpackages :
jobms
companyms
ui 


jobms
Job{

id: long

type: String

company: Company

}


ITJob extends Job{

language: String

codingExperienceInYrs :int

}


ElectronicsJob extends Job{

deviceUsed: String

experienceWithDeviceInYrs: int

}


interface IJobService{

findById(id) : Job throws JobNotFoundException


findAll(): Object[]


}

interface IITJobService{

addJob(id, type, language, experience ) : ITJob

findById(id): ITJob throws JobNotFoundException

findAll():ItJob[]

}



interface IElectronicsJobService {

addJob(id, type, device, experience ) : ElectronicsJob

findById(id): ElectronicsJob throws JobNotFoundException

findAll(): ElectronicsJob[]

}


abstract class  AbstractJobService{
// job array
//crud