package conjunto.distribuida.DAO;

import conjunto.distribuida.entities.Autor;
import java.util.List;

public interface AutorDAO {
    void insertar(Autor autor);
    void actualizar(Autor autor);
    void eliminar(int id);
    Autor obtenerPorId(int id);
    List<Autor> obtenerTodos();
}