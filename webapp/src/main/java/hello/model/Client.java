package hello.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client implements BaseEntity {

    @Id
    @SequenceGenerator(sequenceName = "client_seq", name="client_seq_id", initialValue = 10, allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq_id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "phone")
    private String phone;

    @Column(name = "bfr")
    private String bfr;

    @Column(name = "time_from")
    private String from;

    @Column(name = "time_to")
    private String to;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER)
    private List<Parcel> parcels;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public String getBfr() {
        return bfr;
    }

    public void setBfr(String bfr) {
        this.bfr = bfr;
    }

    public Integer getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
