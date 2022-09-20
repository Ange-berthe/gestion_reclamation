package com.upb.model;
// Generated 14 sept. 2022 � 17:02:16 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserAuthorisation generated by hbm2java
 */
@Entity
@Table(name = "user_authorisation", catalog = "gestion_reclamation")
public class UserAuthorisation implements java.io.Serializable {

	private int idUserAuthorisation;
	private String libellerole;
	private Set<UserAuthentification> userAuthentifications = new HashSet<UserAuthentification>(0);

	public UserAuthorisation() {
	}

	public UserAuthorisation(int idUserAuthorisation) {
		this.idUserAuthorisation = idUserAuthorisation;
	}

	public UserAuthorisation(int idUserAuthorisation, String libellerole,
			Set<UserAuthentification> userAuthentifications) {
		this.idUserAuthorisation = idUserAuthorisation;
		this.libellerole = libellerole;
		this.userAuthentifications = userAuthentifications;
	}

	@Id

	@Column(name = "ID_USER_AUTHORISATION", unique = true, nullable = false)
	public int getIdUserAuthorisation() {
		return this.idUserAuthorisation;
	}

	public void setIdUserAuthorisation(int idUserAuthorisation) {
		this.idUserAuthorisation = idUserAuthorisation;
	}

	@Column(name = "LIBELLEROLE", length = 50)
	public String getLibellerole() {
		return this.libellerole;
	}

	public void setLibellerole(String libellerole) {
		this.libellerole = libellerole;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAuthorisation")
	public Set<UserAuthentification> getUserAuthentifications() {
		return this.userAuthentifications;
	}

	public void setUserAuthentifications(Set<UserAuthentification> userAuthentifications) {
		this.userAuthentifications = userAuthentifications;
	}

}
