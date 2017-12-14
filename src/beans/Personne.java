package beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Personne {
	private Integer idh;
	private String nom;
	private List<String> prenom;
	private Map<TypeAdresse,Adresse> adresses;
	private Date dateNaissance;
	private Civilite civilite;
}
