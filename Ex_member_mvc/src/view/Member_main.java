package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import DTO.MemberDTO;
import model.MemberDAO;

public class Member_main {
	// 메인문을 홈페이지 화면 이라고 생각해라. 사용자에게는 기능이 보여지지 않는다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO mdao = new MemberDAO();

	      while (true) {
	         System.out.println("회원관리 프로그램");
	         System.out.println("1.전체 회원 조회 2.회원가입 3.회원정보 삭제 4. 비밀번호 수정  5. 검색 조회 6. 종료");

	         int choice = sc.nextInt();
	         if(choice == 6) {
	            System.out.println("프로그램 종료");
	            break;
	            
	         }else if(choice == 5){
	        	 System.out.println("검색할 성을 입력하세요. >> ");
	        	 String family_name = sc.next();
	        	 ArrayList<MemberDTO> dtoList = mdao.selectSearchMember(family_name);
	        	 
	        	 for(MemberDTO data: dtoList) {
	        		 System.out.println("id : "+ data.getId());
	        		 System.out.println("pw : "+ data.getPw());
	        		 System.out.println("name : "+ data.getName());
	        		 System.out.println("age : "+ data.getAge());
	        		 System.out.println("============================");
	        	 }
	        	 
	         } else if(choice == 1) {
	            ArrayList<MemberDTO> dtoList = mdao.selectMember(); // 이함수는 ArrayList를 뱉는다.
	            
	            for(MemberDTO x: dtoList) {
	            	System.out.print("id: "+x.getId());
	            	System.out.print("pw: "+x.getPw());
	            	System.out.print("name: "+x.getName());
	            	System.out.print("age: "+x.getAge());
	            	System.out.println("======================");
	            }
	            
	         }else if(choice == 2) {
	            System.out.println("회원가입 페이지 입니다.");
	            
	            System.out.print("id를 입력하세요 :");
	            String join_id = sc.next();
	            
	            System.out.print("pw를 입력하세요 :");
	            String join_pw = sc.next();
	            
	            System.out.print("name를 입력하세요 :");
	            String join_name = sc.next();
	            
	            System.out.print("age를 입력하세요 :");
	            int join_age = sc.nextInt();
	          
	            MemberDTO mdto = new MemberDTO(join_id, join_pw, join_name, join_age);
	            
	            int row = mdao.insertMember(mdto);
	            
	            if(row>0) {
	                System.out.println("insert success");
	             }else {
	                System.out.println("insert fail");
	             }
	            
	            
	         }else if(choice == 3) {
	        	 System.out.println("회원정보 삭제 페이지 입니다.");
	             System.out.print("삭제할 id를 입력하세요 :");
	             String delete_id = sc.next();
	             
	             
	             int row = mdao.deleteMember(delete_id); // mado객체 메서드 호출
	             
	             if(row>0) {
	                 System.out.println("delete success");
	              }else {
	                 System.out.println("delete fail");
	              }
	        	 
	         }else if(choice == 4) {
	        	 System.out.println("회원정보 수정 페이지 입니다.");
	             
	             System.out.print("id를 입력하세요 :");
	             String update_id = sc.next();
	             
	             System.out.print("pw를 입력하세요 :");
	             String update_pw = sc.next();
	             int row = mdao.updateMember(update_id, update_pw);
	             
	             if(row>0) {
	                 System.out.println("update success");
	              }else {
	                 System.out.println("update fail");
	              }
	             
	         }else {
	            System.out.println("잘못 눌렀습니다!");
	         }
	      }

	}

	
	
	
	
	
	
}
