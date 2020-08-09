package lk.ijse.schoolSystem.bo.custom;

import lk.ijse.schoolSystem.bo.SuperBo;
import lk.ijse.schoolSystem.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBo {

    public boolean saveStudent(StudentDTO dto) throws Exception;

    public StudentDTO getStudent(String id) throws Exception;

    public boolean updateStudent(StudentDTO dto) throws Exception;

    public boolean deleteStudent(String id) throws Exception;

    public List<StudentDTO> getAllStudents() throws Exception;

}
