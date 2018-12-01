package hello.model;


import javax.persistence.*;

@Table(name = "parcel")
@Entity
public class Parcel implements BaseEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name ="client_id", nullable = false)
    private Client client;

    @Column(name = "parcel_no")
    private String parcelNo;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private String Status;

    @Column(name = "delivery_time")
    private String deliveryTime;

    @Column(name = "eta")
    private String eta;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
