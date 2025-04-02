package com.ufolep.polytech.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.ufolep.polytech.model.*;

@Controller
public class WebSocketController {

    // Lorsque le client envoie un message à /app/newScore,
    // cette méthode est appelée et le résultat est diffusé sur /topic/scores.
    @MessageMapping("/newScore")
    @SendTo("/topic/scores")
    public ScoreMessage handleNewScore(ScoreMessage message) {
        // Ici, tu peux ajouter de la logique (validation, enregistrement en base, etc.)
        return message;
    }
}
