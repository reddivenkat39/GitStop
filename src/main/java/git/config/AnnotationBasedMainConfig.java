package git.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import git.coreBeans.DataSPropBean;

@Import({DataSPropBean.class})
public class AnnotationBasedMainConfig {

	@Bean
    public DataSPropBean dbsrc()
    {
		return new DataSPropBean();
    }
}
