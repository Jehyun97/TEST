package com.sbs.dagachi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.dagachi.service.Phone_Book_Service;
import com.sbs.dagachi.vo.Phone_BookVO;

@Controller
public class Phone_Book_Controller {

	private Phone_Book_Service phone_Book_Service;

	public Phone_Book_Controller(Phone_Book_Service phone_Book_Service) {
		this.phone_Book_Service = phone_Book_Service;
	}

	@RequestMapping("dagachi/phoneBook/list")
	@ResponseBody
	public List<Phone_BookVO> showList(String searchType, String keyword,
			@RequestParam(defaultValue = "1") int phone_book_type, String phone_book_register) {

		return phone_Book_Service.getPhoneBookList(searchType, keyword, phone_book_type, phone_book_register);
	}

	@RequestMapping("dagachi/phoneBook/detail")
	@ResponseBody
	public Phone_BookVO showDetail(int phone_Book_Id) {
		return phone_Book_Service.getPhoneBookDetail(phone_Book_Id);
	}
	
	@RequestMapping("dagachi/phoneBook/liid")
	@ResponseBody
	public int liid() {
		return phone_Book_Service.getLastInsertId();
	}
	

	@RequestMapping("dagachi/phoneBook/regist")
	@ResponseBody
	public Phone_BookVO registPhone_Book(String phone_Book_Name, String phone_Book_Email, String phone_Book_Phone,
			String phone_Book_Company, String phone_Book_Tag, String phone_Book_Fax, String phone_Book_Dep,
			String phone_Book_Team, String phone_Book_Rank, String phone_Book_Address, String phone_Book_Web,
			String phone_Book_Register, int phone_Book_Type) {
		
		phone_Book_Service.registPhone_Book(phone_Book_Name, phone_Book_Email, phone_Book_Phone,
				phone_Book_Company, phone_Book_Tag, phone_Book_Fax, phone_Book_Dep,
				phone_Book_Team, phone_Book_Rank, phone_Book_Address, phone_Book_Web,
				phone_Book_Register, phone_Book_Type);
		
		int phone_Book_Id=phone_Book_Service.getLastInsertId();

		return phone_Book_Service.getPhoneBookDetail(phone_Book_Id);
	}
	@RequestMapping("dagachi/phoneBook/modify")
	@ResponseBody
	public Phone_BookVO modifyPhone_Book(int phone_Book_Id, String phone_Book_Name, String phone_Book_Email, String phone_Book_Phone,
			String phone_Book_Company, String phone_Book_Tag, String phone_Book_Fax, String phone_Book_Dep,
			String phone_Book_Team, String phone_Book_Rank, String phone_Book_Address, String phone_Book_Web,
			String phone_Book_Register, int phone_Book_Type) {
		
		phone_Book_Service.modifyPhone_Book(phone_Book_Id, phone_Book_Name, phone_Book_Email, phone_Book_Phone,
				phone_Book_Company, phone_Book_Tag, phone_Book_Fax, phone_Book_Dep,
				phone_Book_Team, phone_Book_Rank, phone_Book_Address, phone_Book_Web,
				phone_Book_Register, phone_Book_Type);
		
		int phone_Book_Id=phone_Book_Service.getLastInsertId();
		
		return phone_Book_Service.getPhoneBookDetail(phone_Book_Id);
	}

}
