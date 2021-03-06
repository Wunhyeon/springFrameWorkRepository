package kr.co.jaehyeon.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.jaehyeon.beans.JdbcBean;
import kr.co.jaehyeon.config.BeanConfigClass;
import kr.co.jaehyeon.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//dao를 가져온다.
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
		
		/* INSERT */
//		//저장할 데이터를 담을 빈객체
//		JdbcBean bean1 = new JdbcBean();
//		bean1.setInt_data(1);
//		bean1.setStr_data("문자열1");
//		dao.insertdata(bean1);
//		
//		JdbcBean bean2 = new JdbcBean();
//		bean2.setInt_data(2);
//		bean2.setStr_data("문자열2");
//		dao.insertdata(bean2);
//		
//		System.out.println("저장완료");
		
		/* UPDATE */
//		JdbcBean bean4 = new JdbcBean();
//		bean4.setInt_data(1);
//		bean4.setStr_data("문자열 3");
//		dao.update_data(bean4);
		
		/* DELETE */
		dao.delete_data(1);
		
		/* SELECT */
		List<JdbcBean> list = dao.select_data();
		
		for(JdbcBean bean3 : list) {
			System.out.printf("int_data : %d\n", bean3.getInt_data());
			System.out.printf("str_data : %s\n", bean3.getStr_data());
			System.out.println("---------------------------------");
		}
		
		ctx.close();

		
	}

}
