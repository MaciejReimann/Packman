package hello.domain;

import hello.model.Client;

public class ClientDto implements BaseDto<Client> {

    private Long id;
    private String name;
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
        setPhone(entity.getPhone());
        return this;
    }

    @Override
    public Client mapToEntity() {
        Client entity = new Client();
        entity.setId(getId());
        entity.setName(getName());
        entity.setDescription(getDescription());
        entity.setPhone(getPhone());
        return entity;
    }
}
