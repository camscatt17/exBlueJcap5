
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
import java.util.HashMap;


public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    private List <String> resposta;
    private Random randomGenerator;
    private HashMap <String, String> responseMap;
    
    public Responder()
    {
       resposta = new ArrayList<>();
       randomGenerator= new Random();
       responseMap = new HashMap<String, String>();
       fillResponses();
       fillResponseMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    
    public String getResponse(){
       int i = randomGenerator.nextInt(resposta.size());
       return resposta.get(i);
    }
    
    public String generateResponse(String word)
    {
       String response = responseMap.get(word);
       if(response!= null){
           return response;
        }
        else{
            return getResponse();
        }
    }
    
    public void fillResponses(){
        resposta.add("Yes");	        
        resposta.add("That sounds odd. Could you describe that problem in more detail?\n");
        resposta.add("No");	        
        resposta.add("No other customer has ever complained about this before\n"+"Whats your system configuration?\n");
        resposta.add("Maybe");	        
        resposta.add("That sounds interesting. Tell me more...\n");
        resposta.add("I need a bit more information on that.\n");
        resposta.add("Have you checked that you do not have a dll coflict?\n");
        resposta.add("That's explained in the manual.\n" + "Have you read the manual?\n");
        resposta.add("Have you try to restart the pc?\n");
        resposta.add("That's not a bug, it's a feature!\n");
        resposta.add("Could you elaborate on that?\n");
    }	    
    
    
    public void fillResponseMap(){
        responseMap.put("slow", "I think this has to do with your hadware.\n"+
                        "Upgrading your processor should solve all performaces problems.\n"+
                        "Have you got a problem with our software?");
        responseMap.put("bug", "Well, you know, all software has some bugs.\n"+
                        "But our software engineers are working very hard to fix them.\n"+
                        "Can you describe the problem a bit futher?");
       
    }
}
