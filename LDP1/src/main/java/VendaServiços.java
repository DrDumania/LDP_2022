
import java.util.*;


/**
 *
 * @author dugom
 */
public class VendaServiços extends Venda{
        
    /**
     *
     * @param d
     * @param v
     */
    public VendaServiços(Date d, float v){
            serviços = new ArrayList<>();
            this.valor = v;
            this.data_venda = d;
            num_venda++;
        }
        
        // Adiciona serviços à lista

    /**
     *
     * @param s
     */
        public void addServiços(Serviços s){
            serviços.add(s);
        }
        
        // Remove serviços à lista

    /**
     *
     * @param s
     */
        public void removeServiços(Serviços s){
            serviços.remove(s);
        }
        
        // Retorna a lista de serviços

    /**
     *
     * @return
     */
        public List getServiços(){
            return serviços;
        }
        
        // Reescreve o método da class Mãe e retorna quantos serviços tem na lista

    /**
     *
     * @return
     */
        @Override
        public int getTotalServiços(){
            return serviços.size();
        }
        
        // Reescreve o método da class Mãe e retorna o valor total da venda

    /**
     *
     * @return
     */
        @Override
        public float getValorVenda(){
            float valorServiços=0;
            for(int i = 0; i < serviços.size() ; i++){
                valorServiços+=serviços.get(i).valor_serviço;
            }
            return valorServiços;
        }

}
