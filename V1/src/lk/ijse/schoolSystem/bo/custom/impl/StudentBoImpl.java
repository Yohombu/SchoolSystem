package lk.ijse.schoolSystem.bo.custom.impl;

import lk.ijse.schoolSystem.bo.custom.StudentBO;
import lk.ijse.schoolSystem.dao.DaoFactory;
import lk.ijse.schoolSystem.dao.custom.StudentDAO;
import lk.ijse.schoolSystem.db.HibernateUtil;
import lk.ijse.schoolSystem.dto.StudentDTO;
import lk.ijse.schoolSystem.entity.Student;
import org.hibernate.Session;

import java.util.List;

public class StudentBoImpl implements StudentBO {

    StudentDAO studentDAO = DaoFactory.getInstance().getDao(DaoFactory.DaoType.STUDENT); //type inference

    @Override
    public boolean saveStudent(StudentDTO dto) throws Exception {

        try (Session session = HibernateUtil.getSession()) {
            studentDAO.setSession(session);
            session.beginTransaction();
            boolean isSaved = studentDAO.save(new Student(dto.getId(), dto.getName(), dto.getAddress(), dto.getAge()));
            session.getTransaction().commit();
            return isSaved;
        }
    }

    @Override
    public StudentDTO getStudent(String id) throws Exception {
        try (Session session = HibernateUtil.getSession()) {
            studentDAO.setSession(session);
            session.beginTransaction();
            Student student = studentDAO.get(id);
            session.getTransaction().commit();

            return new StudentDTO(student.getId(), student.getName(), student.getAddress(), student.getAge());
        }
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) throws Exception {
        return false;
    }

    @Override
    public List<StudentDTO> getAllStudents() throws Exception {
        return null;
    }
}
