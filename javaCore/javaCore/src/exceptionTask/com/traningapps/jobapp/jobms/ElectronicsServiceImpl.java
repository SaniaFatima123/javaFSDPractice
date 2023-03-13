package exceptionTask.com.traningapps.jobapp.jobms;

public class ElectronicsServiceImpl extends AbstractJobService implements IElectronicsJob{

    public ElectronicsServiceImpl(int capacity){
        super(capacity);
    }


    @Override
    public ElectronicsJob addJob(ElectronicsJob electronicsJob) {
        Job job = super.addJob(electronicsJob);
        return (ElectronicsJob) job;
    }

    @Override
    public ElectronicsJob findById(long id) throws InvalidIdEcxeption, JobNotFoundException {
        if(id<0){
            throw new InvalidIdEcxeption("ID is invalid");
        }
        Job job = super.findJobById(id);
        if(job==null){
            throw new JobNotFoundException("Job is not found");
        }
        return (ElectronicsJob) job;
    }

    @Override
    public ElectronicsJob[] findAll(){
        ElectronicsJob[] foundAll = new ElectronicsJob[5];
        int index = 0;
        Job[] jobs = super.findAll();
        for(Job job:jobs){
            if(job!=null && index< foundAll.length){
                foundAll[index] = (ElectronicsJob) job;
                index++;
            }
        }
        return foundAll;
    }
}
