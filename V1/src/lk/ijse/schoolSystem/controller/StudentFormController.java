package lk.ijse.schoolSystem.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import lk.ijse.schoolSystem.bo.BoFactory;
import lk.ijse.schoolSystem.bo.custom.StudentBO;
import lk.ijse.schoolSystem.dto.StudentDTO;

public class StudentFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtAge;
    public TableView tbl;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colAge;

    private StudentBO studentBO = null;


    public void initialize() {
        studentBO = BoFactory.getInstance().getBoType(BoFactory.BoType.STUDENT);
    }


    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {

        StudentDTO studentDTO = new StudentDTO(txtId.getText(), txtName.getText(), txtAddress.getText(), Integer.parseInt(txtAge.getText()));
        if (studentBO.saveStudent(studentDTO)) {
            new Alert(Alert.AlertType.INFORMATION, "Saved!!", ButtonType.OK).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again!!", ButtonType.OK).show();
        }

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }
}
