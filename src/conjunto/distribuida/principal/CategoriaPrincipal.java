package conjunto.distribuida.principal;

import conjunto.distribuida.entities.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] args) {
        // Crear algunas instancias de Categoria
       Categoria categoria1 = new Categoria(3,"Terror" );
       Categoria categoria2 = new Categoria(8,"Cocina,");
       Categoria categoria3 = new Categoria(9,"Acción,");
       
       // Imprimir las categorías utilizando el método toString
       System.out.println(categoria1.toString());
       System.out.println(categoria2.toString());
       System.out.println(categoria3.toString());
    }
}