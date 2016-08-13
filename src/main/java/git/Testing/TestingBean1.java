package git.Testing;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import git.config.AnnotationBasedMainConfig;
import git.coreBeans.DataSPropBean;

public class TestingBean1 {
public static void main(String[] args ){
	AnnotationConfigApplicationContext contxt = new AnnotationConfigApplicationContext(AnnotationBasedMainConfig.class);
	DataSPropBean dsp = (DataSPropBean)contxt.getBean("dbsrc");
	try {
		dsp.getConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	contxt.close();
}
}
