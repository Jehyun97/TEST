package com.sbs.dagachi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	String member_Id;
	String member_Pwd;
	String member_Name;
	String member_Email;
	String member_Address;
	Date member_RegDate;
	String member_Phone;
	int member_Department;
	int member_Team;
	String member_Rank;
	int member_Status;
	Date member_DelDate;
	Date member_Birth;
	int member_Auth;
	String member_Pic;
}
