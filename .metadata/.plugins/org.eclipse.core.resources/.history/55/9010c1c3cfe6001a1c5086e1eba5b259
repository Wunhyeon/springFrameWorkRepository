package kr.co.jaehyeon.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.jaehyeon.beans.JdbcBean;

//데이터를 가져오는 작업. MapperClass라는게 필요하다. 
//select문을 통해서 가져온 데이터를 어떤 컬럼의 값을 bean어디에 주입할 것인지 결정을 해줘야 하는데
//이 역할을 하는 클래스를 Mapper클래스라고 부른다.
//셀렉트에서 로우가 하나만 나온다고 한다면 빈객체 하나만 만들어서 직접 컬럼에서 값을 가져와서 빈에 등록해서 세팅을 한다.
//만약에 로우가 많다면, 로우하나당 빈객체하나를 만들어서 로우 하나에대한 정보를담은 빈객체를 로우개수만큼 만든 다음, 이걸 리스트에 담아서 반환하는식으로 만든다.
//이 과정을 알아서 해주는 것이 MapperClass
//할 일은 컬럼에 담겨져 있는 값을 빈의 어떤 변수에 담을 것인가 그 빈에 담는 과정만 만들어 주면 된다.
@Component
public class MapperClass implements RowMapper<JdbcBean>{

	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}

}
