package diTest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {

	@Bean
	public B getB() {
		
		B b = new B();
		b.setField("class�� �̿��Ͽ� b��ü ����");
		
		return b;
	}
	
	@Bean
	public A getA() {
		
		A a = new A();
		
		a.setField1("class�� �̿��Ͽ� a��ü ����");
		a.setField2(getB()); // setter���� �߻�!
		
		return a;
	}
	
	
}
