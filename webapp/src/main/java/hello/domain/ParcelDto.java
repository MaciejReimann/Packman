package hello.domain;

import hello.model.Parcel;

public class ParcelDto implements BaseDto<Parcel> {

    private Integer id;
    private String parcelNo;
    private String address;
    private String Status;
    private String deliveryTime;
    private String eta;

    public ParcelDto() {

    }

    public ParcelDto(Parcel parcel) {
        mapFromEntity(parcel);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public BaseDto mapFromEntity(Parcel entity) {
        setId(entity.getId());
        setAddress(entity.getAddress());
        setParcelNo(entity.getParcelNo());
        setStatus(entity.getStatus());
        setDeliveryTime(entity.getDeliveryTime());
        setEta(entity.getEta());
        return this;
    }

    @Override
    public Parcel mapToEntity() {
        Parcel parcel = new Parcel();
        parcel.setId(getId());
        parcel.setAddress(getAddress());
        parcel.setParcelNo(getParcelNo());
        parcel.setStatus(getStatus());
        parcel.setDeliveryTime(getDeliveryTime());
        parcel.setEta(getEta());
        return parcel;
    }
}
