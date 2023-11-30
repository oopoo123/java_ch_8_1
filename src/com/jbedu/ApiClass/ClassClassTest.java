package com.jbedu.ApiClass;

import com.jbedu.abstracttest.CameraPhone;
import com.jbedu.abstracttest.Phone;

public class ClassClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class clazz = String.class;
		
		Class carClass1 = Phone.class;//phone 클래스의 정보를 가져와서 저장
		
		try {
			Class carClass2 = Phone.forName("com.jbedu.abstracttest.Phone");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Phone phone = new CameraPhone();
		
		Class phoneClass3 = phone.getClass();
		
		System.out.println(phoneClass1.getName());

	}

}
