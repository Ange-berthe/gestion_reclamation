package com.upb.model;
// Generated 14 sept. 2022 � 17:02:16 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Evaluation generated by hbm2java
 */
@Entity
@Table(name = "evaluation", catalog = "gestion_reclamation")
public class Evaluation implements java.io.Serializable {

	private int idEvaluation;
	private Ecue ecue;
	private TypeEvaluation typeEvaluation;
	private String libelleevaluation;
	private Set<Reclamation> reclamations = new HashSet<Reclamation>(0);

	public Evaluation() {
	}

	public Evaluation(int idEvaluation, Ecue ecue, TypeEvaluation typeEvaluation) {
		this.idEvaluation = idEvaluation;
		this.ecue = ecue;
		this.typeEvaluation = typeEvaluation;
	}

	public Evaluation(int idEvaluation, Ecue ecue, TypeEvaluation typeEvaluation, String libelleevaluation,
			Set<Reclamation> reclamations) {
		this.idEvaluation = idEvaluation;
		this.ecue = ecue;
		this.typeEvaluation = typeEvaluation;
		this.libelleevaluation = libelleevaluation;
		this.reclamations = reclamations;
	}

	@Id

	@Column(name = "ID_EVALUATION", unique = true, nullable = false)
	public int getIdEvaluation() {
		return this.idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
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
	@JoinColumn(name = "ID_TYPE_EVALUATION", nullable = false)
	public TypeEvaluation getTypeEvaluation() {
		return this.typeEvaluation;
	}

	public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
		this.typeEvaluation = typeEvaluation;
	}

	@Column(name = "LIBELLEEVALUATION", length = 50)
	public String getLibelleevaluation() {
		return this.libelleevaluation;
	}

	public void setLibelleevaluation(String libelleevaluation) {
		this.libelleevaluation = libelleevaluation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "evaluation")
	public Set<Reclamation> getReclamations() {
		return this.reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

}