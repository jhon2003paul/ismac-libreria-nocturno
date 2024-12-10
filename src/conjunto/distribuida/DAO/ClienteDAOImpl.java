package conjunto.distribuida.DAO;

import conjunto.distribuida.entities.Cliente; 
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void insertar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void actualizar(Cliente cliente) {
        Cliente existente = obtenerPorId(cliente.getIdCliente()); 
        if (existente != null) {
            existente.setCedula(cliente.getCedula());
            existente.setNombre(cliente.getNombre());
            existente.setApellido(cliente.getApellido());
            existente.setDireccion(cliente.getDireccion());
            existente.setTelefono(cliente.getTelefono());
            existente.setCorreo(cliente.getCorreo());
        }
    }

    @Override
    public void eliminar(int id) {
        clientes.removeIf(cliente -> cliente.getIdCliente() == id); 
    }

    @Override
    public Cliente obtenerPorId(int id) {
        return clientes.stream()
                .filter(cliente -> cliente.getIdCliente() == id) 
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return new ArrayList<>(clientes); 
    }
}