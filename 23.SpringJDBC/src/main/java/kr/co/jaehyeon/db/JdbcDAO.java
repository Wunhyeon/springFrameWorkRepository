package kr.co.jaehyeon.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.jaehyeon.beans.JdbcBean;

@Component
public class JdbcDAO {
	//데이터베이스 처리에 관련된 코드
	
	//데이터베이스에 접속해서 쿼리를 전달할 객체
	//JDBC 관리 객체를 주입 받는다.
	@Autowired //BeanConfigClass에서 등록한 Bean이 반환한 것을 자동주입
	private JdbcTemplate db;
	
	//Mapper를 주입받는다.
	@Autowired
	private MapperClass mapper;
	
	//저장
	public void insertdata(JdbcBean bean) {
		String sql = "insert into jdbc_table (int_data, str_data) values (?, ?)";
		db.update(sql,bean.getInt_data(),bean.getStr_data());
		
	}
	
	//가져옴. (여기서는 모든 row를 가져올 것이기 때문에 list로 받음)
	public List<JdbcBean> select_data(){
		String sql = "select int_data, str_data from jdbc_table";
		List<JdbcBean> list = db.query(sql, mapper);
		return list;
	}
	
	//수정
	public void update_data(JdbcBean bean) {
		String sql = "update jdbc_table set str_data = ? where int_data = ?";
		db.update(sql,bean.getStr_data(),bean.getInt_data());
	}
	
	//삭제
	public void delete_data(int int_data) {
		String sql = "delete from jdbc_table where int_data=?";
		db.update(sql, int_data);
	}
}
