
import java.util.*;


/**
 *
 * @author dugom
 */
public class VendaArtigos extends Venda{
    
    /**
     *
     * @param d
     * @param v
     */
    public VendaArtigos(Date d, float v){
            artigos = new ArrayList<>();
            this.valor = v;
            this.data_venda = d;
            num_venda++;
        }
        
        // Adiciona artigos à lista

    /**
     *
     * @param a
     */
        public void addArtigos(Artigos a){
            artigos.add(a);
        }
        
        // Remove artigos à lista

    /**
     *
     * @param a
     */
        public void removeArtigos(Artigos a){
            artigos.remove(a);
        }
        
        // Retorna a lista de artigos

    /**
     *
     * @return
     */
        public List getArtigos(){
            return artigos;
        }
        
        // Reescreve o método da class Mãe e retorna quantos artigos tem na lista

    /**
     *
     * @return
     */
        @Override 
        public int getNumArtigos(){
            return artigos.size();
        }
        
        // Reescreve o método da class Mãe e retorna o valor total da venda

    /**
     *
     * @return
     */
        @Override
        public float getValorVenda(){
            float valorArtigos=0;
            for(int i = 0; i < artigos.size() ; i++){
                valorArtigos+=artigos.get(i).valor_artigo;
            }
            return valorArtigos;
        }
        
}
