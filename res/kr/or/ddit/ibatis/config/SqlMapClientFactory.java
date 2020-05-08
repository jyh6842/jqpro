package kr.or.ddit.ibatis.config;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientFactory {

	private static SqlMapClient smc;

	static {

		Charset charSet = Charset.forName("UTF-8");
		Resources.setCharset(charSet);

		try {
			Reader reader = Resources.getResourceAsReader("kr/or/ddit/ibatis/config/SqlMapConfig.xml");
			smc = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			System.out.println("연결에 실패하였습니다.");
			e.printStackTrace();
		}

	}

	public static SqlMapClient getInstance() {
		return smc;
	}

}
