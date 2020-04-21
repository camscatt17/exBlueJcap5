
/**
 * Escreva a descrição da classe RandomTester aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.Random;

public class RandomTester
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Random r;

    /**
     * COnstrutor para objetos da classe RandomTester
     */
    public RandomTester()
    {
        // inicializa variáveis de instância
        r = new Random();
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void printOneRandom()
    {
        System.out.println(r.nextInt());
    }
    
    public void printMultiRandom(int howMany){
        for(int i = 0; i<howMany; i++){
            System.out.println(r.nextInt());
        }
    }
}
