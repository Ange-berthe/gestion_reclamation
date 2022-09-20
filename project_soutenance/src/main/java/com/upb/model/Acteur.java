package com.upb.model;
// Generated 14 sept. 2022 � 17:02:16 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Acteur generated by hbm2java
 */
@Entity
@Table(name = "acteur", catalog = "gestion_reclamation")
public class Acteur implements java.io.Serializable {

	private Integer idActeur;
	private Genre genre;
	private String matriculeActeur;
	private String nomActeur;
	private String prenomsActeur;
	private Long telephoneActeur;
	private Etudiant etudiant;
	private Set<UserAuthentification> userAuthentifications = new HashSet<UserAuthentification>(0);
	private Enseignant enseignant;

	public Acteur() {
	}

	public Acteur(Genre genre) {
		this.genre = genre;
	}

	public Acteur(Genre genre, String matriculeActeur, String nomActeur, String prenomsActeur, Long telephoneActeur,
			Etudiant etudiant, Set<UserAuthentification> userAuthentifications, Enseignant enseignant) {
		this.genre = genre;
		this.matriculeActeur = matriculeActeur;
		this.nomActeur = nomActeur;
		this.prenomsActeur = prenomsActeur;
		this.telephoneActeur = telephoneActeur;
		this.etudiant = etudiant;
		this.userAuthentifications = userAuthentifications;
		this.enseignant = enseignant;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_ACTEUR", unique = true, nullable = false)
	public Integer getIdActeur() {
		return this.idActeur;
	}

	public void setIdActeur(Integer idActeur) {
		this.idActeur = idActeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GENRE", nullable = false)
	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Column(name = "MATRICULE_ACTEUR", length = 10)
	public String getMatriculeActeur() {
		return this.matriculeActeur;
	}

	public void setMatriculeActeur(String matriculeActeur) {
		this.matriculeActeur = matriculeActeur;
	}

	@Column(name = "NOM_ACTEUR", length = 50)
	public String getNomActeur() {
		return this.nomActeur;
	}

	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}

	@Column(name = "PRENOMS_ACTEUR", length = 100)
	public String getPrenomsActeur() {
		return this.prenomsActeur;
	}

	public void setPrenomsActeur(String prenomsActeur) {
		this.prenomsActeur = prenomsActeur;
	}

	@Column(name = "TELEPHONE_ACTEUR")
	public Long getTelephoneActeur() {
		return this.telephoneActeur;
	}

	public void setTelephoneActeur(Long telephoneActeur) {
		this.telephoneActeur = telephoneActeur;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "acteur")
	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "acteur")
	public Set<UserAuthentification> getUserAuthentifications() {
		return this.userAuthentifications;
	}

	public void setUserAuthentifications(Set<UserAuthentification> userAuthentifications) {
		this.userAuthentifications = userAuthentifications;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "acteur")
	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

}
