package exceptionTask.com.traningapps.jobapp.jobms;

public class ITJobServiceImpl extends AbstractJobService implements IITJobService{
    public ITJobServiceImpl(int capacity){
        super(capacity);
    }


    @Override
    public ITJob addJob(ITJob itJob) {
        Job job = super.addJob(itJob);
        return (ITJob) job;
    }

    @Override
    public ITJob findById(long id) throws InvalidIdEcxeption, JobNotFoundException {
        if(id<0){
            throw new InvalidIdEcxeption("ID is invalid");
        }
        Job job = super.findJobById(id);
        if(job==null){
            throw new JobNotFoundException("Job is not found");
        }
        return (ITJob) job;
    }

    @Override
    public ITJob[] findAll(){
        ITJob[] foundAll = new ITJob[5];
        int index = 0;
        Job[] jobs = super.findAll();
        for(Job job:jobs){
            if(job!=null && index< foundAll.length){
                foundAll[index] = (ITJob) job;
                index++;
            }
        }
        return foundAll;
    }
}
