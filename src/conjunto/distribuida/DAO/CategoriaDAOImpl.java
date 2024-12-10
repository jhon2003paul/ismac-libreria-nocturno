package conjunto.distribuida.DAO;

import conjunto.distribuida.entities.Categoria; 
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOImpl implements CategoriaDAO {
    private List<Categoria> categorias = new ArrayList<>();

    @Override
    public void insertar(Categoria categoria) {
        categorias.add(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        Categoria existente = obtenerPorId(categoria.getIdCategoria());
        if (existente != null) {
            existente.setDescripcion(categoria.getDescripcion());
        }
    }

    @Override
    public void eliminar(int id) {
        categorias.removeIf(categoria -> categoria.getIdCategoria() == id);
    }

    @Override
    public Categoria obtenerPorId(int id) {
        return categorias.stream()
                .filter(categoria -> categoria.getIdCategoria() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Categoria> obtenerTodos() {
        return new ArrayList<>(categorias); 
    }
}