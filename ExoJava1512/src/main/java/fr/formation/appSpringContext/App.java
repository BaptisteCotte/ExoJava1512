package fr.formation.appSpringContext;
import fr.formation.model.*;
import fr.formation.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan("fr.formation")
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Vehicule V = (Vehicule) context.getBean("VoitureFactory");
		System.out.println(V.getCouleur());
	}

}
