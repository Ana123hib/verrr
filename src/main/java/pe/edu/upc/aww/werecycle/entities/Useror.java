package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Useror")
public class Useror implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "userName", nullable = false,length = 50)
    private String userName;
    @Column(name = "userPassword", nullable = false,length = 50)
    private String userPassword;
    @Column(name = "userEmail", nullable = false,length = 100)
    private String userEmail;
    @Column(name = "userAge",nullable = false)
    private LocalDate userAge;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idRol")
    private List<Roles> roles;
    @OneToOne
    @JoinColumn(name = "idUbication")
    private Ubication ubicationUser;

    public Useror() {
    }

    public Useror(int idUser, String userName, String userPassword, String userEmail, LocalDate userAge, List<Roles> roles, Ubication ubicationUser) {
        this.idUser = idUser;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.roles = roles;
        this.ubicationUser = ubicationUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDate getUserAge() {
        return userAge;
    }

    public void setUserAge(LocalDate userAge) {
        this.userAge = userAge;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public Ubication getUbicationUser() {
        return ubicationUser;
    }

    public void setUbicationUser(Ubication ubicationUser) {
        this.ubicationUser = ubicationUser;
    }
}