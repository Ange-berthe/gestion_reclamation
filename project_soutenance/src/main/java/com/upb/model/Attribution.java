package com.upb.model;
// Generated 14 sept. 2022 � 17:02:16 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Attribution generated by hbm2java
 */
@Entity
@Table(name = "attribution", catalog = "gestion_reclamation")
public class Attribution implements java.io.Serializable {

	private int idAttribution;
	private AnneeAcademique anneeAcademique;
	private Ecue ecue;
	private Enseignant enseignant;

	public Attribution() {
	}

	public Attribution(int idAttribution, AnneeAcademique anneeAcademique, Ecue ecue, Enseignant enseignant) {
		this.idAttribution = idAttribution;
		this.anneeAcademique = anneeAcademique;
		this.ecue = ecue;
		this.enseignant = enseignant;
	}

	@Id

	@Column(name = "ID_ATTRIBUTION", unique = true, nullable = false)
	public int getIdAttribution() {
		return this.idAttribution;
	}

	public void setIdAttribution(int idAttribution) {
		this.idAttribution = idAttribution;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ANNEE_ACADEMIQUE", nullable = false)
	public AnneeAcademique getAnneeAcademique() {
		return this.anneeAcademique;
	}

	public void setAnneeAcademique(AnneeAcademique anneeAcademique) {
		this.anneeAcademique = anneeAcademique;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_ECUE", nullable = false)
	public Ecue getEcue() {
		return this.ecue;
	}

	public void setEcue(Ecue ecue) {
		this.ecue = ecue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ACTEUR", nullable = false)
	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

}
