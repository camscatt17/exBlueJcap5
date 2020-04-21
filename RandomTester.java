
/**
 * Escreva a descri��o da classe RandomTester aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */

import java.util.Random;

public class RandomTester
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
    private Random r;

    /**
     * COnstrutor para objetos da classe RandomTester
     */
    public RandomTester()
    {
        // inicializa vari�veis de inst�ncia
        r = new Random();
    }

    /**
     * Exemplo de m�todo - substitua este coment�rio pelo seu pr�prio
     * 
     * @param  y   exemplo de um par�metro de m�todo
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
    
    public void throwDice (int howMany){
        for(int i = 0; i<howMany; i++){
            System.out.println((1 + r.nextInt(6)));
        }
    }
    
    public int maxInclus (int max){
       System.out.println(1+r.nextInt(max));
       return 1 + r.nextInt(max);
    }
    
    public int maxMin (int max, int min){
        System.out.println(min + maxInclus(max-min));
        return (min + maxInclus(max-min));
    }
}
