package kr.co.jaehyeon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.jaehyeon.beans.JdbcBean;

public interface MapperInterface {
	
	//매퍼클래스의 역할을 해준다.(어떤 컬럼의 값을 빈의 어디에다가 넣을것인지)
//	@Results({
//		@Result(column="int_data", property="int_data"),	//int_data컬럼의 데이터 값은 지정된 빈의 int_data에다가 넣겠다.
//		@Result(column = "str_data", property = "str_data")
//	})
	@Select("select int_data, str_data from jdbc_table")	//쿼리문
	List<JdbcBean> select_data();	
	//이 쿼리문을 실행하기 위해 사용할 메서드를 추상메서드로 정의해줌. 이 메소드를 호출하면 위의 쿼리문이 실행된다.
	//그래서 JdbcBean객체가 만들어져서 JdbcBean안에 각각의 속성을 넣어준다.
	
	//bean의 변수의 이름과 column의 이름을 동일하게 맞췄다면 
	//만약에 셀렉트에서 가져온 결과에 컬럼의 이름과 빈의 변수의 이름(프로퍼티의 이름)이 동일하면 일대일 매칭시켜서 알아서 주입을 해준다.
	//그래서 컬럼의 이름과 프로퍼티의 이름이 같은 것들은 그냥 생략을 하고, 다른 것들(빈의 변수의 이름과 컬럼의 이름이 다른것들)만 Results에 넣어주면
	//다른 것들은 Result를 보고 주입해주고, 명시가 안되어 있는 것들은 컬럼의 이름과 빈의 변수의 이름이 동일한 것들을 일대일 매칭시켜서 주입해준다.
	
	
	@Insert("insert into jdbc_table (int_data, str_data) values (#{int_data}, #{str_data})")		//bean객체에 들어있는 프로퍼티의 값을 넣어준다.
	void insert_data(JdbcBean bean);	//이 매개변수에 있는 bean객체의 변수를 #{}에 연결시켜준다. 

	@Update("update jdbc_table set str_data = #{str_data} where int_data = #{int_data}")
	void update_data(JdbcBean bean);
	
	@Delete("delete from jdbc_table where int_data = #{abc}")	//쿼리문에 바인딩할 값이 하나만 있다고 한다면, #{}자리에 아무거나 써도 된다. 매개변수로 넘어오는 값이 객체가 아니라 정수값, 실수값 이런거라고 한다면 이 값을 한군데 주입될 수 있게 해주면 되는데 이름을 아무렇게나 지정해줘도 된다.
	void delete_data(int int_data);

}
