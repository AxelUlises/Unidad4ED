/**
 *
 * @author axelulises
 * Contiene una lista que hace referencia a los nodos hijos
 * 
 *          - Insertar == enlazar
 *          - Eliminar == desenlazar
 *          - buscarNodo == obtenerHijo
 */

public class NodoGeneral {
    char dato;
    NodoHijo ini, fin;
    
    public NodoGeneral(char d){
        dato = d;
        ini = fin = null;
    }
    
    public boolean enlazar(NodoGeneral hijo){
        NodoHijo enlace = new NodoHijo(hijo);
        if(enlace == null) return false;
        if(ini == null && fin == null){
            ini = fin = enlace;
            return true;
        }
        fin.sig = enlace;
        enlace.ant = fin;
        fin = enlace;
        return true;
    }
    
    public NodoGeneral obtenerHijo(char valorHijoBuscado){
        if(esHoja()) return null;
        for(NodoHijo buscar = ini; buscar != null; buscar = buscar.sig){
            if(buscar.direcciónHijo.dato == valorHijoBuscado){
                return buscar.direcciónHijo;
            }
        }
        return null;
    }
    
    public boolean esHoja(){
        return ini == null && fin == null;
    }

    public boolean desenlazar(NodoGeneral hijo) {
        if(ini == fin){
            if(fin.direcciónHijo == hijo){
                ini = fin = null;
                return true;
            }
            return false;
        }
        NodoHijo temp = ini;
        if(ini.direcciónHijo == hijo){
            ini = temp.sig;
            ini.ant = temp.sig = temp = null;
            return true;
        }
        if(fin.direcciónHijo == hijo){
            temp = fin;
            fin = temp.ant;
            fin.sig = temp.ant = temp = null;
            return true;
        }
        temp = temp.sig;
        while(temp.direcciónHijo != hijo && temp != null){
            temp = temp.sig;
        }
        if(temp == null) return false;
        temp.sig.ant = temp.ant;
        temp.ant.sig = temp.sig;
        temp.sig = temp.ant = temp = null;
        return true;
    }
}
