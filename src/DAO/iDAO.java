package DAO;

import java.util.List;

public interface iDAO <T>{

    T guardar(T t);
    List<T> ListarTodos();
}
