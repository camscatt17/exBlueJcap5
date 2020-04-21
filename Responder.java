/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    private List <String> resposta;
    
    public Responder()
    {
       resposta = new ArrayList<>();
       fillDefaultResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    
    public void getResponse(){
       Random num = new Random();
       int i = num.nextInt(3);
       System.out.println(resposta.get(i));
    }
    
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    
    public void fillDefaultResponses(){
        resposta.add("Yes");
        resposta.add("No");
        resposta.add("Maybe");
    }
}
