package hello.domain;

import hello.model.Client;
import hello.model.Parcel;

import java.util.ArrayList;
import java.util.List;

public class ClientDto implements BaseDto<Client> {

    private Long id;
    private String name;
    private String description;
    private String phone;
    private String from;
    private String to;
    private List<ParcelDto> parcels;

    public ClientDto() {

    }
    public ClientDto(Client c) {
        mapFromEntity(c);
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ParcelDto> getParcels() {
        return parcels;
    }

    public void setParcels(List<ParcelDto> parcels) {
        this.parcels = parcels;
    }

    @Override
    public ClientDto mapFromEntity(Client entity) {
        setId(entity.getId());
        setName(entity.getName());
        setDescription(entity.getDescription());
        setPhone(entity.getPhone());
        setFrom(entity.getFrom());
        setTo(entity.getTo());
        List<ParcelDto> parcels = new ArrayList<>();
        for (Parcel p : entity.getParcels()) {
            parcels.add(new ParcelDto(p));
        }
        setParcels(parcels);
        return this;
    }

    @Override
    public Client mapToEntity() {
        Client entity = new Client();
        entity.setId(getId());
        entity.setName(getName());
        entity.setDescription(getDescription());
        entity.setPhone(getPhone());
        entity.setFrom(getFrom());
        entity.setTo(getTo());
        return entity;
    }
}
