package com.fundoonotes.dto;

public class UserResponse {
    private Long id;
    private String firstName;
    private String email;
    private String message;

    public UserResponse(Long id, String firstName, String email, String message) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.message = message;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }
    public String getMessage() { return message; }
}
