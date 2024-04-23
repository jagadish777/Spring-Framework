package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // Creates a container
        // And the configuration for the container is mention in spring.xml
        // object will be created in this line
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // we are calling that object. To call methods present inside that class
        // We haven't written anything for laptop class is because it contains the laptop constructor and no other methods
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age=21;
        System.out.println(obj1.age);
        //obj.code();

        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);
        //obj.code();

        //As we can see for the above even though we created two objects the answer is printing as 21 for the both objects.
        //That is because we created object(bean) only once in the spring.xml file for alien. It goes to the same object reference.
        // For this case we use scope in spring. We use singleton and prototype mostly. By default it is singleton. Means it creates only one object for the same reference.
        // But if we want it to create different object every time we say getBean(), then we use scope="prototype" in spring.xml file.


    }
}
