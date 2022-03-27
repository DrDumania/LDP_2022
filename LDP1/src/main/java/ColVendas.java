
/**
 *
 * @author dugom
 */
import java.util.*;

/**
 *
 * @author dugom
 */
public class ColVendas {
    List<Venda> total_vendas;

    /**
     *
     */
    public ColVendas(){
        total_vendas = new ArrayList<>();
    }
    
    // Adiciona uma venda à lista de vendas

    /**
     *
     * @param v
     */
    public void addVenda(VendaArtigos v){
        total_vendas.add(v);
        if(verificaDuplicado(v.num_venda) == true){
            System.out.println("Erro a adicionar essa venda! Já existe uma venda com esse número!");
            total_vendas.remove(v);
        }
    }
    
    // Adiciona uma venda à lista de vendas

    /**
     *
     * @param v
     */
    public void addVenda(VendaServiços v){
        total_vendas.add(v);
        if(verificaDuplicado(v.num_venda) == true){
            System.out.println("Erro a adicionar essa venda! Já existe uma venda com esse número!");
            total_vendas.remove(v);
        }       
    }
    
    // Retorna o número de vendas de uma data fornecida como parâmetro de entrada

    /**
     *
     * @param d
     * @return
     */
    public int getNumVendas(Date d){
        int numTotal=0;
        for(int i = 0; i < total_vendas.size(); i++){
            if(total_vendas.get(i).data_venda.equals(d)) numTotal++;
        }
        return numTotal;
    }
    
    // Retorna a quantidade de artigos vendidos desde sempre

    /**
     *
     * @return
     */
    public int getTotalArtigos(){
        int numTotalArtigos=0;
        for(int i = 0; i < total_vendas.size();i++){
            total_vendas.get(i).getNumArtigos();
            numTotalArtigos++;
        }
        return numTotalArtigos;
    }
    
    // Retorma a quantidade de serviços fornecidos desde sempre

    /**
     *
     * @return
     */
    public int getTotalServiços(){
        int numTotalServiços=0;
        for(int i = 0; i < total_vendas.size();i++){
            total_vendas.get(i).getTotalServiços();
            numTotalServiços++;
        }
        return numTotalServiços;
    }
    
    // Retorna o valor total de vendas de uma data fornecida como parâmetro

    /**
     *
     * @param d
     * @return
     */
    public float getValorVendas(Date d){
        int valorTotal = 0;
        for(int i = 0; i < total_vendas.size(); i++){
            if(total_vendas.get(i).data_venda.equals(d)){
                valorTotal += total_vendas.get(i).getValorVenda();
            }
        }
        return valorTotal;
    }
    
    
    // Verfica se já existe uma venda listada com esse número

    /**
     *
     * @param n
     * @return
     */
    public boolean verificaDuplicado(int n){
        int i = 0;
        do{
            if(total_vendas.get(i).num_venda == n) return true;
            i++;
        }while(i!=total_vendas.size() || total_vendas.get(i).num_venda == n);
        return false;
    }

}
