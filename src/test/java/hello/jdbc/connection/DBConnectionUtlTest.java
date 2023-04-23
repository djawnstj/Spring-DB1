package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

@Slf4j
class DBConnectionUtlTest {
    
    @Test
    public void connection() {
        // given
        Connection connection = DBConnectionUtil.getConnection();

        // when

        //then
        Assertions.assertThat(connection).isNotNull();
    }
    
}
