package hello.domain;

import hello.model.Client;

public class ClientDto implements BaseDto<Client> {

    private Long id;
    private String name;
    private String address;
    private String packageId;
    private String time;
    private String description;
    private String phone;

    public ClientDto() {

    }
    public ClientDto(Client c) {
        mapFromEntity(c);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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


    @Override
    public ClientDto mapFromEntity(Client entity) {
        setId(entity.getId());
        setName(entity.getName());
        setDescription(entity.getDescription());
        setAddress(entity.getAddress());
        setPackageId(entity.getPackageId());
        setPhone(entity.getPhone());
        setTime(entity.getTime());
        return this;
    }

    @Override
    public Client mapToEntity() {
        Client entity = new Client();
        entity.setId(getId());
        entity.setName(getName());
        entity.setDescription(getDescription());
        entity.setAddress(getAddress());
        entity.setPackageId(getPackageId());
        entity.setPhone(getPhone());
        entity.setTime(getTime());
        return entity;
    }
}
