package fr.afpa.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale du projet.
 * TODO ajouter l'annotation @SpringBootApplication à la classe
 * 
 * Cette annotation est FONDAMENTALE pour activer la recherche automatique des beans dans les différents packages de l'
 * 
 * Documentation -> https://medium.com/@boris.alexandre.rose/springbootapplication-ab08032a7049
 * 
 */
public class MvcApp {
    public static void main(String[] args) {
        SpringApplication.run(MvcApp.class, args);
    }
}
