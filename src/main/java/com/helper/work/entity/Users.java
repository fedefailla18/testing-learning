package com.helper.work.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Comparable<Users> {

    @Id
    @Column
    private long id;

    @Column
    @NotNull(message="{NotNull.User.firstName}")
    private String firstName;

    @Column
    @NotNull(message="{NotNull.User.lastName}")
    private String lastName;

    @Column
    @NotNull(message="{NotNull.User.email}")
    private String email;

    @Override
    public int compareTo(Users o) {
        return (this.firstName.equals(o.getFirstName()) &&
                this.lastName.equals(o.getLastName()) &&
                this.email.equals(o.getEmail())) ? 0 : 1;
    }
}

