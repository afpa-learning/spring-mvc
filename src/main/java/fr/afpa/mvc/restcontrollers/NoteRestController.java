package fr.afpa.mvc.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.afpa.mvc.data.Notes;
import fr.afpa.mvc.model.Note;
import jakarta.validation.Valid;

/**
 * TODO implémentez le controller de l'API REST de gestion des notes
 * Ce contrôleur fournit une API REST minimaliste pour la gestion des objts "Note".
 * Il implémente deux "endpoints" qui vont permettre au client de :
 * - récupérer toutes les notes de la collection -> requête HTTP GET
 * - créer un nouvelle note -> requête HTTP POST
 * 
 * L'URL est "/api/notes"
 * 
 * Une la classe développée vous pourrez tester les requêtes http en utilisant un outil tel que :
 * - Insomnia (https://insomnia.rest/)
 * - Postman (https://www.postman.com/)
 * 
 * Pour apprendre à créer des endpoints d'une REST API en utilisant Springboot, vous pouvez utiliser la ressource suivant :
 * - https://medium.com/@abhinavv.singh/building-restful-apis-with-spring-boot-a-step-by-step-tutorial-with-detailed-code-e7e3372ae756
 **/
public class NoteRestController {
    private final Notes notes;

    /**
     * Constructeur avec 1 paramètre "notes".
     * @param notes Java bean auto-injecté
     */
    @Autowired
    public NoteRestController(Notes notes) {
        this.notes = notes;
    }

    /**
     * TODO implémentez la méthode permettant de renvoyer un JSON contenant les informations de toutes les notes
     * 
     * Quelques explications -> https://www.geeksforgeeks.org/spring-postmapping-and-getmapping-annotation/
     */

    /**
     * TODO implémentez la méthode permettant de créer une nouvelle note.
     * Cette méthode doit répondre à une requête http POST 
     * 
     * Attention, cas particulier : s'il manque le titre ou le texte de la note il faudra renvoyer une erreur 400 (BAD REQUEST)
     * 
     * Quelques explications -> https://www.geeksforgeeks.org/spring-postmapping-and-getmapping-annotation/
     */

}
