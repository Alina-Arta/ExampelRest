package com.example.rest_example.service;

import java.util.List;

import com.example.rest_example.model.Client;

public interface ClientService {

    void creat(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
