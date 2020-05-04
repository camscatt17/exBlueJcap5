
/**
 * Classe que exemplifica o exercicio 5.37
 * 
 * @CamilaSantos (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;

public class SortingTest
{
    //Uma lista de inteiros
    private List <Integer> teste;

    /**
     * COnstrutor para objetos da classe SortingTest
     */
    public SortingTest()
    {
        teste = new ArrayList<>();
        teste = preencher();
        receiveAndPrint(teste);
        
    }

   
    public List<Integer> preencher(){
        teste.add(4);
        teste.add(9);
        teste.add(2);
        teste.add(5);
        teste.add(7);
        teste.add(10);
        teste.add(1);
        teste.add(0);
        teste.add(3);
        teste.add(8);
        teste.add(6);
        
        return teste;
    }
    
     /**
     * Método que aceita um array de valores int como parâmetro e imprime os calores em ordem crescente
     * 
     * @param  List<E> lista 
     * @return     void
     */
    
    public void receiveAndPrint(List<Integer> lista)
    {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        Iterator<Integer> iterator = lista.iterator();
        while(iterator.hasNext()){
            tree.add(iterator.next());
        }
        
        Iterator<Integer> i = tree.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}
