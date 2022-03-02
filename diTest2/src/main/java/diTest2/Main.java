package diTest2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		A a = ctx.getBean("getA", A.class);
		
		System.out.println(a.getField2().getField());
	}

}
