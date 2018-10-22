package sn.alien.ssealien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import sn.alien.ssealien.classes.Medecin;
import sn.alien.ssealien.dao.*;
import sn.alien.ssealien.metier.ImetierMedecin;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executor;

@SpringBootApplication
@Configuration
@EnableAsync
public class SsealienApplication  implements CommandLineRunner {

    @Autowired
    private MedecinRepository medecinRepository;


    @Autowired
    private UserRepository userRepository;



    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AssuranceRepository assuranceRepository;

    @Autowired
    private EmployeAssuranceRepository employeAssuranceRepository;

    @Autowired
    private AssureRepository assureRepository;

    @Autowired
    private BeneficiaireRepository beneficiaireRepository;

    @Autowired
    private AssistantRepository assistantRepository;

    @Autowired
    private PharmacieRepository pharmacieRepository;

    @Autowired
    private PharmacienRepository pharmacienRepository;
    @Autowired
    private TraitementRepository traitementRepository;
    @Autowired
    private MaladieRepository maladieRepository;

    @Autowired
    private ActeMedicalRepository acteMedicalRepository;


    @Autowired
    private AccidentRepository accidentRepository;


    @Autowired
    private ImetierMedecin metier;


    public static void main(String[] args) {
        SpringApplication.run(SsealienApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }

    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.initialize();
        return executor;
    }


}
