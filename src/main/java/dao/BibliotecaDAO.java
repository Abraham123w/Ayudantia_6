package dao;

import model.Biblioteca;
import model.Libro;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;

import java.util.Date;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class BibliotecaDAO {

    /*Un método para buscar un libro en la base de datos por su autor.
	Un método para prestar un libro de la base de datos y actualizar la información en la base de datos.
	Un método para devolver un libro a la base de datos y actualizar la información en la base de datos.*/
    public static Libro buscarLibroPorAutor(DSLContext query, Object dato){
        // Buscar el libro en la base de datos
        Result resultados= (Result) buscarLibroPorAutor(query,"codigo",dato);

        // Extraer los valores de las columnas necesarias
        String titulo = (String) resultados.getValue(0,"codigo");
        String autor = (String) resultados.getValue(0,"nombre_carrera");
        Date fecha= (Date) resultados.getValue(0,"cantidad_semestres");
        String genero=(String)

        // Crear y devolver un objeto Carrera con los datos obtenidos
        // titulo,  autor,  fecha, genero
        return new Libro(nombreCarrera,codigoCarrera,cantidadSemestres);
    }
}