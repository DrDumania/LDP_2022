

/**
 *
 * @author dugom
 */
public class Serviços {
    int codigo;
    String tipo_serviço;
    float valor_serviço;
    
    /**
     *
     * @param t
     * @param v
     */
    public Serviços(String t,float v){
        this.tipo_serviço = t;
        this.valor_serviço = v;
        codigo++;
    }
}
