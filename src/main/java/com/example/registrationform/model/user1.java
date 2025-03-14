package com.example.registrationform.model;

import jakarta.persistence.*;


@Entity

@Table(name = "family_member")
public class user1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "home_number", nullable = false)
    private String homeNumber;

    @Column(name = "member_name", nullable = false)
    private String memberName;

    @Column(name = "member_mobile")
    private String memberMobile;

    @Column(name = "member_aadhar")
    private String memberAadhar;

    @Column(name = "member_pan", unique = true, nullable = false)
    private String panNumber;
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public String getMemberAadhar() {
		return memberAadhar;
	}

	public void setMemberAadhar(String memberAadhar) {
		this.memberAadhar = memberAadhar;
	}

	public String getpanNumber() {
		return panNumber;
	}

	public void setpanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
    
}