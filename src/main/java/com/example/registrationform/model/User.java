package com.example.registrationform.model;

import jakarta.persistence.*;

@Entity

@Table(name = "family_head")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "home_number", unique = true, nullable = false)
    private String homeNumber;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "aadhar_number", unique = true, nullable = false)
    private String aadharNumber;

    @Column(name = "pan_number", unique = true, nullable = false)
    private String panNumber;

    @Column(name = "photo_upload")
    private String photoUpload;

    @Column(name = "water_connections", nullable = false)
    private int waterConnections;
    
    @Column(name = "pending_gharpatti", nullable = false)
    private int pendinggharpatti;
    
    @Column(name = "pending_panipatti", nullable = false)
    private int pendingpanipatti;

    @Column(name = "rcc_area")
    private double rccArea;

    @Column(name = "pucca_area")
    private double puccaArea;

    @Column(name = "kutcha_area")
    private double kutchaArea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPhotoUpload() {
		return photoUpload;
	}

	public void setPhotoUpload(String photoUpload) {
		this.photoUpload = photoUpload;
	}

	public int getWaterConnections() {
		return waterConnections;
	}

	public void setWaterConnections(int waterConnections) {
		this.waterConnections = waterConnections;
	}

	public double getRccArea() {
		return rccArea;
	}

	public void setRccArea(double rccArea) {
		this.rccArea = rccArea;
	}

	public double getPuccaArea() {
		return puccaArea;
	}

	public void setPuccaArea(double puccaArea) {
		this.puccaArea = puccaArea;
	}

	public double getKutchaArea() {
		return kutchaArea;
	}

	public void setKutchaArea(double kutchaArea) {
		this.kutchaArea = kutchaArea;
	}

	public int getPendinggharpatti() {
		return pendinggharpatti;
	}

	public void setPendinggharpatti(int pendinggharpatti) {
		this.pendinggharpatti = pendinggharpatti;
	}

	public int getPendingpanipatti() {
		return pendingpanipatti;
	}

	public void setPendingpanipatti(int pendingpanipatti) {
		this.pendingpanipatti = pendingpanipatti;
	}
    
}