package com.microprofile.samples.services.book.resource;

import org.eclipse.microprofile.jwt.Claim;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class BookClaims {

    @Claim(value = "name")
    @Inject
    private String name;

    @Claim(value = "roles")
    @Inject
    private List<String> roles;


    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }
}
