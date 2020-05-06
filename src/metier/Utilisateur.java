package metier;

public class Utilisateur
{
	// Propriétés
	private String login, mdp;

	// Constructeurs
	public Utilisateur(String login, String mdp)
	{
		super();
		this.login = login;
		this.mdp = mdp;
	}

	// Accesseurs
	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getMdp()
	{
		return mdp;
	}

	public void setMdp(String mdp)
	{
		this.mdp = mdp;
	}
}
