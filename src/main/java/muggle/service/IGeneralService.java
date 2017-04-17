package muggle.service;


import entity.params.Parent;
import entity.params.Teacher;

/**
 * Created by JuN on 2017/4/17.
 */
public interface IGeneralService {

    public abstract String login(String phone,String password);

    public abstract String registerTeacher(Teacher teacher);

    public abstract String registerParent(Parent parent,String studentId);

}