package com.webapi.project.apiproject1.dto;

import java.time.LocalDate;

public class EmployeeDTO {
   private Long id;
   private String name;
   private String email;
   private Integer age;
   private LocalDate dateOfJoining;
   private Boolean isActive;

    public EmployeeDTO(Integer age, Long id, String name, String email, LocalDate dateOfJoining, Boolean isActive) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
