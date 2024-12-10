package conjunto.distribuida.DAO;

import conjunto.distribuida.entities.Categoria;
import java.util.List;

public interface CategoriaDAO {
    void insertar(Categoria categoria);
    void actualizar(Categoria categoria);
    void eliminar(int id);
    Categoria obtenerPorId(int id);
    List<Categoria> obtenerTodos();
}