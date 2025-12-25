package com.example.servicenotification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    // Cette méthode se déclenche automatiquement à chaque message reçu !
    @KafkaListener(topics = "commande-creee", groupId = "notification-service-group")
    public void ecouterMessage(String message) {
        System.out.println("------------------------------------------------");
        System.out.println("📧 NOTIFICATION REÇUE : " + message);
        System.out.println("------------------------------------------------");
    }
}