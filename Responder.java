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
    private Random randomGenerator;
    
    public Responder()
    {
       resposta = new ArrayList<>();
       randomGenerator= new Random();
       fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    
    public void getResponse(){
       int i = randomGenerator.nextInt(resposta.size());
       System.out.println(resposta.get(i));
    }
    
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    
    public void fillResponses(){
        resposta.add("That sounds odd. Could you describe that problem in more detail?\n");
        resposta.add("No other customer has ever complained about this before\n"+"Whats your system configuration?\n");
        resposta.add("That sounds interesting. Tell me more...\n");
        resposta.add("I need a bit more information on that.\n");
        resposta.add("Have you checked that you do not have a dll coflict?\n");
        resposta.add("That's explained in the manual.\n" + "Have you read the manual?\n");
        resposta.add("Have you try to restart the pc?\n");
        resposta.add("That's not a bug, it's a feature!\n");
        resposta.add("Could you elaborate on that?\n");
    }
}
