package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import static org.junit.Assert.fail;
import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
static {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public void textConnection() {
		try(Connection con=
				 DriverManager.getConnection(
						 "jdbc:oracle:thin:@localhost:1521:XE",
						 "c##himedia","himedia")){
	log.info(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}

	}

}
