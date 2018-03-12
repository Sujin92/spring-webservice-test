package com.sujin92.webservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity(name = "major")
public class User {
	
	@Id
	@Column(name="major_id")
	@GeneratedValue
	private int majorId;
	@Column(name="major_name")
	private String majorName;
	
	@Override
	public String toString() {
		return "전공 아이디 : " + majorId + " 전공 이름 : " + majorName;
		
	}
}
