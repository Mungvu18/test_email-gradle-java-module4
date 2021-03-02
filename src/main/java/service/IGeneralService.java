package service;

import java.util.List;

public interface IGeneralService <T>{
    List<T> findAll();
    boolean save(T t);
    boolean edit(int id, T t);
    boolean delete(int id);
    T findById(int id);
}
