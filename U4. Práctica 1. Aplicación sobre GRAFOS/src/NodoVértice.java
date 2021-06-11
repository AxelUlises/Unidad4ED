/**
 *
 * @author axelulises
 */
public class NodoVértice {
    char dato;
    NodoVértice sig, ant;
    NodoArista arista;
    
    public NodoVértice(char d){
        dato = d;
        sig = ant = null;
        arista = null;
    }
    
    public boolean insertarArista(NodoVértice dirección){
        NodoArista n = new NodoArista(dirección);
        if(n == null) return false;
        if(arista == null){
            arista = new NodoArista(dirección); return true;
        }
        if(buscarArista(dirección) != null) return false;
        irAlÚltimo();
        arista.abajo = n;
        n.arriba = arista;
        n.arriba = arista;
        return true;
    }

    public NodoArista buscarArista(NodoVértice dirección) {
        if(arista == null) return null;
        irAlPrimero();
        for(NodoArista buscar = arista; buscar != null; buscar = buscar.abajo){
            if(buscar.dirección == dirección){
                return buscar;
            }
        }
        return null;
    }
    
    private void irAlPrimero(){
        while(arista.arriba != null){
            arista = arista.arriba;
        }
    }
    
    private void irAlÚltimo(){
        while(arista.abajo != null){
            arista = arista.abajo;
        }
    }
    
    public boolean eliminarArista(NodoVértice dirección){
        if(arista == null) return false;
        NodoArista temp = buscarArista(dirección);
        //NO SE ENCONTRÓ ARISTA DE ORIGEN A DESTINO
        if(temp == null) return false;
        if(temp == arista){
            if(HayUnaSolaArista()){
                arista = null;
            }else{
                arista = arista.abajo;
                temp.abajo.arriba = temp.abajo = null;
            }
            return true;
        }
        //ESTÁ ÚLTIMO NODO
        if(temp.abajo == null){
            temp.arriba.abajo = temp.arriba = null; return true;
        }
        //QUITAR ARISTA DE ENMEDIO DE LISTA DE ARISTAS
        temp.arriba.abajo = temp.abajo;
        temp.abajo.arriba = temp.arriba;
        temp.abajo = temp.arriba = null;
        return true;
    }
    
    private boolean HayUnaSolaArista(){
        return arista.abajo == null && arista.arriba == null;
    }
    
    @Override 
    public String toString(){
        String respuesta = "[" + dato + "]";
        NodoArista auxiliar = arista;
        while(auxiliar != null){
            respuesta += " -> " + auxiliar.dirección.dato;
            auxiliar = auxiliar.abajo;
        }
        return respuesta;
    }
    
}
