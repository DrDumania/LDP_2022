
/**
 *
 * @author dugom
 */
public class Artigos {
    int codigo;
    String nome_artigo;
    float valor_artigo;
    
    /**
     *
     * @param n
     * @param v
     */
    public Artigos(String n,float v){
        this.nome_artigo = n;
        this.valor_artigo = v;
        codigo++;
    }
}
