package sn.alien.ssealien.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sn.alien.ssealien.classes.Medecin;
import sn.alien.ssealien.metier.ImetierMedecin;
import sn.alien.ssealien.sendemail.SmptMailSender;

import javax.mail.MessagingException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Controller
public class MedecinController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private Executor executor;


    @Autowired
    private ImetierMedecin metier;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){

        return "index";
    }


    @RequestMapping(value = "/inscription/medecin", method = RequestMethod.GET)
    public String inscription(Model model)
    {
        model.addAttribute("medecin", new Medecin());



        return "register_medecin";
    }

    @RequestMapping(value = "/inscription/register", method = RequestMethod.GET)

    public String register()
    {
        return "register_validate";
    }

    @RequestMapping(value = "/saveMedecin", method = RequestMethod.POST)
    public String saveMedecin(Medecin medecin) throws MessagingException {


//        System.out.println("sending email-----------------");
////
////        SmptMailSender sender = new SmptMailSender(javaMailSender);
////
////        sender.send(medecin.getEmail(), "confimer", "cliquer sur le lien");
////
////        System.out.println("email succesfully sended ----------------");



        metier.ajouterMedecin(medecin);

//        System.out.println("---------------------------");
//        sendingEmail(medecin);
//        System.out.println("---------------------------");


        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------------------------");
                try {
                    sendingEmail(medecin);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
                System.out.println("---------------------------");

            }
        });




        return "redirect:/register_validate";
    }

    @Async
    void sendingEmail(Medecin medecin) throws MessagingException {

        System.out.println("sending email-----------------");

        SmptMailSender sender = new SmptMailSender(javaMailSender);

        sender.send(medecin.getEmail(), "confimer", "http://localhost:8080/validation/"+medecin.getIdMedecin());

        System.out.println("email succesfully sended ----------------");



    }










}
