package Exerccie02;
import java.util.Scanner;
public class Dictionnaire {
	private int nbMots;
	private MotDico[] dico;
	private String nom;
	
	public Dictionnaire(int x , MotDico t[] , String ch)
	{
		this.nom = ch;
		this.nbMots = x;
		this.dico = t;
	}
	public void ajouterMot(MotDico m)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le mot : ");
		String Mot = sc.nextLine(); 
		m.setMot(Mot);
		
		System.out.println("donner le definition : ");
		String Definition = sc.nextLine(); 
		m.setDefinition(Definition);
		
	}
	public void supprimerMot (String ch)
	{
		for(int i = 0 ; i < dico.length ; i++)
		{
			if(dico[i].getMot() == ch )
			{
				for (int j = i; j <  dico.length - 1; j++)
				{
                    dico[j] = dico[j + 1];
                }
			}
		}
	}
	public int chercherMot (String ch)
	{
		int pos = -1;
		for(int i =0; i<dico.length;i++)
		{
			if(dico[i].getMot().equals(ch))
				pos = i;
		}
		return pos;
	}
	public void listerDico()
	{
		for(int i =0; i<dico.length;i++)
		{
			System.out.println("Mot : "+dico[i].getMot()+"\n");
			System.out.println("Definition : "+dico[i].getDefinition()+"\n");
		}
	}
	public int nbSynonymes(MotDico m)
	{
		int nb_synonyme = 0;
		
		for(int i =0; i<dico.length;i++)
		{
			if(dico[i].synonyme(m))
				nb_synonyme ++;
			
		}
		
		return nb_synonyme;
	}
	 public static void main(String[] args) {
		 
		 MotDico[] larousse = new MotDico[3];
		 Dictionnaire dictionnaire = new Dictionnaire(0, larousse, "Larousse");
		 for(int i =0; i<larousse.length;i++)
		 {
			 larousse[i] = new MotDico();
			 dictionnaire.ajouterMot(larousse[i]);
		 }
		 
		 dictionnaire.listerDico();
		 
		 String test = "jouer";
		 int resultat = dictionnaire.chercherMot(test);
		 if(resultat == -1)
			 System.out.println("le mot n\'existe pas dans le dictionnaire !!!");
		 else
			 System.out.println("le mot existe dans le dictionnaire dans la position : "+resultat);
		 
		 String test1 = "heureux";
		 int resultat2 = dictionnaire.chercherMot(test1);
		 if(resultat2 == -1)
			 System.out.println("le mot n\'existe pas dans le dictionnaire !!!");
		 else
			 System.out.println("le mot existe dans le dictionnaire dans la position : "+resultat2);
		 
		
		 String test3 = "heureux"; 
		 int synonymCount = dictionnaire.nbSynonymes(larousse[resultat2]); 
		 System.out.println("Le nombre de synonymes pour le mot '" + test3 + "' est : " + synonymCount);

		   
		 System.out.println("Suppression du mot : " + test3);
		 dictionnaire.supprimerMot(test3);

		   
		 dictionnaire.listerDico();
	 }

}
