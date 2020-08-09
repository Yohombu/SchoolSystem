package lk.ijse.schoolSystem.bo;

import lk.ijse.schoolSystem.bo.custom.impl.StudentBoImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance() {
        if (null == boFactory) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public enum BoType {
        STUDENT, TEACHER, BOOK, DESK
    }

    public <T> T getBoType(BoType boType) {
        switch (boType) {
            case STUDENT:
                return (T) new StudentBoImpl();
            case TEACHER:
                return null;
            case BOOK:
                return null;
            case DESK:
                return null;
            default:
                return null;
        }
    }
}
