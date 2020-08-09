package lk.ijse.schoolSystem.dao;

import lk.ijse.schoolSystem.dao.custom.impl.StudentDAOImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return (daoFactory == null) ? (daoFactory = new DaoFactory()) : (daoFactory);
    }

    public enum DaoType {
        STUDENT, TEACHER, BOOK, DESK
    }

    public <T> T getDao(DaoType type) {
        switch (type) {
            case STUDENT:
                return (T) new StudentDAOImpl();
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
