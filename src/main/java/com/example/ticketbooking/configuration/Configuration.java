package com.example.ticketbooking.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    private int maxTicketCapacity;
    private int totalTickets;
    private int numberOfVendors;
    private int numberOfCustomers;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
}
