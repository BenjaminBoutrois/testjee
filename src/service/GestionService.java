package service;

public class GestionService
{
	public static boolean authentifier(String login, String mdp)
	{
		if ("benjamin".equalsIgnoreCase(login) && "benjamin".equalsIgnoreCase(mdp))
			return true;
		else
			return false;
	}
}
