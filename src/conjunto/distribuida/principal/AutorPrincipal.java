package conjunto.distribuida.principal;

import conjunto.distribuida.entities.Autor;

public class AutorPrincipal {

    public static void main(String[] args) {
        
        Autor autor = new Autor(1, "John", "Xavier", "Ecuador", "Calle la cruz", "220459823", "john3654@mail.com");
        
        Autor autor2 = new Autor(2, "Alejandro", "Imbaquingo", "Brasil", "Calle de dos pisos", "208794451", "alejandor65@gmail.com");
        // Imprimir la información del autor usando el método toString
        System.out.println(autor.toString());
        
        System.out.println(autor2.toString());
    }
}
