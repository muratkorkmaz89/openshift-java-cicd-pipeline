package helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloWorldServiceTest {

	private HelloWorldService testee = new HelloWorldService();

	@Test
	public void shouldReturnResponse() {
		assertThat(testee.sayHello()).isEqualTo("<h1>Hello Openshift!<h1>");
	}
}
