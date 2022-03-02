package diTest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {

	@Bean
	public B getB() {
		
		B b = new B();
		b.setField("class를 이용하여 b객체 생성");
		
		return b;
	}
	
	@Bean
	public A getA() {
		
		A a = new A();
		
		a.setField1("class를 이용하여 a객체 생성");
		a.setField2(getB()); // setter주입 발생!
		
		return a;
	}
	
	
}
