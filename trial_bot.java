import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        String[] word1 = new String[100];
        int mental_health_index =0;
        String s1;
     
        System.out.println("**** Welcome to the Human Mental Health Assistance Bot ****\n");
       
        for(int i=0;i<100;i++)
        {
           
            word1[i] = "NULL";
           
        }
       
        Scanner sc = new Scanner(System.in);
       
        int i=0;
       
        while(true)
        {
            s1 = sc.next();
       
  if(s1.contains("END-OF-INPUT"))
            {
               
                break;
               
            }
           
            word1[i] = s1;
           
            i++;
        }
       
        i=0;
        while(word1[i] != "NULL")
        {
            // Checking words for positive/neutral words
            if(word1[i].contains("day") || word1[i].contains("temporary")
           
            || word1[i].contains("happy") || word1[i].contains("family") || word1[i].contains("gifts") || word1[i].contains("joy") || word1[i].contains("friends") || word1[i].contains("cheerful") || word1[i].contains("optimism") || word1[i].contains("delightful"))
            {
                mental_health_index++;
            }
           
            // Checking words for permanent state of sadness
            if(word1[i].contains("sorrow") || word1[i].contains("sad")
           
            || word1[i].contains("conflict") || word1[i].contains("unhappiness") || word1[i].contains("fight") || word1[i].contains("dispute") || word1[i].contains("hopelessness") || word1[i].contains("anguish"))
            {
                mental_health_index--;
            }
            
    // Checking words for strong state of sadness
            if(word1[i].contains("miserable") || word1[i].contains("depression")
           
            || word1[i].contains("suicide") || word1[i].contains("anxiety"))
            {
                mental_health_index--;
                mental_health_index--;
            }
           
           
           
            // Checking relationships between words for negative mental health index
            if(word1[i+1] == "NULL")
            {
                break;
            }
            else
            {
                if((word1[i].contains("bad") && word1[i+1].contains("day")) || (word1[i].contains("argument") && word1[i+1].contains("with")) || (word1[i].contains("bad") && word1[i+1].contains("grades")) || (word1[i].contains("failed") && word1[i+1].contains("assignment")))
                {
                    mental_health_index++;
                }
               
            }
            i++;
        }
        System.out.println("Results: \n\n");
        System.out.println("\nThe mental health index is " + mental_health_index + ".\n");
       
        if(mental_health_index>0)
        {
            System.out.println("\nMental health is good.\n");
        }
else
        {
            System.out.println("\nMental health is poor.\n\n");
            System.out.println("\nWe recommend that you visit a counsellor.\n\n");
            System.out.println("\nYou should talk to your family and friends about your mental health.\n\n");
        }
       
        System.out.println("** Thank you for using the Mental Health Index Calculator **");
   
       
       
    }
}