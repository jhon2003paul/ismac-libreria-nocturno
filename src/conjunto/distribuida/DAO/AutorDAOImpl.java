package conjunto.distribuida.DAO;

import conjunto.distribuida.entities.Autor; 
import java.util.ArrayList;
import java.util.List;

public class AutorDAOImpl implements AutorDAO {
    private List<Autor> autores = new ArrayList<>();

    @Override
    public void insertar(Autor autor) {
        autores.add(autor);
    }

    @Override
    public void actualizar(Autor autor) {
        Autor existente = obtenerPorId(autor.getIdAutor());
        if (existente != null) {
            existente.setNombre(autor.getNombre());
            existente.setApellido(autor.getApellido());
            existente.setPais(autor.getPais());
            existente.setDireccion(autor.getDireccion());
            existente.setTelefono(autor.getTelefono());
            existente.setCorreo(autor.getCorreo());
        }
    }

    @Override
    public void eliminar(int id) {
        autores.removeIf(autor -> autor.getIdAutor() == id);
    }

    @Override
    public Autor obtenerPorId(int id) {
        return autores.stream()
                .filter(autor -> autor.getIdAutor() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Autor> obtenerTodos() {
        return new ArrayList<>(autores); // Retorna una copia de la lista
    }
}