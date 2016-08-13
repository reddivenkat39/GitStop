package git.coreBeans;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSPropBean {

	@Value("${dburl}")
	private String url;
	@Value("${uname}")
	private String uname;
	@Value("${pswd}")
	private String password;
	
	public void getConnection() throws SQLException{
		MysqlDataSource mydb = new MysqlDataSource();
		mydb.setUrl(url);
		mydb.setUser(uname);
		mydb.setPassword(password);
	}
}
