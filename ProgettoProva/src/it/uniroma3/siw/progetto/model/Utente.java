package it.uniroma3.siw.progetto.model;

public class Utente {
	private String username;
	private String role;

	public Utente(String username,String role){
		this.setRole(role);
		this.setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}