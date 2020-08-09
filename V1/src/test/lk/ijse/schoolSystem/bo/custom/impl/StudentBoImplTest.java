package lk.ijse.schoolSystem.bo.custom.impl;


import lk.ijse.schoolSystem.dto.StudentDTO;

class StudentBoImplTest {

    public static void main(String[] args) throws Exception {
        new StudentBoImplTest().saveStudent();
    }

    void saveStudent() throws Exception {
        new StudentBoImpl().saveStudent(
                new StudentDTO("001", "Nimal", "Colombo", 20)
        );
    }

}
