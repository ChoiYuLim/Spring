package mybatis;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Config {
    private SqlSession sqlSession;

    public Config() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream;

            inputStream = Resources.getResourceAsStream(resource);

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            sqlSession = sqlSessionFactory.openSession(); // SqlSessionFactory야, 세션을 줘!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }
}
