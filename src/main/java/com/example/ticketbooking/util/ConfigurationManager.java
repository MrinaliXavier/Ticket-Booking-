package com.example.ticketbooking.util;


import com.example.ticketbooking.configuration.Configuration;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class ConfigurationManager {
    private static final String CONFIG_FILE = "ticket_config.json";

    public void saveConfiguration(Configuration config) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONFIG_FILE))) {
            oos.writeObject(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Configuration loadConfiguration() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONFIG_FILE))) {
            return (Configuration) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
