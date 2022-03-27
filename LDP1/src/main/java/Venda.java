
/**
 *
 * @author dugom
 */

import java.util.*;

/**
 *
 * @author dugom
 */
public class Venda {
    int num_venda;
    Date data_venda;
    float valor;
    List<Artigos> artigos;
    List<Serviços> serviços;
    
    // Muda o valor de uma venda

    /**
     *
     * @param v
     */
    public void setValor(float v){
        this.valor = v;
    }
    
    // Muda a data de uma venda

    /**
     *
     * @param d
     */
    public void setData(Date d){
        this.data_venda = d;
    }
    
    // Retorna o valor de uma venda

    /**
     *
     * @return
     */
    public float getValorVenda(){
        return 0;
    }
    
    // Retorna a data de uma venda

    /**
     *
     * @return
     */
    public Date getData(){
        return data_venda;
    }
    
    // Retorna o número de artigos

    /**
     *
     * @return
     */
    public int getNumArtigos(){
        return 0;
    }
    
    // Retorna o número de serviços

    /**
     *
     * @return
     */
    public int getTotalServiços(){
        return 0;
    }
    

}
