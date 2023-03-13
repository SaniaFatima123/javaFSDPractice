package exceptionTask.com.traningapps.jobapp.jobms;

public interface IJobService {
    Job findById(long id) throws InvalidIdEcxeption, JobNotFoundException;
    Job[] findAll();
}
