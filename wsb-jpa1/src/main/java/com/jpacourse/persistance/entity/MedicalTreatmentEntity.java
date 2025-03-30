package com.jpacourse.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MEDICAL_TREATMENT")
public class MedicalTreatmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private String type;

	@ManyToOne
	@JoinColumn(name = "visit_id")
	private VisitEntity visit;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }

	public VisitEntity getVisit() { return visit; }
	public void setVisit(VisitEntity visit) { this.visit = visit; }
}
