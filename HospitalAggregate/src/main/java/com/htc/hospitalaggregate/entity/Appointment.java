package com.htc.hospitalaggregate.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Id;

public class Appointment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4290433460427598981L;
	
	@Id
	private long AppointementId;
	private String docterId ;
	private String patientId;
	private long phoneNumber;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointementId, String docterId, String patientId, long phoneNumber) {
		super();
		AppointementId = appointementId;
		this.docterId = docterId;
		this.patientId = patientId;
		this.phoneNumber = phoneNumber;
	}
	public long getAppointementId() {
		return AppointementId;
	}
	public void setAppointementId(long appointementId) {
		AppointementId = appointementId;
	}
	public String getDocterId() {
		return docterId;
	}
	public void setDocterId(String docterId) {
		this.docterId = docterId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Appiontement [AppointementId=" + AppointementId + ", docterId=" + docterId + ", patientId=" + patientId
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
