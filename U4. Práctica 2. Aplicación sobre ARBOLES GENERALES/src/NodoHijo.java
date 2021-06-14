/**
 *
 * @author axelulises
 */
public class NodoHijo {
    NodoGeneral direcciónHijo;
    NodoHijo ant, sig;
    
    public NodoHijo(NodoGeneral hijoApuntar){
        direcciónHijo = hijoApuntar;
        ant = sig = null;
    }
}
