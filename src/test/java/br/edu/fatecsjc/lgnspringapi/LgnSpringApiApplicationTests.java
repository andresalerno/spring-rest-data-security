package br.edu.fatecsjc.lgnspringapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LgnSpringApiApplicationTests {

	@Test
	void contextLoads() {
		// Intencionalmente vazio: o teste valida que o contexto Spring
		// sobe sem erros (wiring de beans, migrations do Flyway, etc.).
	}

}
