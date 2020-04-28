
/**
 * Escreva a descrição da classe MapTester aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.HashMap;

public class MapTester
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    HashMap<String, String> phoneBook;

    /**
     * COnstrutor para objetos da classe MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap<String, String>();
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void enterNumber(String name, String number)
    {
        phoneBook.put(name, number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
    
    public void containsorNot (String key){
        if(!phoneBook.containsKey(key)){
            System.out.println("Nao existe!");
        }
        else{
            System.out.println("Encontrado!");
        }
    }
}
