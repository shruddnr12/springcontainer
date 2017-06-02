package com.jx372.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args ){
    	//testBeanFactory();
    	testApplicationContext();
    	
    }
    
    public static void testApplicationContext(){
    	//Spring MVC 에서는
    	//WebXmlApplicationContext 이다.
    	ApplicationContext ac = new ClassPathXmlApplicationContext("/config/applicationContext2.xml");
    	
    	//id로 가져오기
    	User1 user1= (User1)ac.getBean("myuser1");  // 
    	System.out.println(user1);
    	
    	
    	//name으로 가져오기
    	user1 = (User1)ac.getBean("user1");  
    	System.out.println(user1);
    	
    	//같은 타입의 빈도 생성할 수 있다.
    	//단, id로 가져와야함.
    	user1 = (User1)ac.getBean("myuser1-2");
    	System.out.println(user1);
    	
    	//tip.컨테이너는 없으면 null이 아니라 error를 발생시킨다.
    	//type으로 가져오기. 같은 빈이 생성되있다면 어느놈을 가져올지 알수 없기 때문에 NoUniqueBeanDefinitionException에러를 발생한다. 
    	//같은 type의 빈이 2개 이상 있는 경우 타입으로 받아오기는 실패한다.
    	//user1= ac.getBean(User1.class);  
    	//System.out.println(user1);
    	
    	User2 user2 = (User2)ac.getBean("user2");
    	System.out.println(user2);
    	
    	User3 user3 = (User3)ac.getBean("user3-1");
    	System.out.println(user3);
    	
    	user3 = (User3)ac.getBean("user3-2");
    	System.out.println(user3);
    	
    	User4 user4 = (User4)ac.getBean("user4");
    	System.out.println(user4);
    	

    	//DI 테스트
    	User user = (User)ac.getBean("user");
    	System.out.println(user);
    	
    	//DI 테스트
    	User usr = (User)ac.getBean("usr");
    	System.out.println(usr);
    	
    	//DI 테스트
    	User usr2 = (User)ac.getBean("usr2");
    	System.out.println(usr);
    	
    }
    
    public static void testBeanFactory(){
    	BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("/config/applicationContext1.xml") );  //클래스 path 자동 설정 하기.
    
    	//Type으로 빈 얻어오기.
    	User1 user1 = bf1.getBean(User1.class);
    	System.out.println(user1);
    	
    	//id로 빈 얻어오기.
    	
    	user1 = (User1)bf1.getBean("user1"); // 디폴트로 클래스명의 맨 앞문자를 소문자로 한다고 배웠슴. 그리고 Object형으로 반환하니까 형변환이 필요하다.
    	System.out.println(user1);
    	
    	//빈 설정인 경우에는 id를 주지 않으면 
    	//아이디를 자동으로 생성하지 않는다. 
    	BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("/config/applicationContext2.xml") );  //클래스 path 자동 설정 하기.
        user1 = bf2.getBean(User1.class);
    	System.out.println(user1);

    	user1 = (User1)bf2.getBean("myuser1"); // Bean설정을 했을 때id가 없으면 에러를 발생시킨다..
    	System.out.println(user1);
    	
    }
}
