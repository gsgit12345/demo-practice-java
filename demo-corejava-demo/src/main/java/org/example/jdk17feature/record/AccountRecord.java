package org.example.jdk17feature.record;

public record AccountRecord(String name) implements Account,Branch{
    @Override
    public String getAccount() {
        return Account.accountName;
    }

    @Override
    public String getBranch() {
        return "janakpuri";
    }
}
