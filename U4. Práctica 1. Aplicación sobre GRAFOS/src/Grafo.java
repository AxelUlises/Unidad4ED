/**
 *
 * @author axelulises
 */
public class Grafo {
    NodoVértice vértice;
    
    public Grafo(){
        vértice = null;
    }
    
    public boolean insertarVértice(char dato){
        if(vértice == null){
            vértice = new NodoVértice(dato); return true;
        }
        if(buscarVértice(dato) != null) return false;
        NodoVértice n = new NodoVértice(dato);
        if(n == null) return false;
        //EL NUEVO ENLAZA AL FINAL DE LA LISTA DE VÉRTICE 
        irAlÚltimo();
        vértice.sig = n;
        n.ant = vértice;
        return true;
    }
    
    private NodoVértice buscarVértice(char dato){
        if(vértice == null) return null;
        irAlPrimero();
        for(NodoVértice buscar = vértice; buscar != null; buscar = buscar.sig){
            if(buscar.dato == dato){
                return buscar;
            }
        }
        return null;
    }
    
    private void irAlÚltimo(){
        while(vértice.sig != null) {
            vértice = vértice.sig;
        }
    }

    private void irAlPrimero() {
        while(vértice.ant != null){
            vértice = vértice.ant;
        }
    }
    
    public int conteoVértices(){
        if(vértice == null) return 0;
        int i = 0;
        irAlPrimero();
        NodoVértice auxiliar = vértice;
        while(auxiliar != null){
            i++;
            auxiliar = auxiliar.sig;
        }
        return i;
    }
    
    public boolean insertarAristas(char origen, char destino){
        NodoVértice nodoOrigen = buscarVértice(origen);
        NodoVértice nodoDestino = buscarVértice(destino);
        if(nodoOrigen == null || nodoDestino == null) return false;
        return nodoOrigen.insertarArista(nodoDestino);
    }
    
    public boolean eliminarArista(char origen, char destino){
        NodoVértice nodoOrigen = buscarVértice(origen);
        NodoVértice nodoDestino = buscarVértice(destino);
        if(nodoOrigen == null || nodoDestino == null) return false;
        return nodoOrigen.eliminarArista(nodoDestino);
    }
    
    public boolean eliminarVértice(char dato){
        if(vértice == null) return false;
        NodoVértice temp = buscarVértice(dato);
        if(temp == null) return false;
        //PARA ELIMINAR UN VÉRTICE SE CONSIDERAN 2 COSAS
        //QUE EL VÉRTICE NO TENGA ARISTAS A OTROS VÉRTICES
        if(temp.arista != null) return false;
        //QUE OTROS VÉRTICES NO TENGAN ARISTAS A ESTE VÉRTICE A ELIMINAR
        quitarAristaDeVértices(temp);
        //¿ESTÁ TEMP EN EL PRIMERO?
        if(temp == vértice){
            if(hayUnSoloVértice()){
                vértice = null;
            }else{
                vértice = temp.sig;
                temp.sig.ant = temp.sig = null;
            }
            return true;
        }
        //¿ESTÁ TEMP EN EL ÚLTIMO?
        if(temp.sig == null){
            temp.ant.sig = temp.ant = null;
            return true;
        }
        //¿ESTÁ TEMP EN MEDIO?
        temp.ant.sig = temp.sig;
        temp.sig.ant = temp.ant;
        temp.sig = temp.ant = null;
        return true;
    }
    
    private void quitarAristaDeVértices(NodoVértice nodoBorrar){
        irAlPrimero();
        for(NodoVértice buscar = vértice; buscar != null; buscar = buscar.sig){
            buscar.eliminarArista(nodoBorrar);
        }
    }
    
    public boolean hayUnSoloVértice(){
        return vértice.ant == null && vértice.sig == null;
    }
    
    public boolean [][]matrizDeAdyacencia(){
        if(vértice == null) return null;
        int a = conteoVértices(), b;
        boolean matriz[][] = new boolean[a][a];
        for(int i = 0; i < a; i++){
            for(b = 0; b < a; b++){
                matriz[i][b] = false;
            }
        }
        for(int i = 0; i < a; i++){
            b = 0;
            while(i != b){
                b++;
                vértice = vértice.sig;
            }
            NodoArista auxiliar = vértice.arista;
            irAlPrimero();
            while(auxiliar != null){
                b = 0;
                while(auxiliar.dirección != vértice){
                    vértice = vértice.sig;
                    b++;
                }
                matriz[i][b] = true;
                auxiliar = auxiliar.abajo;
                irAlPrimero();
            }
        }
        return matriz;
    }
    
    public String listaDeAdyacencia(char dato){
        return buscarVértice(dato).toString();
    }
    
    public String validarCamino(char[] camino){
        String respuesta = "¡CAMINO NO VÁLIDO!";
        if(camino.length == 1){
            return buscarVértice(camino[0]) == null ?
                    respuesta : "¡CAMINO VÁLIDO!";
        }
        for(int i = 0; i < camino.length -1; i++){
            if(buscarVértice(camino[i]).buscarArista(buscarVértice(
            camino[i+1])) != null){
                respuesta = "¡CAMINO VÁLIDO!";
            }
        }
        return respuesta;
    }
}
