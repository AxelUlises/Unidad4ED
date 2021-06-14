/**
 *
 * @author axelulises
 */
public class ÁrbolGeneral {
    NodoGeneral raíz;
    
    public ÁrbolGeneral(){
        raíz = null;
    }
    
    public boolean insertar(char dato, String path){
        /*
            1. Raíz es null
            2. Path vacío
            3. Buscar padre (Siempre que no exista otro con el mismo nombre
            4. Crear hijo 
            5. Enlazar padre con hijo
        */
        if(raíz == null){
            raíz = new NodoGeneral(dato);
            if(raíz == null) return false;
            return true;
        }
        if(path.isEmpty()) return false;
        NodoGeneral padre = buscarNodo(path);
        if(padre == null) return false;
        //Revisar si existe un hijo con la misma letra que se desea insertar
        NodoGeneral hijoYaExiste = buscarNodo(path + "/" + dato);
        //Si existe el hijo entonces retorno falso
        if(hijoYaExiste != null) return false;
        NodoGeneral nuevo = new NodoGeneral(dato);
        return padre.enlazar(nuevo);
    }

    private NodoGeneral buscarNodo(String path) {
        // -> /F/W/M/R
        path = path.substring(1);
        // -> F/W/M/R
        String vector[] = path.split("/");
        if(vector[0].charAt(0) == raíz.dato){
            //¿El vector solo contiene una letra?
            if(vector.length == 1) return raíz;
            NodoGeneral padre = raíz;
            for(int i = 1; i < vector.length; i++){
                padre = padre.obtenerHijo(vector[i].charAt(0));
                if(padre == null) return null;
            }
            return padre;
        }
        return null; //No coincidió celdilla 0 con raíz
    }
    
    public boolean eliminar(String path){
        if(raíz == null) return false;
        NodoGeneral hijo = buscarNodo(path);
        if(hijo == null) return false;
        //Si es RAMA entonces no se puede eliminar
        if(!hijo.esHoja()) return false;
        if(hijo == raíz){
            raíz = null;
            return true;
        }
        String pathPadre = obtenerPathPadre(path);
        NodoGeneral padre = buscarNodo(path);
        return padre.desenlazar(hijo);
    }

    private String obtenerPathPadre(String path) {
        int posiciónAntesÚltimaDiagonal = path.lastIndexOf("/")-1;
        return path.substring(0, posiciónAntesÚltimaDiagonal);
    }
    
    public NodoGeneral buscarNodoRecursivo(String path) {
        path = path.substring(1);
        if(path.split("/")[0].charAt(0) == raíz.dato && path.split("/").length == 1){
            return raíz;
        }
        if(path.length() == 3){
            return raíz.obtenerHijo(path.charAt(2));
        }
        return buscarNodoRecursivo(path.substring(4), 
                raíz.obtenerHijo(path.charAt(2)));
    }

    private NodoGeneral buscarNodoRecursivo(String path, NodoGeneral actual) {
        if(actual == null){
            return null;
        }
        return path.length() == 1 ? actual.obtenerHijo(path.charAt(0)) :
                buscarNodoRecursivo(path.substring(2), 
                        actual.obtenerHijo(path.charAt(0)));
    }
}