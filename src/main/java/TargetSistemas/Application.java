package TargetSistemas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		exerciseOne();
	}

	public static int exerciseOne(){
		int indice = 13, soma = 0, k = 0;

		while (k <indice){
			k = k+1;
			soma = soma + k;
		}
		System.out.println(soma);
		return 0;
	}







}
