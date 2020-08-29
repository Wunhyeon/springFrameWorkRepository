package kr.co.jaehyeon.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.co.jaehyeon.beans","kr.co.jaehyeon.db"})
public class BeanConfigClass {

	//DataSource
	@Bean
	public BasicDataSource source() {
		//데이터 소스(접속 정보를 가지고 있는 객체 -DBCP)
		BasicDataSource source = new BasicDataSource();
		//데이터베이스 접속정보
		//jdbc드라이버 클래스 이름
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		//url
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		source.setUsername("scott");
		source.setPassword("tiger");
		
		return source;
		
	}
	
	
	//데이터베이스에 접속해서 쿼리를 전달하는 빈을 등록한다.
	@Bean	//외부라이브러리에 있는 클래스들을 bean으로 등록할 때는 configuration파일에서 bean어노테이션을 등록해주고, 직접 만드는 클래스를 등록할 때는 component
	public JdbcTemplate db(BasicDataSource source) {	//이렇게 매개변수에 넣어주면 이 bean이 등록이 될 때, 이 매개변수 타입으로 등록되어 있는 bean의 주소값을 받아서 자동으로 주입된다. 
		JdbcTemplate db = new JdbcTemplate(source);
		
		return db;
	}
}
