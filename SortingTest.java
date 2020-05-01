
/**
 * Escreva a descri��o da classe SortingTest aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;

public class SortingTest
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
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

    /**
     * Exemplo de m�todo - substitua este coment�rio pelo seu pr�prio
     * 
     * @param  y   exemplo de um par�metro de m�todo
     * @return     a soma de x com y 
     */
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
