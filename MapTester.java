
/**
 * Escreva a descri��o da classe MapTester aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */

import java.util.HashMap;

public class MapTester
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
    HashMap<String, String> phoneBook;

    /**
     * COnstrutor para objetos da classe MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap<String, String>();
    }

    /**
     * Exemplo de m�todo - substitua este coment�rio pelo seu pr�prio
     * 
     * @param  y   exemplo de um par�metro de m�todo
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
