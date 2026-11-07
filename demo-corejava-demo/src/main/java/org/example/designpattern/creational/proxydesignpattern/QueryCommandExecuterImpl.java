package org.example.designpattern.creational.proxydesignpattern;

public class QueryCommandExecuterImpl implements QueryCommandExecuter {
    @Override
    public void executeQuery(String query) {
        System.out.println("query is executed in application");
    }
}
