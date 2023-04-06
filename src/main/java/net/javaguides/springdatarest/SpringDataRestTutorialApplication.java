package net.javaguides.springdatarest;

import net.javaguides.springdatarest.entity.User;
import net.javaguides.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}
    @Autowired
	UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = User.builder()
				.firstName("Oguzhan")
				.lastName("Mavi")
				.email("oguzhanmavii98@gmail.com")
				.build();

		userRepository.save(user);


		User user2 = User.builder()
				.firstName("Elif")
				.lastName("Gul")
				.email("elifgul@gmail.com")
				.build();

		userRepository.save(user2);


		User user3 = User.builder()
				.firstName("Zeynep")
				.lastName("Ataman")
				.email("zeynepataman@gmail.com")
				.build();

		userRepository.save(user3);


		User user4 = User.builder()
				.firstName("Hakan")
				.lastName("Sari")
				.email("hakansari@gmail.com")
				.build();

		userRepository.save(user4);


		User user5 = User.builder()
				.firstName("Ali")
				.lastName("Tastan")
				.email("alitastan@gmail.com")
				.build();

		userRepository.save(user5);


	}
}
