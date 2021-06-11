/**
 *
 * @author axelulises
 */
public class NodoArista {
    NodoVértice dirección;
    NodoArista arriba, abajo;
    
    public NodoArista(NodoVértice d){
        dirección = d;
        abajo = arriba = null;
    }
}
